package com.generation.lojadegames.repository;

//Na Camada Repository será criada a Interface UsuarioRepository (com a capacidade de se comunicar com o banco de dados MySQL).
//Na Interface UsuarioRepository vamos adicionar o Método de busca específica:
//findByUsuario() com a função de trazer um usuário específico pelo e-mail (conteúdo do atributo usuário, da Model Usuario).

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.lojadegames.model.Usuario;

@Repository
public interface  UsuarioRepository extends JpaRepository <Usuario, Long>{
	
	//public List <Usuario> findAllByNomeContainingIgnoreCase(String usuario);
	
}

