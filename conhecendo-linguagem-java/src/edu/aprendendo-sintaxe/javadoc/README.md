## Javadoc

### Tags

são as informações que obtemos através de classes documentadas na linguagem. JavaDoc é composto por tags que representam dados relevantes para a compreensão da proposta de uma classe e os conjuntos de seus métodos e atributos conforme abaixo:

 - \@autor: autor, criador
 - \@version: versão do recurso disponibilizado
 - \@since: versão ou data de início da disponibilização do recurso.
 - \@param: descrição do parametros dos métodos criados.
 - \@return: definição do tipo de retorno de um método
 - \@throws: se o método lança alguma exceção.

exemplo classe ./Calculadora.java

### Tipos de comentários

Atualmente temos três tipos de comentários: One line, Multi line e Documentation.
Os comentários não são compilados pela JVM

 - one line: insere uma única linha
 - mult line: insere várias linha, para um comentário mais detalhado
 - documentation: insere linhas relacionada a documentação

### Javadoc

é um gerador de documentação criado pela Sun Microsystems para documentar a API dos programas em Java, a partir do código-fonte.
O resultado é expresso em HTML, e é constituido basicamente por algumas marcações muito simples inseridas nos comentários do programa.
Este sistema é o padrao de documentação de classes em Java, e muitas dos IDE's desta linguagem irão automaticamente gerar um Javadoc em HTML.

Para criar nossa documentação no formato HTML, precisamos digitar no terminal um comando parecido com esse:

javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/*.java