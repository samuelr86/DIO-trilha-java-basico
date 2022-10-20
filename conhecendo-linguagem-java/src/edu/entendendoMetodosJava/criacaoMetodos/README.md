# Entendendo métodos Java

É uma porção de código que é disponibilizada a partir de uma classe. Este é executado quando é feito uma requisição.
São responsáveis por definir e realizar um determinado comportamento.

## Criação

### Padrão de definição
 - visibilidade
    - public
    - protected
    - private
 - tipo 
    - concreto
    - abstrato
 - modificador
    - static
    - final
 - retorno (obrigatório)
    - tipo de dado(primitivos ou objetos)
    - void
 - nome (obrigatório)
 - parâmetros
    - parâmetros que pode receber
 - exceções
    - exceções que pode lançar
 - corpo (obrigatório)
    - código que possui
    - vazio
### Exemplos
public String getNome(){}
public int verificarDistancia(int coordenada1, int coordenada2){}
public abstract void executar();

### Utilização
nome_da_classe.nome_do_método();
ex.: Math.random();

### Particularidade
#### Assinatura: é a forma de identificar unicamente o método
  - nome + parâmetros

Método: public double calcularTotalVenda(double preçoItem){}
Assinatura: calcularTotalVenda(6.505);
#### Construtor e Destrutor
são método especiais usados na Orientação a Objetos

#### Mensagem
é o ato de solicitar ao método que o mesmo execute. Esta poode ser direcionada a um objeto ou a uma classe.

### Boas Práticas
 - nomes descritivos, mas curtos
 - notação camelCase
 - deve possuir entre 80 e 120 linhas
 - evite lista de parâmetros longas
 - visibilidade adequada










