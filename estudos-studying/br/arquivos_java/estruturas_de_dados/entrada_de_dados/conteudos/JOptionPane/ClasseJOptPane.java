package entrada_de_dados.conteudos.JOptionPane;

import javax.swing.JOptionPane;

/*
 *  Rodrigo Pereira Faria
 *  02/12/23
 *  Entendendo JOptionPane
 */

public class ClasseJOptPane{
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        JOptionPane.showMessageDialog(null, "Seu nome é " + nome);

        int peso = Integer.parseInt(JOptionPane.showInputDialog("Digite seu peso: "));
        JOptionPane.showMessageDialog(null, nome + ", seu peso foi: " + peso + "kg");
    }
}