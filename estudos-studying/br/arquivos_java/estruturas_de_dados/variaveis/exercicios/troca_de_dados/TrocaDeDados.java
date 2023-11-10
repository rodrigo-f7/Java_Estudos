package variaveis.exercicios.troca_de_dados;

/*
   Rodrigo Pereira Faria
 * 07/11/2023
 * Exercício da troca de variáveis
 */

import java.util.Scanner;

 
public class TrocaDeDados {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int a,b, a_auxiliar;
        
        System.out.print("Digite o valor de a: ");
        a = input.nextInt();

        System.out.print("Digite o valor de b: ");
        b = input.nextInt();
        
        input.close();
        
        System.out.println("Primeiro momento:");
        System.out.printf("a = %d, b = %d%n", a, b);

        a_auxiliar = a;
        a = b;
        b = a_auxiliar;
        
        System.out.println("Segundo momento: ");
        System.out.printf("a = %d, b = %d", a, b);
        
        
    }
}

/*
 * Crie um exercício que lê dois valores do teclado A e B e realiza a troca dessas variáveis, de forma que A recebe B e B recebe A. Exibir o valor inicial de A e B, depois o valor final.
 * 
 * Leitura dos Dados;
 * Criar variável auxiliar para armazenar um dos valores;
 * auxiliar recebe A;
 * A recebe B;
 * B recebe auxiliar;
 * Fim
 */