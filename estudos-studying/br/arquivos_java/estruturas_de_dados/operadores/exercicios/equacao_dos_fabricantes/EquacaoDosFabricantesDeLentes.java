package operadores.exercicios.equacao_dos_fabricantes;

/*
 * Rodrigo Pereira Faria
 * 22/11/2023
 * Programa da EquaçãoDosFabricantesDeLentes
 * 
 */

import java.util.Scanner;

public class EquacaoDosFabricantesDeLentes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o índice da lente: ");
        double indiceLente = input.nextDouble();
        System.out.print("Digite o índice do meio: ");
        double indiceMeio = input.nextDouble();
        System.out.print("Digite o raio da 1º superfície da lente em cm: ");
        // Positivo é lente convexa, negativo é côncava
        double raio1 = input.nextDouble();
        System.out.print("Digite o raio da 2º superfície da lente em cm: "); // Vai precisar converter na vergência
        double raio2 = input.nextDouble();
        input.close();

        double foco = 1 / (((indiceLente / indiceMeio) - 1) * (1 / raio1 + 1 / raio2));
        double vergencia = 1 / (foco * 0.01);
        System.out.printf(
                "Os dados foram:%nn_lente = %.2f, n_meio = %.2f%nraio1 = %.2fcm, raio 2 = %.2fcm%nOs valores encontrados foram foco = %.2fcm e vergência = %.2fdi",
                indiceLente, indiceMeio, raio1, raio2, foco, vergencia);
        
    }
}

/*
 * A equação dos fabricantes de lentes determina o foco de uma lente esférica de
 * acordo com o índice de refração e os raios das superfícies da lente. Crie um
 * programa que recebe o índice de refração da lente e do meio e os raios da
 * superfície da lente, por último determina o valor do foco e a vergência da
 * lente. Exiba todos os dados informados e determinados.
 * Dá para melhorar esse exercício bastante com outros assuntos
 * 
 * Decomposição da fórmula
 * 1/f = ((indiceDaLente/indiceDoMeio) - 1) * (1/Raio1 + 1/Raio2);
 * f = 1/(((indiceDaLente/indiceDoMeio) - 1) * (1/Raio1 + 1/Raio2));
 * V = 1/f medido em metros^-1 ou dioptrias
 * 
 * 1 Dê entrada nos dados acima
 * 2 Crie a variável para o foco e a vergência
 * 3 Exiba todos os dados
 * 
 */
