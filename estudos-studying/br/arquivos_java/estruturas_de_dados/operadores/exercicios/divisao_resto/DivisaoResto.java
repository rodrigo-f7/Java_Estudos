package operadores.exercicios.divisao_resto;

/*
 * Rodrigo Pereira Faria
 * 22/11/2023
 * Programa da Divisão e do resto
 */

import java.util.Scanner;

public class DivisaoResto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = input.nextInt();
        System.out.print("Digite o último número: ");
        int num4 = input.nextInt();
        input.close();

        int somaDivisoes = (num1 / num2) + (num2 / num3) + (num3 / num4);
        int somaRestos = (num1 % num2) + (num2 % num3) + (num3 % num4);
        System.out.printf("Soma das Divisões = %d%nSoma dos Restos = %d", somaDivisoes, somaRestos);
    }
}

/*
 * Crie um programa que recebe 4 números que vai realizar a divisão do primeiro
 * com o segundo e retira seu resto, a divisão do segundo com o terceiro e seu
 * resto e o terceiro com o último junto com seu resto. Ao final, exibe a soma
 * das divisões e a soma dos restos. Obs: realize as divisões e os restos nas
 * respectivas variáveis. O tipo das variáveis deve ser inteiro.
 * 
 * 1 Dê entrada nos números 1, 2, 3, 4.
 * 2 somaDivisoes = divisaodoprimeirocomosegundo + divisaodosegundocomoterceiro
 * ...
 * 3 somaRestos = restodoprimeirocomosegundo + ...
 * 4 Exibe a soma das divisões dos restos
 * 
 * Entrada:
 * 2, 1, 3, 4
 * 
 * Operações
 * 2/1 = 2;
 * 1/3 = 0;
 * 3/4 = 0
 * 
 * 2%1 = 0;
 * 1%3 = 1;
 * 3%4 = 3;
 * 
 * SomaDivisões = 2
 * SomaRestos = 4
 */
