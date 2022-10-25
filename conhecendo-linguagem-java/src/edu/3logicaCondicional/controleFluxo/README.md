# Controle de fluxo

São estrutura que tem a capacidade de direcionar o fluxo de execução do código.
Tipos de estruturas:
 - Decisão: if-else, switch e operador ternário
 - Repetição: for, while, do-while
 - Interrupção: break, continue e return

## Decisão
Estrutura que avalia uma condição booleana ou variável para direcionar o fluxo de decisão.

 - if(condição){verdadeiro}
 - if(condição){verdadeiro}else{falso}
 - if(condição){verdadeiro}else if(){falso} else{default}
 - (condição) ? \<verdadeiro> : \<falso>
 - switch(variável){ case1: verdadeiro break, case2: falso break, default: default break}

### Boas Práticas
 - switch é para valores exatos e if para expressões booleanas
 - evitar o usar o default do switch para 'casos genéricos'
 - evitar o efeito 'flecha' dos if's
 - evitar muitos if's aninhados
 - usar variáveis intermediárias para diminuir o tamanho do if



