package variaveis.exercicios.java_esfera_volume;

/*
 * Rodrigo Pereira Faria
 * 13/11/2023
 * Volume e Área da Esfera
 */

import java.util.Scanner;

public class VolumeAreaDaEsfera {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double pi = 3.14;

        System.out.print("Digite o raio em cm: ");
        double raio = input.nextDouble();
        input.close();

        double volume = (4 * pi * (raio * raio * raio)) / 3;
        double area = 4 * pi * (raio * raio);

        System.out.printf("Volume = %.2f cm³;%nArea = %.2f cm²", volume, area);

    }

}

/*
 * Crie um programa que recebe pi como uma constante e como entrada o raio da
 * esfera. Ao final exibir a área e o volume da esfera utilizando printf.
 * 
 * V = (4*pi*r³)/3
 * A = 4*pi*r²
 * 
 * Declarar variáveis e dar entrada no raio:
 * double pi = 3.14;
 * double raio = entrada;
 * 
 * Calcular área e volume da esfera:
 * double volume = (4*pi*(raio*raio*raio))/3;
 * double area = 4*pi*(raio*raio);
 * 
 * Exibir na tela o volume e a área.
 * 
 */