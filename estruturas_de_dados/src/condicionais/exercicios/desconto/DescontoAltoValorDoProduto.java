package condicionais.exercicios.desconto;

import java.util.Scanner;

/*
 * Rodrigo Pereira Faria
 * 27/12/23
 * Exercício do Desconto dado se o valor do produto for alto
 * */

public class DescontoAltoValorDoProduto {
	public static void main(String[] args) {
		System.out.println("==== Programa do Desconto ===");
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Digite o valor do Produto em R$: ");
		double valorProduto = input.nextDouble();
		input.close();
		double valorFinal = valorProduto;
		double desconto = 0.0;
		
		boolean valorEntre199e400 = valorProduto > 199 && valorProduto < 400;
		boolean valorEntre399e900 = valorProduto > 399 && valorProduto < 900;
		boolean valorEntre899e1200 = valorProduto > 899 && valorProduto < 1200;
		boolean valorAcima1199 = valorProduto > 1199;
		
		System.out.println(valorEntre199e400);
		System.out.println(valorEntre399e900);
		System.out.println(valorEntre899e1200);
		System.out.println(valorAcima1199);
		if(valorEntre199e400) {
			System.out.println("Desconto de 2%");
			desconto = 2./100.; //Precisa colocar . em double
		} else if (valorEntre399e900) {
			System.out.println("Desconto de 5%");
			desconto = 5./100.;
		} else if (valorEntre899e1200) {
			System.out.println("Desconto de 8%");
			desconto = 8./100.;
		} else if (valorAcima1199) {
			System.out.println("Desconto de 12%");
			desconto = 12./100.;
		} else {
			System.out.println("Sem desconto");
		}
		
		valorFinal = valorFinal * (1 - desconto);
		System.out.printf(
				"Valor do Produto foi R$%.2f%nValor Final do produto com desconto de %.0f%% foi R$%.2f"
				,valorProduto
				,(desconto*100)
				,valorFinal
				);
	}

}
/*
 * Crie um programa que recebe um valor do teclado para um valor de produto, caso o valor do produto esteja entre uma dessas faixas, vai executar certos descontos:
 * 
 * Desconto de 2% se valorProduto está entre 200 e 400 (maior do que 200 e menor do que 400)
 * Desconto de 5% se valorProduto está entre 399 e 900 (maior do que 399 e menor do que 900)
 * Desconto de 8% se valorProduto está entre 899 e 1200 (maior do que 899 e menor do que 1200)
 * desconto de 12% se valorProduto está acima de 1199
 * Se não atender nenhuma das condições, sem desconto
 * 
 * Como fazer?
 * 
 * Primeiro dar entrada no valor do Produto
 * Declarar variáveis das condições:
 * 
 * ValorEntre199e400: valorProduto > 200 && valorProduto < 400;
 * ValorEntre399e800: valorProduto > 399 && valorProduto < 900;
 * ValorEntre899e1200: valorProduto > 899 && valorProduto < 1200;
 * ValorAcima1199: valorProduto > 1199;
 * 
 * se(ValorEntre199e400){
 * 		desconto de 2%
 * 		valorProduto * (1-2/100)
 * }
 * senão se(ValorEntre399e800){
 * 		desconto de 5%
 * 		valorProduto * (1 - 5/100)
 * }
 * senão se(ValorEntre899e1200){
 * 		desconto de 8%
 * 		valorProduto * (1 - 7/100)
 * }
 * senão se(ValorAcima1199){
 * 		desconto de 12%
 * 		valorProduto * (1 - 12/100)
 * }
 * senão{
 * 		valorProduto = valorProduto;
 * }
 * 
 * Fiz diferente, valorProduto é calculado ao final dependendo do desconto da condição.
 */

