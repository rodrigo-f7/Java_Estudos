package operadores.exercicios.teorema_de_pitagoras;

/*
 *  Rodrigo PEreira Faria
 *  22/11/2023
 *  Teorema de Pitágoras
 */

import java.util.Scanner;

public class TeoremaDePitagoras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Vamos encontrar a hipotenusa de um triângulo retângulo.");
        System.out.print("Digite o primeiro cateto: ");
        double cateto1 = input.nextDouble();
        System.out.print("Digite o segundo cateto: ");
        double cateto2 = input.nextDouble();
        input.close();

        double somaDosQuadrados = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
        double hipotenusaQuadrado = somaDosQuadrados;
        double hipotenusa = Math.pow(hipotenusaQuadrado, 0.5); // Pode ser também Math.sqrt(hipotenusaQuadrado)

        System.out.printf("A hipotenusa foi: %.2f%n", hipotenusa);

    }
}

/*
 * Crie um programa que recebe dois catetos de um triângulo retângulo e exibe a
 * hipotenusa do triângulo
 * 
 * Se a = 3 e b = 4 então hi = 5
 * a² + b² = hi²
 * 3² + 4² = hi²
 * 9 + 16 = hi²
 * hi² = 25
 * hi = raizquadrada(25)
 * 
 * Como fazer?
 * 
 * Todas as variáveis do tipo double
 * 1 Dê entrada nos catetos
 * 2 Crie uma variável somaDosQuadrados que recebe Math.pow(cateto1, 2) +
 * Math.pow(cateto2, 2) ou cateto1*cateto1 + cateto2*cateto2
 * 3 Crie uma variável hipotenusaQuadrado que recebe soma dos quadrados
 * 4 Crie uma variável hipotenusa que recebe a raizquadrada(25)
 * 5 Exibir hipotenusa
 * 
 */
