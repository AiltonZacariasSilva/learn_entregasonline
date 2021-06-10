package com.empresa.entregasonline.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
//@Getter
//@Setter
@Entity
public class Cliente {

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Usar a forma nativa do DB
	private Long Id;

	@NotBlank
	@Size(max = 60)
//	@Column(name = "nome") // Quando o nome do campo for diferente.
	private String nome;

	@NotBlank
	@Size(max = 255)
	private String email;

	@NotBlank
	@Size(max = 20)
	private String telefone;

}
