# Sistema de Pedido (Avaliação teste e desenvolvimento de software)

Este repositório contém os arquivos de um projeto de um "Sistema de Pedido", desenvolvido como parte de uma atividade avaliativa do Professor Edilson Bitencourt, Senac / SC.

## Casos de Teste

Este projeto inclui a criação de casos de teste para diferentes níveis:

### Testes Funcionais (Selenium)

Foram desenvolvidos 3 casos de teste usando Selenium para validar o comportamento da interface web:

1.  **CT1 – Adicionar um pedido com campo “Aluno” vazio (Validação de campo obrigatório):** Verifica se o sistema impede a adição e exibe a mensagem de erro.
2.  **CT2 – Adicionar múltiplos pedidos e verificar o total do pedido:** Valida o cálculo do valor total para vários itens.
3.  **CT3 – Adicionar um único pedido e verificar se o campo “Aluno” é limpo automaticamente:** Confirma a usabilidade após a adição.

### Testes Unitários (JUnit)

Foram desenvolvidas classes Java para representar a lógica de negócio e testes unitários para ela:

* **`Pedido.java`:** Classe que modela um item de pedido individual.
    * **CT1 - `testCriacaoPedido()`:** Verifica a criação de um pedido com dados válidos, garantindo que os atributos (nome do aluno, tamanho, cor e valor) sejam armazenados corretamente.
    * **CT2 - `testCriacaoPedidoAlunoVazio()`:** Testa a validação do campo 'Aluno', esperando que uma `IllegalArgumentException` seja lançada ao tentar criar um pedido com o nome do aluno vazio.
* **`PedidoItem.java`:** Classe responsável por gerenciar uma coleção de objetos `Pedido` e calcular o valor total.
    * **CT3 - `testCalcularTotalMultiplosPedidos()`:** Verifica se o cálculo do valor total está correto ao adicionar múltiplos pedidos à lista.
