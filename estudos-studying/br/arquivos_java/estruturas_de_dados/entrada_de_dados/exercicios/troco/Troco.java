package entrada_de_dados.exercicios.troco;

/*
 * Autor: Rodrigo
 * Data: 03/11
 */

import java.util.Scanner;
public class Troco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valorDoProduto, dinheiroDisponivel, troco;

        System.out.println("Você está em uma loja e quer comprar um determinado produto com uma determinada quantia.");
        //Não vou utilizar condicionais ainda.

        System.out.print("Qual o preço do produto desejado? ");
        valorDoProduto = input.nextInt();

        System.out.print("(Digite sempre acima do produto) Quanto você tem? ");
        dinheiroDisponivel = input.nextInt();
        
        input.close();

        troco = dinheiroDisponivel - valorDoProduto;

        System.out.println("O valor do produto foi R$" + valorDoProduto + ",00.");
        System.out.println("Você possuía R$"+ dinheiroDisponivel +",00.");
        System.out.println("Seu troco foi R$" + troco + ",00.");
    }
}
/*
 * Crie um programa que recebe um valor do teclado para um produto e um valor para o quanto você tem para comprar esse produto. Ao final exibir o troco que lhe será dado. A quantia disponível sempre deve ser maior do que o valor do produto (por enquanto)
 */