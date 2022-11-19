# Projeto do curso Padrões de Projeto
## 19/11/2022 [Mentoria #1: Venilton FalvoJr](https://web.dio.me/lab/explorando-padroes-de-projetos-na-pratica-com-java/learning/dbad4e6b-fc8e-4215-b305-435b0ad652c1)

## Singleton
Permitir a criação de uma única instância de uma classe e fornecer um modo para recuperá-la para utilização posterior evitando alocação de memória desnecessária.
Neste caso usei os conceitos @Autowired que por padrão é sempre um Singleton na criação de minha classe do Springboot

## Strategy
Tem a função de simplificar a variação de algoritmos para a resolução de um mesmo problema através de uma interface.
Para Stragety @Service e @Repository  

## Facade
Tem como essência prover uma inteface que reduza a complexidade nas integrações com os subsistemas ou sistemas/api que tenha uma complexidade mais elevada consumindo os seus recursos com mais simplicidade. 
Para Facade construí uma API Rest para abstrair a complexidade das seguintes integrações 
- Spring Data JPA
- ViaCep(Feign).
- OpenAPI Swagger

## O projeto
Este projeto realiza cadastro de cliente com seu endereço, caso o cliente não possua um endereço, basta apenas informar o CEP, a API irá consumir os dados do ViaCep retornando todos os dados do CEP informado.

### Imagens da Documentação Swagger
#### EndPoints
![alt text](https://github.com/sufurujhin/imagens/blob/efa3b84e08dd94478c7d02f7f7f5ad304e3e7fc6/Padroes%20de%20projeto%20imagem%201.png)

#### Cadastrando Cliente sem endereço
![alt text](https://github.com/sufurujhin/imagens/blob/efa3b84e08dd94478c7d02f7f7f5ad304e3e7fc6/Padroes%20de%20projeto%20imagem%203%20post.png)

#### Consultando Clientes
![alt text](https://github.com/sufurujhin/imagens/blob/efa3b84e08dd94478c7d02f7f7f5ad304e3e7fc6/Padroes%20de%20projeto%20imagem%202.png)

##### Página Swagger ao executar API
http://localhost:8080/swagger-ui.html#
