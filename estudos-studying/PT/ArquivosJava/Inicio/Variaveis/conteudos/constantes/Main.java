/*
 * Crie uma constante no java e realize uma operação. Tente também alterar seu valor para verificar o que ocorre
*/

package conteudos.constantes;

public class Main {
    public static void main(String[] args) {
        final double valorInicial = 300;
        //valorInicial = 200;
        //Não é possível fazer a atribuição
        double valorFinal = valorInicial * 10;

        System.out.println(valorFinal);
    }
}
