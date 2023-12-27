package entrada_de_dados.exercicios.aumento_linear_transversal;

// Autor: Rodrigo Pereira
// Data: 02/11

import java.util.Scanner;

public class AumentoLinearTransversal {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tamanhoDoObjeto, distanciaDoObjeto, tamanhoDaImagem, distanciaDaImagem;
        
        System.out.print("Digite o tamanho do Objeto: ");
        tamanhoDoObjeto = input.nextDouble();
        
        System.out.print("Digite o tamanho da Imagem: ");
        tamanhoDaImagem = input.nextDouble();

        System.out.print("Digite a distância da imagem até a lente (sempre negativa): ");
        distanciaDaImagem = input.nextDouble();
        input.close();

        distanciaDoObjeto = (-distanciaDaImagem * tamanhoDoObjeto) / tamanhoDaImagem;
        System.out.println("Com os valores passados, dentre eles I = " + tamanhoDaImagem + ", O = " + tamanhoDoObjeto + ", p' = " + distanciaDaImagem + ". O valor encontrado para a distância do objeto até a lente foi: " + distanciaDoObjeto);
        
   } 
}

/*
 * Faça um programa sobre Ótica a respeito de uma lente esférica divergente, ou seja, convexa, recebendo 3 valores do teclado, tamanho do objeto, tamanho da imagem e distância da imagem até a lente. O programa deve calcular a distância do objeto até a lente.
 * 
 * Atenção:
 * Imagem Virtual: p'< 0
 * Imagem Direita: I > 0
 * 
 * Fórmula aumento linear transversal: 
 */
