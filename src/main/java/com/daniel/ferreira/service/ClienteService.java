package com.daniel.ferreira.service;

import com.daniel.ferreira.model.Cliente;

/*
 * Interface que define o padrão <b>Strategy</b> no dominio do cliente. Com isso, podemos ter 
 * multiplas implementaçoes dessa mesma interface.
 * 
 * @Autor Daniel
 * */
public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorID(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);
}
