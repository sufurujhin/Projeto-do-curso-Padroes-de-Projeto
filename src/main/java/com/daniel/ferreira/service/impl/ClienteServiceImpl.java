package com.daniel.ferreira.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.daniel.ferreira.model.Cliente;
import com.daniel.ferreira.model.Endereco;
import com.daniel.ferreira.repository.ClienteRepository;
import com.daniel.ferreira.repository.EnderecoRepository;
import com.daniel.ferreira.service.ClienteService;
import com.daniel.ferreira.service.ViaCepService;

import ch.qos.logback.core.joran.spi.NoAutoStart;

/*
 * Implementação da <b>Strategy</b> {@link ClienteService}, a qual pode ser injetada pelo Spring(Via {@link Autorired}). Com isso,
 * como essa classe é um {@link Service}, ela será trataa como um <b>Singletron</b>
 * 
 * @Autor Daniel
 * */
@Component
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	@Autowired
	private ViaCepService viaCepService;

	@Override
	public Iterable<Cliente> buscarTodos() {
		// FIXME Vusca todos os clientes
		return clienteRepository.findAll();
	}

	@Override
	public Cliente buscarPorID(Long id) {
		// FIXME Buscar cliente por id
		return clienteRepository.findById(id).get();
	}

	@Override
	public void inserir(Cliente cliente) {
		salvarCLienteComCep(cliente);
	}

	private void salvarCLienteComCep(Cliente cliente) {
		// Verifica se o endereco do cliente ja existe(pelo cep)
		String cep = cliente.getEndereco().getCep();
		// orElseGet returna nulo se o endereço não existir
		Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
			// Caso não exista, integrar com o ViaCep e persistir o retorno.
			Endereco novoEndereco = viaCepService.consultarCep(cep);
			enderecoRepository.save(novoEndereco);
			return novoEndereco;
		});
		cliente.setEndereco(endereco);
		// Inserir cliente, vinculando o Endereço (Novo ou existente).
		clienteRepository.save(cliente);
	}

	@Override
	public void atualizar(Long id, Cliente cliente) {
		// Buscar o Cliente por id caso exista.
		Optional<Cliente> clienteDB = clienteRepository.findById(id);
		if (clienteDB.isPresent())
			salvarCLienteComCep(cliente);
	}

	@Override
	public void deletar(Long id) {
		// FIXME Deletar Cliente por id.
        clienteRepository.deleteById(id);
	}

}
