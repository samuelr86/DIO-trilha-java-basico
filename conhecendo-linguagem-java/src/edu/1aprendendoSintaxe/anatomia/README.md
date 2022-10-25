## Anatomia de classes - 2

### arquivo.java
Todo arquivo .java deve começar com letra MAIÚSCULA. Se a palavra for composta, a segunda palavra deve também ser maiúscula.

### nome da classe
A classe deve possuir o mesmo nome do arquivo.java

### nome de variável
Toda variável deve ser escrita com letra minúscula, se for composta a segunda palavra inicia com letra maiúscula. O nome dessa prática é camelCase.

Quando essa variável for uma constante o nome dela deve ser toda em MAIÚSCULA, e para garantir que ela não será mudada usamos a palavra chave 'final'.

E para palavras compostas ligadas por underline('_').

#### nomeação de variável
 - deve contar letras, _ (underline) ou números de 0 a 9.
 - deve obrigatoriamente iniciar com letra, _ ou $.
 - iniciar com letra minúscula.
 - não pode conter espaços.
 - não usar palavras chaves da linguagem.
 - deve ser único dentro do escopo.


## Anatomia das classes - 3

### Declarando métodos

Segue a seguinte estrutura:

 - Tipo nomeBemDefinido = Atribuição;

ex.: int idade = 36;

Pode ser string, int ou boolean por exemplo.

### Declarando Métodos

 - TipoRetorno NomeObjetivoNoInfinitivo (Parametros p)

ex.: String formatarCep (Long cep)

## Anatomia de classes - 4 

### Identação

É um termo utilizado para escrever um código de forma hierárquica.

## Anatomia de classes - 5

### Organizando arquivos

A medida que o sistema vai evoluindo, surgem novos arquivos. Isso exige que seja realizado uma organização destes arquivos através de pacotes(packages).

### Sub pacotes

As empresas tem segmentos e as abreviaturas desses segmento identificam o inicio do pacotes

com -> comercial
org -> organizacional
edu -> educacional

ex.: Empresa HyperTech
pacote -> com.hypertech.notification

segmento.nome-empresa.nome-projeto.nome-pacote

## Anatomia de Classes - 6

### Java Beans

É uma iniciativa conceitual para que nós possamos ter uma estruturação de escrita, como expressamos as declarações de nossas variáveis, métodos, atributos etc.

Convensões Comunidade Java

#### Variáveis

 - uma variável dever ser clara, sem abreviação ou definição sem sentido.
 - é sempre no singular, exceto quando for Array ou Coleção
 - defina idioma único para o nome de suas variáveis.

#### Métodos 

 - devem ser nomeados como verbos no infinitivo, através de uma mistura de letras maiúsculas e minúsculas. Estilo CamelCase.

