# Jogo da Cobrinha

Este é um simples jogo da cobrinha desenvolvido em Java usando a biblioteca Swing. O objetivo do jogo é controlar a cobrinha, coletar alimentos e evitar colisões com as paredes e com ela mesma.

## Integrantes

- Carlos Eduardo Gomes - RGM: 30220335
- Gabriel Gomes - RGM: 29832748

## Pré-requisitos

Antes de executar o jogo, você precisa ter o seguinte instalado:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) (versão 11 ou superior).
- [Maven](https://maven.apache.org/download.cgi)

## Clonando o Repositório

Clone este repositório em sua máquina local usando o seguinte comando:

```bash
git clone https://github.com/duduzgomes/snake-game
```

## Para executar o jogo

Rode o comando:

```bash
mvn compile
```

Execute o jogo:

```bash
mvn exec:java
```

## Sobre o jogo

Este é um simples jogo da cobrinha desenvolvido em Java usando a biblioteca Swing. O objetivo do jogo é controlar a cobrinha, coletar alimentos e evitar colisões com as paredes e com ela mesma.

### Tecnologias

- Java
- Java Swing
- Visual Studio Code (IDE)

### Complexidade do Jogo

A mecânica do jogo envole comer as frutas aumentando a pontuação e seu tamanho, em contrapartida o espaço disponível para movimentação reduzirá.

### Complexidade Algorítmica

- Lógica do Movimento - Constante O(1).

  A adição de um novo elemento ao final da lista e remoção é uma operação de custo constante.

- Detecção de Colisão - Linear O(n).

  O jogo verifica colisões entre a cabeça da cobra e
  as bordas do tabuleiro. Cada segmento do corpo da cobra (no pior caso, proporcional ao tamanho da cobra).

- Geração de Comida - Linear O(n).

  Para garantir que a comida não apareça na mesma posição ocupada pela cobra, houve necessidade de verificação com a lista de segmentos do corpo, o que tem custo O(n).

### Regras

- Não colidir com os limites
- A cabeça não pode colidir com o corpo

- Movimentação:

  - Para cima - tecla ↑ (seta)
  - Para baixo - tecla ↓ (seta)
  - Para direita - tecla → (seta)
  - Para esquera - tecla ← (seta)

## CheckList

**Fase 1: Análise [ ]**

- [ Carlos ] Problema selecionado e definido claramente.
- [ Gabriel ] Compreensão aprofundada da natureza e desafios do problema.
- [ Carlos ] Modelo matemático ou teórico desenvolvido para representar o problema.

**Fase 2: Planejamento [ ]**

- [ Gabriel ] Objetivos do algoritmo definidos com clareza.
- [ Gabriel ] Métricas para avaliação de eficiência do algoritmo estabelecidas.
- [ Gabriel ] Estratégia geral de resolução do problema proposta.
- [ Gabriel ] Subproblemas identificados e divididos, se aplicável.
- [ Gabriel ] Estrutura geral do algoritmo esboçada.
- [ Gabriel ] Casos limite ou situações especiais identificados.
- [ Gabriel ] Análise teórica realizada para verificar a correção do algoritmo.

**Fase 3: Desenho [ ]**

- [ Gabriel ] Análise de complexidade realizada para avaliar a eficiência teórica do algoritmo.
- [ Gabriel ] Pontos críticos do algoritmo identificados para otimização, se necessário.

**Fase 4: Programação e Teste [ ]**

- [ Carlos ] Algoritmo traduzido com precisão em código de programação.
- [ Carlos ] Código de programação escrito de forma clara e organizada.
- [ Carlos ] Testes rigorosos realizados em uma variedade de casos de teste.
- [ Carlos ] Casos limite e situações especiais testados.
- [ Carlos ] Erros e problemas durante o teste de programa identificados e corrigidos.

**Fase 5: Documentação e Avaliação do Projeto [ ]**

- [ Carlos ] Documentação completa, incluindo especificação do algoritmo e análise de complexidade.
- [ Gabriel ] Documentação revisada para clareza e rigor técnico.
- [ Carlos ] Avaliação da eficácia do algoritmo em termos de tempo de execução, uso de recursos e precisão na resolução do problema.
- [ Gabriel ] Avaliação da colaboração da equipe e cumprimento dos prazos.

## Demo

![demo](<demo/demo%20(2).gif>)

### Tempo de execução

![demo](demo/tempo-execucao.gif)
