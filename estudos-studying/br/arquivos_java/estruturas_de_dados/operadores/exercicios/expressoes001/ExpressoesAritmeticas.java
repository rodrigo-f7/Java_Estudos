package operadores.exercicios.expressoes001;

/*
 *  Rodrigo Pereira Faria
 *  22/11/2023
 *  Programa das Expressôes Aritméticas
 */

import java.util.Scanner;

public class ExpressoesAritmeticas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int A;
        int B;
        double C;

        System.out.print("Digite o primeiro número (int): ");
        A = input.nextInt();
        System.out.print("Digite o segundo (int): ");
        B = input.nextInt();
        System.out.print("Digite o último: ");
        C = input.nextDouble();
        input.close();

        double expressaoA = Math.pow(A,2) + B*C - C;
        System.out.printf("Resultado da expressãoA = %.2f%n", expressaoA);

        double expressaoB = (2*B - (A + 3*C))/A;
        System.out.printf("Resultado da expressãoB = %.2f%n", expressaoB);
        
        double expressaoC = B - C/2 + 4*A;
        System.out.printf("Resultado da expressãoC = %.2f%n", expressaoC);
        
        double expressaoD = (3*A + (2*B - C * ((Math.sqrt(B)) - 1))/2);
        System.out.printf("Resultado da expressãoD = %.2f%n%n", expressaoD);
        
        //Testando operações da ex´ressãoD
        System.out.println("Testando operações da expressão D:");
        double op1 = Math.sqrt(B)-1;
        System.out.printf("Math.sqrt(B) - 1 = %.2f%n", op1);

        double op2 = 2*B - C * op1;
        System.out.printf("2*B - C * ((Math.sqrt(B)) - 1) = %.2f%n", op2);

        double op3 = op2/2;
        System.out.printf("(2*B - C * ((Math.sqrt(B)) - 1))/2 = %.2f%n", op3);
        
        double op4 = 3*A + op3;
        System.out.printf("(3*A + (2*B - C * (Math.sqrt(B) - 1))/2) = %.2f%n", op4);

        // double raizDeB = (Math.sqrt(B));
        // System.out.println(raizDeB);
    }
}

/*
 * Crie um programa que recebe três variáveis com valores, sendo os 2 primeiros int e o último double, realizando as seguintes expressões:
 * 
 * a-) A² + B*C - C
 * b-) (2B - (A + 3C))/A
 * c-) B - C/2 + 4A
 * d-) (3A + (2B - C * (sqrt(B)-1))/2)
 * 
 * 1: Declare as variáveis e dê entrada
 * 2. Organize as expressões em variáveis
 * 2.1 Já que existe um double na operação, é mais aconselhável que a variável da expressão seja double também
 *
 *  Entrada: 
 *  A = 1; B = 2; C = 3;
 *  
 *  Operações: 
 *  a-) 1² + 2*3 - 3 = 1 + 6 - 3 = 4
 *  b-) (2*2 - (1 + 3*3))/1 = (4 - (1+9))/1 = 4-10 = -6
 *  c-) 2 - 3/2 + 4*1 = 2 - 1.5 + 4 = 4.5
 *  d-) (3*1 + (2*2 - 3 * (sqrt(2)-1))/2) 
 *  = (3 + (4 - 3 * (1.4 - 1))/2) 
 *  = (3 + (4 - 3 * 0.4)/2) 
 *  = (3 + (4 - 1.2)/2) 
 *  = (3 + 2.8/2)
 *  = 3  + 1.4 
 *  aproximadamente 4.4
 *  
 *  Saída:
 *  
 */