package variaveis.exercicios.java_distributiva_valores;

/*
   Rodrigo Pereira Faria
 * 07/11/2023
 * Exercício da soma e multiplicação distributiva.
 */
import java.util.Scanner;

public class DistributivaSomaMult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B, C, D; //Distributiva entre esses números
        int s1, s2, s3, s4, s5, s6; //Somas
        int m1, m2, m3, m4, m5, m6; //Multiplicações

        System.out.print("Digite o valor de A: ");
        A = input.nextInt();
        System.out.print("Digite o valor de B: ");
        B = input.nextInt();
        System.out.print("Digite o valor de C: ");
        C = input.nextInt();
        System.out.print("Digite o valor de D: ");
        D = input.nextInt();
        input.close();

        s1 = A + B;
        s2 = A + C;
        s3 = A + D;
        s4 = B + C;
        s5 = B + D;
        s6 = C + D;

        m1 = A * B;
        m2 = A * C;        
        m3 = A * D;
        m4 = B * C;        
        m5 = B * D;
        m6 = C * D;        

        System.out.printf("Valores digitados: %d, %d, %d, %d.%n", A, B, C, D );
        System.out.printf("Somas: %d, %d, %d, %d, %d, %d%n", s1, s2, s3, s4, s5, s6);
        System.out.printf("Mult.: %d, %d, %d, %d, %d, %d", m1, m2, m3, m4, m5, m6);

    }
}

/*
 * Crie um programa que lê 4 valores inteiros. Esses 4 valores devem efetuar operações de soma e multiplicação da seguinte forma: A com B, A com C, A com D, B com C, B com D, C com D. Ao final exibir 12 resultados, 6 de soma e 6 multiplicação.
 * 
 * Declarar variáveis A, B, C e D
 * Gerar entrada para cada uma.
 * Criar variáveis para somas e multiplicação. 
 * Padrão de nome: s1, s2, s3, s4, s5, s6, m1, m2, m3, m4, m5, m6
 * s1 = A + B;
 * m1 = A * B
 * ...
 * 
 * Exemplo:
 * 
 * Entrada: 1,2,3,4
 * 
 * s1 = 1+2 = 3
 * s2 = 1+3 = 4
 * s3 = 1+4 = 5
 * s4 = 2+3 = 5
 * s5 = 2+4 = 6
 * s6 = 3+4 = 7
 * Saída:  3, 4, 5, 5, 6, 7
 * 
 * m1 = 1*2 = 2
 * m2 = 1*3 = 3
 * m3 = 1*4 = 4
 * m4 = 2*3 = 6
 * m5 = 2*4 = 8
 * m6 = 3*4 = 12
 * 
 * Este exercício pode ser melhorado com vetores e iterações
 */