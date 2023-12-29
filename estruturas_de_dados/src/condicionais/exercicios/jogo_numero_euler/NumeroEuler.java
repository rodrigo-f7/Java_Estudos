package condicionais.exercicios.jogo_numero_euler;

/*
 *  Rodrigo Pereira Faria
 *  11/12/2023
 */

import java.util.Scanner;

public class NumeroEuler {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Bem-vindo ao programa da adivinhação do número de Euler.");
      
      System.out.print("Digite o número de Euler com suas primeiras 5 casas decimais sem pesquisar: ");
      double adivinhacao = input.nextDouble();
      input.close();

      System.out.println(adivinhacao);
      if (adivinhacao == 2){
         System.out.println("a");
      };}

   }

/*
 * Crie um programa para exercitar condicionais utilizando switch case que pergunta os 5 primeiros digitos das casas decimais do famoso número de Euler. 
 * 
 * Resposta correta: 2.71828
 * O que fazer?
 * Criar um programa que verifica um número digitado pelo usuário, se é a resposta correta do número de Euler. Caso o seja, exibe "você acertou, resposta correta 2,71828". Caso digite somente 2, vai exibir "faltam 5 casas decimais, dois é o número das unidades", caso 2.7, faltam 4 casas decimais, caso 2.71 (faltam 3 casas decimais), caso 2.718 (faltam 2 casas decimais), caso 2.7182 (falta 1 casa decimal), caso tenha errado, exibe "Você errou."
 * 
 * Como fazer?
 * 
 * Dar entrada no número de adivinhação do usuário 
 * switch (entrada){
*        case 2:
*        sout("2 é o número da unidade, faltam 5 casas decimais.")
 * 
 * }
 * ...
 * 
 */
