# Ao Infinito e Além
  Este projeto foi criado apenas com finalidades educacionais, para exemplificar o uso do Builder Pattern em Java, como parte do 
nivelamento de conhecimento em Design Patterns, realizado por nosso time de desenvolvimento.

## Builder Pattern em Java

### O que é o Builder Pattern?
Introduzido para resolver o problema de construção de objetos complexos, com muitos atributos utilizando o Factory ou
AbstractFactory, o Builder Pattern é um padrão de projeto de software que permite a criação de objetos complexos passo a passo. 
Ele também permite a criação de diferentes tipos e representações de um objeto usando o mesmo código de construção.

1. Muitos argumentos passados por um programa cliente para a classe Factory pode causar problema porque na maioria das vezes
os argumentos são os mesmos e do lado do cliente é difícil de entender a ordem dos argumentos.
2. Alguns dos parâmetros podem ser opcionais, o que significa que o cliente pode não querer passar todos os argumentos.
3. Se o objeto for pesado e sua criação complexa, então toda essa complexidade fará parte das classes Factory que são confusas.

### Como implementar

1. Crie uma classe estática interna que representa o objeto que você deseja construir.
2. Adicione atributos à classe interna para representar os atributos do objeto que você deseja construir.
3. Adicione métodos setter à classe interna que definem os valores dos atributos do objeto que você deseja construir. 
  - O método setter pode ter outros prefixos diferentes do set, como with, por exemplo.
  - O método setter deve retornar a instância da classe interna para permitir a chamada encadeada.
4. Adicione um método build() à classe interna que cria um objeto do tipo desejado e o retorna.
5. Adicione um método estático à classe externa que retorna uma instância da classe interna.
6. Chame os métodos setter na instância da classe interna e, finalmente, chame o método build() para obter o objeto desejado.
7. Opcionalmente, você pode adicionar métodos de validação à classe interna para garantir que os valores dos atributos sejam válidos.
8. Opcionalmente, você pode adicionar métodos de inicialização à classe interna para definir valores padrão para os atributos.


