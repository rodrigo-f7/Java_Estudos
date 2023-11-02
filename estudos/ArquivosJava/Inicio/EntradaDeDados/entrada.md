# Entrada de Dados em um Computador

O conceito da entrada de dados é simplesmente a inserção na memória do computador de alguma 
informação por meio de um periférico de entrada, por exemplo, o teclado. Esses periféricos poderiam
ser diversos, porém no caso da computação normalmente se trata do teclado.

São instruções do tipo "Leia" ou "Input"

Ex: leia Nota1, nota1 = input("Digite a nota1: ") e outras formas

Nesta pasta será visto a respeito da entrada de dados na linguagem Java, a qual eu estou aprendendo

# Entrada de dados em Java

Para realizar a entrada de dados nesta linguagem, é preciso instanciar o objeto da Classe Scanner. Primeiro realize o import devido:

import java.util.Scanner;

Isso vai importar a classe que vai possibilitar a entrada de dados.
Para criar o objeto é preciso instanciá-lo como:

Scanner leitor = new Scanner(System.in);

Isto vai instanciar o seu objeto Scanner com o nome de leitor. Em seguida, para dar entrada em algum dado, basta você chamar uma variável, exemplo: String nome;, com o valor a seguir.

nome = leitor.nextLine();

Nesse caso o nosso leitor vai ficar esperando entrada de dados por parte do usuário no console