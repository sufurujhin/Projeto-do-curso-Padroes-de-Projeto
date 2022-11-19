package com.daniel.ferreira.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/*
 * 
 * Estrutura de endereço gerada usando o json de retorno da api do Via CEP
 * @see <a href="https://www.jsonschema2pojo.org">jsonschema2pojo</a>
 * @see <a href="https://viacep.com.br">ViaCEP</a>
 * 
 * @Autor Daniel
 * */
@Data
@Entity
public class Endereco {
	
	@Id
	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String localidade;
	private String uf;
	private String ibfe;
	private String gia;
	private String ddd;
	private String siafi;
	
}
