# 💡 Java Design Patterns

Este repositório contém **exemplos resolvidos** de oito dos principais **Padrões de Projeto de Software**, todos implementados em Java 🧩. Os desafios foram baseados em diferentes problemas reais simulados para facilitar o aprendizado e aplicação prática de cada padrão.

---

## ✅ Padrões implementados

### 1. 🧬 Prototype (Protótipo)

📌 **Missão:** Criar uma classe `Enemy` e gerar cópias (clones) dos inimigos usando o padrão Prototype.

- Interface `EnemyPrototype` com o método `clone()`
- Classe concreta `Enemy` com 5 atributos
- Método `clone()` que retorna uma nova instância com os mesmos dados
- Classe `EnemyFactory` que armazena protótipos e gera clones com facilidade
- Testado via classe `Main`, clonando inimigos e exibindo seus atributos e ataques

🔁 **Problema resolvido:** Evitar a criação manual de muitos objetos semelhantes, permitindo clonar inimigos com facilidade e eficiência.

---

### 2. ☕ Template Method

📌 **Missão:** Criar uma estrutura de preparação de bebidas quentes, com um esqueleto de algoritmo fixo e partes variáveis.

- Classe abstrata `BebidaQuente` com o método `prepararBebida()`:
  - ferver a água
  - preparar (método abstrato)
  - servir na xícara
- Subclasses `Cafe`, `Cha` e `ChocolateQuente`, cada uma com sua forma de preparo
- Testado na classe `Main`

🧪 **Problema resolvido:** Reutilização de lógica comum ao preparar bebidas, permitindo variação apenas no que é específico de cada bebida.

---

### 3. 🕹️ Command

📌 **Missão:** Simular um botão que liga uma lâmpada usando o padrão Command.

- Interface `Comando` com o método `executar()`
- Classe `Lampada` com o método `ligar()`
- Classe `LigarLampada` implementando o comando
- Classe `Botao` com método para executar qualquer comando passado

🔘 **Problema resolvido:** Desacoplamento entre quem emite o comando (botão) e quem executa a ação (lâmpada), seguindo o princípio da inversão de controle.

---

### 4. 🚗 Factory Method

📌 **Missão:** Criar um sistema de transporte onde o Factory Method cria diferentes meios de transporte.

- Interface `Transporte`
- Classes concretas `Carro` e `Bicicleta` implementando a interface
- Classe abstrata `TransporteFactory` com o método `criarTransporte()`
- Subclasses `CarroFactory` e `BicicletaFactory` implementando a criação de objetos
- Testado na classe `Main` com criação dinâmica do transporte

🏭 **Problema resolvido:** Criação flexível e desacoplada de objetos, permitindo a adição de novos tipos de transporte com facilidade.

---

## 📂 Organização do projeto

Cada padrão está em uma pasta separada com seus respectivos arquivos `.java` e `Main.java` de teste.

---

## ✍️ Autor

Projeto desenvolvido por **Alessandra de Jesus Andrade Lemos** 🧠💻  
Estudando os fundamentos de engenharia de software com aplicação prática dos padrões de projeto.

---

## 📌 Observação

Todos os padrões foram **completamente implementados e testados**, com sucesso! 🟢

