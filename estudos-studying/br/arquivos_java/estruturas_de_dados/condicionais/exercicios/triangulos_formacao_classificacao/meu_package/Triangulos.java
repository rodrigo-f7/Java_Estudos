package condicionais.exercicios.triangulos_formacao_classificacao.meu_package;

/*
 * Rodrigo Pereira Faria
 * 09/12/2023
 * Verificando se é um triângulo e o tipo do triângulo
 */

import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o lado a: ");
        int a = input.nextInt();
        System.out.print("Digite o lado b: ");
        int b = input.nextInt();
        System.out.print("Digite o lado c: ");
        int c = input.nextInt();
        input.close();

        String classificacao = "";
        boolean condicaoFormacao = a < b+c && b < a+c && c < a+b;
        boolean condicaoEquilatero = a == b && b == c;
        boolean condicaoIsosceles = (a == b && b != c) || (a == c && c != b) || (b == c && c != a);

        if(condicaoFormacao){
            System.out.print("É um triângulo");
            classificacao = "triangulo";
            if(condicaoEquilatero){
                classificacao += " equilátero";
                System.out.println(" equilátero (lados iguais)");
            }
            else if(condicaoIsosceles){
                classificacao += " isósceles";
                System.out.println(" isôsceles (2 lados iguais)");
            }
            else{
                classificacao += " escaleno";
                System.out.println(" escaleno (lados diferentes)");
            }
        }
        else{
            System.out.println("Não é um triângulo");
            classificacao = "outra figura";
        }
        System.out.println("Classificação final: " + classificacao);
    }
}

/*
 *  Faça um algoritmo que receba três valores que representarão os lados de um triângulo e
serão fornecidos pelo usuário. Verifique se os valores formam um triângulo e classifique
esse triângulo como:
    equilátero – três lados iguais;
    isósceles – dois lados iguais;
    escaleno – três lados diferentes

Para ser um triângulo:
As somas precisam ser maiores do que os lados para poder formar um triângulo, se isso não for verdade, não completa o triângulo
a < b+c
b < a+c
c < a+b

Para ser equilátero:
a == b && a == c && b == c;
Pode simplificar como a == (b & c)? Não. Pois o & vai utilizar uma operação bit a bit, o que não tem relação com a minha lógica, que é verificar se todos os 3 valores são iguais.

Pode simplicar como a == b && b == c, pois se a = b e b = c, logo a = c também.

Para ser isósceles:
a == b && b != c, pois se a = b, então a também é diferente de c
a == c && c != b, pois se a = c, então a também é diferente de b
b == c && c != a, pois se b = c, então b também é diferente de a

Para ser escaleno
Nega a expressão do equilatero
!(a == b && b == c)
ou
(a != b && b != c), se a é diferente de b e b é diferente de c, logo a é diferente de c. Vou escolher esse por questão de prática

Como fazer?

Considerar as condições primeiro isoladamente, para não complicar o problema (utilize valores exemplos)
Dar entrada nos lados do triângulo
Verificar se é um triângulo, se não for exibe que não é um triângulo
Se é um triângulo, verificar se é equilátero, isósceles ou escaleno. (Verifique se pode fazer para o escaleno simplesmente um else)

 */