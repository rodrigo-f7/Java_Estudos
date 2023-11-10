
package variaveis.exercicios.quadrado_da_diferenca;

/*

 * Rodrigo Pereira Faria
 * 07/11/2023
 * 
 */

import java.util.Scanner;

public class QuadradoDaDiferenca {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B;
        int diferenca, quadradoDaDiferenca;

        System.out.print("Digite valor de A: ");
        A = input.nextInt();

        System.out.print("Digite o valor de B:");
        B = input.nextInt();
        input.close();

        System.out.println("O quadrado da diferença é: (a - b)²");
        System.out.println("Decomposição: a² - 2*a*b + b²");

        diferenca = A - B;
        quadradoDaDiferenca = diferenca * diferenca;

        System.out.printf("A = %d, B = %d.%n", A, B, A, B, A, B);
        System.out.printf("QuadDaDif = (%d-%d)*(%d-%d)%n", A, B, A, B);
        System.out.printf("Resultado: %d", quadradoDaDiferenca);
    }
}

/*
 * Crie um programa que lê duas variáveis do tipo inteiro A e B e imprime o
 * quadrado da diferença entre o primeiro com o segundo.
 * O quad da dif é
 * 
 * Duas formas de fazer
 * Quadrado da diferença = 1°² - 2*1°*2° + 2°²
 * Quadrado da diferença = (a - b)*(a - b)
 * Exemplo: A = 2, B = 3;
 * (2-3)*(2-3)
 * 4-6-6+9 = -12 + 13 = 1
 */
