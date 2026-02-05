<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">

</head>
<body>

<h1>Contextualização</h1>

<p>
A empresa fictícia "TechStore" utiliza uma única classe, a ProcessadorDePedido,
para lidar com todo o ciclo de vida de um pedido de um cliente. Isso inclui desde a
verificação inicial do estoque, o cálculo de taxas complexas e a notificação de
sistemas externos (como o gateway de pagamento e o sistema de logística).
</p>

<p>
O time de desenvolvimento percebeu que esta classe é a mais instável do sistema:
qualquer mudança na regra de frete, no parceiro de pagamento ou na lógica de
notificação obriga a alterá-la, gerando alto risco de quebrar o fluxo de pagamento.
</p>

<h1>Por que a separação de responsabilidades é crucial</h1>

<p>
A separação de responsabilidades é fundamental para a manutenção de qualquer sistema. Ela faz parte dos princípios do S.O.L.I.D, especificamente do Single Responsibility Principle (SRP), representado pela letra S, e tem como objetivo garantir que cada classe tenha apenas um único motivo para mudar.

Esse princípio é de grande importância porque reduz o impacto das mudanças ao longo do tempo, facilitando a manutenção e o trabalho de todos os desenvolvedores envolvidos no projeto. Em sistemas reais, como um e-commerce, regras de estoque, pagamento, frete e integração com sistemas externos evoluem de forma independente e por motivos distintos. Agrupar todas essas responsabilidades em uma única classe cria um forte acoplamento e aumenta a complexidade do código.

Quando todas essas responsabilidades estão concentradas em uma única classe, qualquer alteração, mesmo que pequena, pode gerar efeitos colaterais em partes críticas do sistema, comprometendo sua estabilidade e aumentando o risco de falhas futuras.
</p>



</body>
</html>

