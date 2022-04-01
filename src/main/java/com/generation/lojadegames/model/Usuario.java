package com.generation.lojadegames.model;

//A Classe Usuario criará a Tabela tb_usuarios no Banco de dados da aplicação.
//id bigint AI PK 
//usuario varchar(255) 
//nome varchar(255) 
//senha varchar(255) 
//foto varchar(255) 
//data_nascimento date

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "tb_usuarios")
public class Usuario {


		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotBlank(message = "O atributo nome é obrigatório e não pode utilizar espaços em branco!")
		@Size(min = 3, max = 100, message = "O atributo nome deve conter no mínimo 03 e no máximo 100 caracteres")
		private String nome;

		@NotNull(message = "O atributo usuário é obrigatório!")
		@Size(min = 3, max = 100, message = "O atributo usuário deve conter no mínimo 03 e no máximo 100 caracteres")
		private String usuario;
		
		@NotNull(message = "O atributo senha é obrigatório!")
		@Size(min = 3, max = 10, message = "O atributo senha deve conter no mínimo 03 e no máximo 10 caracteres")
		private String senha;
		
		@NotBlank
		private String foto;
		
		@NotBlank
		private Date data_nascimento;
		
		@JsonIgnoreProperties

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getUsuario() {
			return usuario;
		}

		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public String getFoto() {
			return foto;
		}

		public void setFoto(String foto) {
			this.foto = foto;
		}

		public Date getData_nascimento() {
			return data_nascimento;
		}

		public void setData_nascimento(Date data_nascimento) {
			this.data_nascimento = data_nascimento;
		}

		public LocalDateTime getData() {
			return data;
		}

		public void setData(LocalDateTime data) {
			this.data = data;
		}

		@UpdateTimestamp
		private LocalDateTime data;
		
		
		
}
