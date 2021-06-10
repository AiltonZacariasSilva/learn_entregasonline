package com.empresa.entregasonline.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@Entity
public class Cliente {

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Usar a forma nativa do DB
	private Long Id;
	
//	@Column(name = "nome") // Quando o nome do campo for diferente.
	private String nome;
	private String email;
	private String telefone;
	
}
