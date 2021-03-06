# Trabalho-Final-API
Projeto API ECommerce

Criar uma API de ECommerce utilizando a base de dados do ecommerce da disciplina de banco de dados atendendo aos seguintes requisitos.

Utilizar o padrão de projeto MVC e DTO
Criar as entidades (Model)
Criar os serviços (Service)
Criar os recursos (Controller) 

Funcionalidades / Requisitos:
Inserir e editar uma categoria
Consultar, Inserir e editar um produto
Ao inserir um novo produto, obrigatoriamente  deverá estar atrelado a uma categoria
Ao listar os produtos, deverá exibir a categoria referente a esse produto
Inserir e editar um cliente
Ao inserir um cliente deverá preencher o cep e consultar no serviço externo do viacep 
Ao inserir/alterar um registro de cliente deverá enviar um e-mail para o mesmo informando 
Consultar, Inserir e editar um pedido
Ao inserir um novo pedido, obrigatoriamente deverá estar atrelado a um cliente
O pedido deverá ter um status (Finalizado e não finalizado) e poderá ser alterado 
Consultar um pedido pelo número do pedido totalizando o pedido

Validações:
Cliente: 
Email
CPF
Caso utilize Enum, crie uma validação
Case tenha necessidade, crie uma classe de exception para tratamento de exceção específica

Tratamento de exceções:
Criar uma classe com anotação @ControllerAdvice para tratar o retorno de erro da API

Serviço externo:
https://viacep.com.br/ws/{cep}/json/

Documentação:
Utilizar o Swagger para documentação

Techs utilizadas: 
Projeto deverá ser criado utilizando java com spring boot

<br>

---

### _Colaboradores_

- [ANDRÉ PONTE DA SILVA](https://github.com/AndrePS2021)
- [DANIEL CESAR](https://github.com/danielcsar)
- [MARCELLA ALZUGUIR](https://github.com/MarcellaAlzuguir)
- [NÚRIA BARBOSA](https://github.com/nuriabarbosa21)



