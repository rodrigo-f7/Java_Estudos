package condicionais.exercicios.catalogo;

/*
 * Rodrigo Pereira Faria
 * 09/12/2023
 * Exercício do Catálogo de produtos
 */

import javax.swing.JOptionPane;

public class Catalogo {
    public static void main(String[] args) {
        String indice = JOptionPane.showInputDialog("Digite o índice do catálogo (no estilo 00x): ");
        String tipoProduto = "";
        switch (indice){
            case "001":
                tipoProduto = "Caderno";
                break;
            case "002":
                tipoProduto = "Lápis";
                break;
            case "003":
                tipoProduto = "Borracha";
                break;
            default:
                tipoProduto = "Diversos";
        }
        System.out.printf("Índice = %s com tipo de produto sendo %s", indice, tipoProduto);
    }
}

/* 
 * Crie um programa que recebe de entrada do usuário um número de catálogo de acordo com a tabela imagem. Para isso utilize a estrutura switch case.
 * 
 * Como fazer?
 * 
 * Primeiro dar entrada no indice do catálogo
 * Switch indice{
 *      case 001:
 *          exibe("Caderno")
 *      case 002:
 *          exibe("Lápis")
 *      case 003:
 *          exibe("Borracha")
 *      default:
 *          exibe("Diversos")
 * }
 * 
 * Entrada: 001 exibe Caderno, 002 lápis, 003 borracha, diferente disso diversos
*/
