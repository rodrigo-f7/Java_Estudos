package condicionais.exercicios.circunferencia;

/*
 *  Rodrigo Pereira Faria
 *  11/12/2023
 */

import javax.swing.JOptionPane;

public class Circunferencia {
    public static void main(String[] args) {
        //Declarações
        int raio = Integer.parseInt(JOptionPane.showInputDialog("Digite o raio da circunferência (inteiro em cm): ")); //Raio recebendo somente inteiros
        double PI = 3;
        double diametro, comprimento, area;
        boolean raioPositivo = raio>0;

        if(raioPositivo){
            diametro = 2*raio;
            comprimento = 2*raio*PI;
            area = PI*Math.pow(raio,2);
            JOptionPane.showMessageDialog(
                null, 
                "Raio =  " + raio + " cm"
                + "\nDiâmetro = " + diametro + " cm"
                + "\nComprimento = " + comprimento + " cm"
                + "\nÁrea = " + area + " cm²"
            );
        }
        else{
            System.out.println("Erro na digitação."); 
        }

    }
}

/*
 * Escreva um programa que receba o raio de uma circunferência, depois verifica se é maior do que zero. Se sim, mostra o diâmetro, comprimento e área desta, se não exibe a mensagem dado incorreto. Utilizar JOptionPane.
 * 
 * O que fazer?
 * Receber o raio de uma circunferência e verificar se é positivo. Se sim, calcula o comprimento, diâmetro a área da circunferência. Se não, exibe que o dado foi incorreto.
 * 
 * Como fazer?
 * 
 * Dar entrada com JOPane no raio
 * Declarar constante PI;
 * Declarar variáveis de diâmetro, comprimento e área
 * if(raio>0){
 *      diametro = 2*raio;
 *      comprimento = 2*raio*PI;
 *      área = PI*r*r; Pode usar classe Math;
 *      exibir(raio, diametro, comprimento e area);
 * }
 * 
 * Exemplo
 * 
 * raio = 2;
 * PI = 3; Depois mudo para 3.14
 * 
 * diametro = 2*2 = 4;
 * comprimento = 2*2*3 = 12; 
 * area = 3*2² = 3*4 = 12;
 * 
 * raio = 4;
 * diametro = 4*2 = 8;
 * comprimento = 4*2*3 = 24; 
 * area = 3*4² = 3 * 16 = 48;
 * 
 */
