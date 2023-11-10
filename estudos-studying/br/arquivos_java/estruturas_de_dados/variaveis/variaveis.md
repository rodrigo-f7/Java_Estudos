# Tipos Primitivos

Antes de falar sobre os tipos primitivos, é importante entender a diferença entre os dados e as informações. Os dados são elementos brutos, sem processamento e formatação. Já uma informação é um dado processado, analisado e de onde pôde-se inferir novos conteúdos. Por exemplo, o dia 25 de dezembro é um dado puro, agora dizer que nesse dia é o Natal se consolida como uma informação, pois podemos extrair novos elementos a partir de um dado. Isso ocorre muito frequentemente com as variáveis, nesse caso poderíamos dizer que Natal = "25/12". 
Outro exemplo é quando observamos o nosso peso. Você se pesa em cima da balança e vê um número. Esse número por si só não tem significado, mas, quando você analisa o contexto em que está inserido, pode-se deduzir que ele é o seu peso, criando-se uma informação. 
Na resolução dos problemas, portanto, trabalhamos veementemente com esses conceitos. Esses dados, entretanto, de onde se podem retirar informações, possuem seus devidos tipos na computação. Esses tipos de dados são Literais ou Caracteres, Booleanos, Inteiro e Real.

## Literais

Também chamados em inglês como Strings, são cadeias de caracteres. São representados normalmente por mensagens ou dados formatados, envolvidos por aspas duplas ou únicas. Exemplos são: "Rodrigo", "Fruta", "Nome", "Digite o seu nome: ", "O valor foi: 12", "90". Vêm frequentemente acompanhados de variáveis para armazenar seus valores, sobre as quais serão tratadas mais adiante:

* formaDePagamento = "cartão";
* ocupacao = "Gerente";
* CPF = "321.097.245-90";
* nome = "Rodrigo";


## Booleanas 

O tipo booleano diz respeito a valores lógicos como verdadeiro ou falso, 0 ou 1, true ou false.
Exemplos:

* temCartao = true;
* ignicao = 1;
* condicao = verdadeiro;

## Números

Os tipos relativos a números se dividem em dois: inteiros e reais.

### Inteiros

São números sem casas decimais, pertencentes ao conjunto dos números inteiros (negativos, nulo e positivos).
Exemplos:

* num1 = 27;
* quantidade = 12;
* peso = 70;
* minutos = 45;

### Reais

Nesse caso, são compostos pelos números do conjunto dos números reais. Ou seja, incluem números inteiros, racionais como frações, números decimais, etc., e irracionais.

* altura = 1.75;
* pi = 3.1415;
* divida = 290.21;
* distancia = 72.32;

# Variáveis e Constantes

As variáveis são dados que podem ser alterados, armazenados temporariamente no endereço da memória RAM do computador rotulados por um nome. Para visualizar seu conteúdo, basta utilizar uma instrução de saída para exibir o valor da variável.
Exemplo: 

* nomeDoCliente = "João Faria";
* num_do_cliente = 231453456;
* numerodetelefone = 54985342110;
* email = "teste@123.com.br"

A estrutura das variáveis é a seguinte: primeiro é declarado o seu tipo, dependendo do tipo de linguagem que você utiliza (Java precisa declarar seu tipo, já Python não precisa); segundo lugar define-se o seu nome antes do sinal de atribuição (normalmente "="); depois do sinal de atribuição é digitado o conteúdo da variável, que pode ser todos os tipos já citados.

Vale ressaltar que, uma vez que são **variáveis**, podem ter seus dados modificados. Diferente desses locais de armazenamento, existem também as constantes, que não podem ter seu valor alterado.

# Tipos Primitivos e Variáveis em Java

## Tipos Primitivos

Os tipos primitivos de dados no Java são: int, String, char, long, double, float, boolean, short e byte.
Os dois últimos são poucos utilizados.

### Números Inteiro
As variáveis de tipo inteiro são: 

* byte: é um tipo de dado que recebe números de 0 a 127 e de 0 a -128.
* short: sua faixa chega a aproximadamente 32000, com seu respectivo equivalente no negativo.
* int: vai até aproximadamente 2 milhões.
* long: vai até 9 quintilhões.

### Números Ponto Flutuante
Já as variáveis que podem receber valores decimais, ou seja, de ponto flutuante, são: 

* float, precisão de 6 a 7 dígitos
* double, precisão de 15 dígitos

Ambas aceitam números absurdamente grandes

Desses relacionados a números, mais frequentemente se utiliza int e double no Java.

Um ponto interessante utilizando o float e o long é que depois de declarar a variável, é necessário adicionar um F, de float, ou um L, de long, no final do número dependendo do tipo selecionado. Na pasta "conteudos", existem exemplos tratando sobre isso.

### Gerais
Existem também os String, os literais já citados, que são conjuntos de caracteres. 
Os char, os quais representam somente um único caracter.
E o boolean, que aceita valores true ou false

## Declaração de variáveis

Para realizar a declaração de variáveis em Java, é realizado da seguinte maneira:

`tipo nomedavariável = conteudo`

O Java é uma linguagem fortemente e estaticamente tipada, por isso é necessário que as variáveis possuam seus tipos declarados antes de sua definição e nunca possuam valores diferentes de sua declaração. Por exemplo 