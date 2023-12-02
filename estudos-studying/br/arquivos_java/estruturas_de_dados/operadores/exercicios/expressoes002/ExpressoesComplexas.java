package operadores.exercicios.expressoes002;

/*
 *  Rodrigo Pereira Faria
 *  02/12/23
 */

import java.util.Scanner;


public class ExpressoesComplexas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num001 = input.nextDouble();
        System.out.print("Digite o segundo: ");
        double num002 = input.nextDouble();
        System.out.print("Digite o último número: ");
        double num003 = input.nextDouble();
        input.close();

        double exp001 = (num001 + num002) * (Math.pow(num003, 2) + 2);
        System.out.println(exp001);

        boolean exp002 = (num001 * num002) == num003 & num003-num002<num001;
        System.out.println(exp002);
        
        boolean auxExp001 = (num001)/(Math.sqrt(num002) - num003) > num002/num001 - 18; 
        boolean auxExp002 = num001 * (num002 + num003) < num003 % num002 + 12;
        boolean auxExp003 = Math.pow(num001,2) - num002/2 == num003/4;
        boolean exp003 =  auxExp001 && (auxExp002 || auxExp003);
        System.out.println(exp003);

        double tern001 = (num001 + num002 == num003) ? (num001+num002+num003)/3 : num001 - num002 - num003;
        System.out.println(tern001);

        double tern002 = (num002 - num001 < num003/2) ? (Math.pow(2,Math.pow(num001, 2))) : (Math.pow(num002,0.5));
        System.out.println(tern002);

        double tern003 = (num001 > num002/4 && num003/3 != num001+num002) ? 2*num001 : num001/3;
        System.out.println(tern003);


    }
}

/*
 * Crie um programa que realiza várias expressões complexas, antes recebendo do teclado três valores, exibindo seus devidos resultados com printf. Essas expressões devem envolver a maior parte dos operadores descritos nos documentos. Crie ao final 3 variáveis que se baseiam em condições simples (ternárias) desses valores. A seguir estão as expressões e as condições para o operador ternário:
 * 
 
 * Entrada = 
 * 1, 2, 3
 * 3, 5, 7
 * 
 * Expressões
 * 001 = (n1 + n2) * (n3² + 2)
 * 
 * Processando:
 * = (1 + 2) * (3² + 2) 
 * = 3 * (9 + 2)
 * = 3 * 11 = 33
 * 
 * 002 = (n1 * n2) == n3 & n3 - n2 < n1
 * 
 * Processando:
 * = (3 * 5) == 7 & 7-5 < 3
 * = resultado final: false
 * 
 * 003 = n1 / (raizQuadrada(n2) - n3) > n2/n1-18 && (n1 * (n2 + n3) < n3 % n2 + 12 || n1² - n2/2 == n3/4)
 * 
 * Processando:
 * 1. 
 * 1 / (1.41 - 3) > 2/1 - 18
 * 1 / (-1.59) > -16
 * -0.62 > -16
 * R: true
 * 
 * 2.
 * 1 * (2 + 3) < 3 % 2 + 12
 * 1 * 5 < 1 + 12
 * 5 < 13
 * R: true
 *  
 * 3.
 * 1² - 2/2 == 3/4
 * 1 - 1 == 0.75
 * 0 == 0.75 
 * R: true
 * 
 * Resolvendo lógica: 
 * true && (true || false)
 * true && (true)
 * R: true
 * 
 * Condições
 * 
 * 001: Se n1 + n2 == n3 ? tern = media dos três : senão tern = subtração dos três
 * 002: Se n1 - n2 < n3/2 ? tern = 2^(n1^2) : senão tern = raizQuadrada(n2)
 * 003: Se n1 > n2/4 && n3/3 != n1 + n2 ? tern = 2*n1 : n1/3
 */
