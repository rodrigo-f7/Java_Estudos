package entrada_de_dados.meu_package;

import java.util.Scanner;

// Autor: Rodrigo Pereira
// Data: 02/11

public class PrimeiraEntrada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Classe para dar entrada nos dados
        System.out.print("Digite o seu nome a seguir: ");
        String nome;
        nome = input.nextLine();
        System.out.println("Bem-vindo ao programa, " + nome + ". É um prazer vê-lo aqui. ");
        input.close();
    }
}
