# HeinikenProject

Há um Ponto de Revenda de produtos Heineken que vende três produtos: 
* Cerveja em lata Amstel por R$3,00. 
* A cerveja em lata Kaiser 473ml no valor de R$4,00;
* A Heineken Long Neck por R$6,00;

Além disso, o posto de venda oferece uma promoção que a cada R$100,00 reais em venda a próxima venda terá um desconto de 10% que não poderá exceder R$50,00, não há data de validade para acumular dinheiro na promoção. 
Além disso, o posto de revenda faz a gestão de estoque dos produtos, para isso, sempre que um produto é vendido, ele é retirado de um engradado que tem um código próprio, uma data de validade comum a todos os produtos que estão dentro do engradado e a seguinte quantidade de itens para cada tipo de engradado: 
* Amstel, 12 por engradado;
* Kaiser, 6 unidades por engradado;
* Heineken Long Neck, 4 unidades por engradado;

Uma vez aberto um engradado ele deverá ter todos os seus itens vendidos para se abrir o próximo, quando a quantidade de engradados de qualquer produto for igual ou menor a cinco, o ponto de revenda deve fazer o pedido para a fábrica de um novo engradado pelo preço de:
* Engradado de Cerveja em lata Amstel por R$18,00. 
* Engradado de cerveja em lata Kaiser 473ml no valor de R$12,00;
* Engradado de Heineken Long Neck por R$24,00;

Faça uma API capaz de efetuar e registrar uma venda, bem como, consiga administrar o estoque e o saldo

### US-01 Comprar Produto
**Como** Ponto de Revenda

**Quero** Poder Efetuar a compra dentro do sistema

**Para** Tornar a administração do saldo mais fácil e estoque mais fáceis

Critérios de Aceite:
Deve ser possível para o cliente escolher a quantidade e produtos desejados
Deve, caso a quantidade de um produto em específico escolhido pelo cliente exceda o disponível, toda a operação deve ser cancelada e uma mensagem de erro deve ser mostrada
* Deve retornar o valor total da compra
* Deve registrar a compra no banco de dados com o número de CPF do cliente
* Deve Aumentar no Saldo do Ponto de Venda no valor da compra

### US-02 Diminuição do Estoque Após a venda
**Como** ponto de Revenda
**Quero** que após a venda de um produto a quantidade do produto seja diminuída do estoque
**Para** Administrar o estoque de forma automática

Critérios de Aceite:
* Deve diminuir a quantidade de produtos de um estoque após a compra
* Ao terminar o engradado de um determinado produto, deve selecionar o próximo engradado e abri-lo por ordem de data

### US-03 Pedido para a fábrica
**Como** Ponto de Revenda
**Quero** que quando a quantidade de engradados de um produto disponível for igual ou menor que cinco, o sistema faço o pedido de mais um engradado para a fábrica
**Para** ter o sistema de gerenciamento de estoque e pedidos da fábrica automatizado
Critérios de Aceite:
* Deve aumentar o estoque do determinado produto em um engradado
* Deve diminuir o saldo do ponto de Revenda no valor do pedido


### US-04 Promoção do Cliente
Como Ponto de Revenda
Quero que ao fazer uma compra o determinado cliente acumule os pontos da compra
Para quando ele acumular os pontos necessários, poder receber o desconto da promoção
Critérios de Aceite:
* Deve ao efetuar a compra registrar os pontos ganhos da compra
* Deve, ao alcançar o valor da promoção, aplicar o desconto de 10% (com o limite de R$50,00) na próxima compra do cliente

