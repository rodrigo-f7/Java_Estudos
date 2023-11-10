package classes_objetos.exercicios.pessoa_entrada;

/*
 * 
 * Rodrigo Pereira Faria
 * 06/11/2023
 * 
 */

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        String nome, cpf, sexo;
        int idade;
        double altura;

        Scanner input = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa();
        System.out.print("Digite o nome da pessoa: ");
        nome = input.nextLine();
        pessoa1.nome = nome;

        System.out.print("Digite o cpf, com pontos e traço, de " + pessoa1.nome + ": ");
        cpf = input.nextLine();
        pessoa1.cpf = cpf;

        System.out.print("Digite o sexo dessa pessoa: ");
        sexo = input.nextLine();
        pessoa1.sexo = sexo;

        System.out.print("Digite a idade: ");
        idade = input.nextInt();
        pessoa1.idade = idade;

        System.out.print("Digite a altura em m: ");
        altura = input.nextDouble();
        //Conhecimento básico de condicionais antes de abordar especificamente.
        if(altura>2.8)
            System.out.println("A altura digitada está acima do máximo registrado (2.71).");
        pessoa1.altura = altura;
        input.close();
        
        pessoa1.imprimirDadosDaPessoa(nome, sexo, cpf, idade, altura);


        
    }
}
//É possível guardar objetos em arrays?

/*
 * Crie um exercício que instancia um objeto chamado pessoa e dá entrada em cada um de seus atributos. Ao final imprima esses atributos com um método da classe pessoa. Para cada input utilize um print("Digite..."). Ao imprimir os atributos, utilize o printf
 * 
 */