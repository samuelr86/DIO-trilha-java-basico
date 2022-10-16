## Palavras reservadas

A linguagem Java tem 52 palavras reservadas, organizadas por classificação de usabilidade considerando as regras de linguagem.

São identificadores de uma linguagem que já possuem uma finalidade específica, portanto não podem ser utilizados para nomear variáveis, classes, métodos ou atributos.

### Controle de pacotes
 - import: importa pacotes ou classes para dentro do código
 - package: especifica a que pacote todas as classes de um arquivo pertecem

### Modificadores de acesso
 - public: acesso a qualquer classe
 - private: acesso apenas dentro da classe
 - protected: acesso por classes no mesmo pacote e subclasses

### Primitivos
 - boolean
 - byte
 - char
 - double
 - float
 - int
 - long
 - short
 - void

### Modificadores de classes, variáveis ou métodos
 - abstract: classe que não pode ser instanciada ou método que precisa ser implementado por uma subclasse não abstrata.
 - class: especifica uma classe.
 - extends: indica a superclasse que a subclasse está estendendo.
 - final: impossibilita que uma classe seja estendida, que um método seja sobrescrito ou que uma variável seja reinicializada.
 - implements: indica as interfaces que uma classe irá implementar.
 - interface: especifica uma interface.
 - native: indica que um método está escrito em uma linguagem dependente de plataforma, como o C.
 - new: instancia um novo objeto, chamando seu construtor.
 - static: faz um método ou variável pertecer à classe ao invés de às instâncias.
 - stricttfp: usado em frente a um método ou classe para indicar que os números de ponto flutuante seguirão as regras de ponto flutuante em todas as expressões.
 - synchronized: indica que um método só pode ser acessado por uma thread de cada vez.
 - transient: impede a serialização de campos.
 - volatile: indica que uma variável pode ser alterada durante o uso de threads.

### Controle de fluxo dentro de um bloco de código
 - break: sai do bloco de código em que ele está.
 - case: executa um bloco de código dependendo do teste de switch.
 - continue: pula a execução do código que viria após essa linha e vai para a próxima passagem de loop.

### Exceções
 - catch: declara o bloco de código usado para tratar uma exceção.
 - finally: bloco de código, após um try-catch, que é executado independentemente do fluxo de programa seguido ao lidar com uma exceção.
 - throw: usado para passar uma exceção para o método que o chamou.
 - throws: indica que um método pode passar uma exceção para o método que o chamou.
 - try: bloco de código que tentará ser executado, mas que pode causar uma exceção.

### Variáveis de referência
 - super: refere-se a superclasse.
 - this: refere-se a instância atual do objeto.