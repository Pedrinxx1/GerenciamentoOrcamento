<div align="center">
  <strong>Centro Universitário do Planalto Central Apparecido dos Santos - UNICEPLAC</strong><br>
  <strong>CURSO DE ENGENHARIA DE SOFTWARE</strong><br><br><br>
  <strong>Alexsander Sávio Santana da Silva</strong><br>
  <strong>Gabriel Santos Araújo</strong><br>
  <strong>Geovana Rosal Torres</strong><br>
  <strong>Gustavo Viana Pereira</strong><br>
  <strong>Heitor Rocha Moreira</strong><br>
  <strong>Kaio Rauan da Silva Matias</strong><br>
  <strong>Lara Isabela Lima Serra</strong><br>
  <strong>Letícia Liz Benigno da Silva</strong><br>
  <strong>Pedro Henrique Eduardo Ribeiro Costa</strong><br><br><br>
  <strong>SISTEMA GERENCIADOR DE ORÇAMENTO PESSOAL</strong><br><br><br>
  <strong>Professor: Hudson Neves e Silva<br><br><br>
  Gama - DF<br>
  2026
</div>

---

## Olá! Bem-vindo ao nosso projeto
Lidar com o próprio dinheiro nem sempre é fácil, não é mesmo? Pensando nisso, nossa equipe desenvolveu este **Gerenciador de Orçamento Pessoal**. O objetivo principal é tirar o controle financeiro do papel (ou de planilhas complexas) e trazer para um sistema simples e direto rodando no console.

Com ele, você pode registrar sua renda do mês, ir adicionando seus gastos e, no final, o sistema te mostra de forma clara para onde o seu dinheiro está indo, calculando automaticamente as porcentagens de cada categoria de gasto.

---

## O que o sistema faz?
Criamos algumas funcionalidades essenciais para facilitar o dia a dia:
- **Definição de Renda:** Você diz ao sistema quanto tem disponível no mês.
- **Cadastro de Despesas:** Dá para registrar cada gasto e separá-los por categorias (como Alimentação, Lazer, Contas, etc).
- **Resumo Financeiro:** O sistema faz a matemática chata para você, mostrando o total gasto e quanto sobrou (saldo final).
- **Análise Percentual:** Mostra de forma detalhada qual categoria consumiu a maior fatia do seu orçamento.
- **Sistema à prova de falhas:** Colocamos proteções (tratamento de erros) para o programa não quebrar se alguém digitar uma letra no lugar de um número ou tentar colocar um valor negativo.

## Como construímos isso por baixo dos panos?
Esse projeto foi um ótimo laboratório para colocarmos a mão na massa com programação. Aqui estão as tecnologias e conceitos que utilizamos:
- **Linguagem Java SE:** A base de todo o nosso código.
- **Orientação a Objetos (POO):** Separamos o código em partes lógicas, criando as classes `Despesa` e `GerenciadorFinanceiro` para manter tudo organizado e seguro (encapsulado).
- **ArrayLists:** Usamos listas dinâmicas para guardar as informações das despesas na memória enquanto o programa está rodando.
- **Scanner & Loops:** Para criar o menu interativo no console e garantir uma navegação fluida para o usuário.

## Quer testar? Veja como executar:
Se quiser rodar o nosso projeto na sua máquina para testar, é super simples. Basta seguir os passos:
1. Faça o clone deste repositório para o seu computador.
2. Abra o **Eclipse** e importe a pasta do projeto.
3. Procure o arquivo principal chamado `Main.java` (ele fica dentro do pacote `model`, na pasta `src`).
4. Clique com o botão direito no código e rode como uma **Java Application**.
5. Pronto! O menu vai aparecer no console e você já pode começar a usar.

# Conclusão
Desenvolver esse gerenciador foi uma experiência incrível para a nossa equipe. Conseguimos transformar a teoria vista nas aulas em uma ferramenta funcional e útil para o cotidiano, consolidando nossos conhecimentos em Java e boas práticas de programação.
