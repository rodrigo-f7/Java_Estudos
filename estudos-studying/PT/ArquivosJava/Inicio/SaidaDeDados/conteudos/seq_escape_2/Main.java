package conteudos.seq_escape_2;

public class Main {
    public static void main(String[] args) {
        // Exemplo do \r: coloca o cursor no começo e escreve sobrescrevendo o texto anterior.
        System.out.print("Busque a imprudência e os prazeres.");
        System.out.print("\rBusque a sabedoria e o entendimento. ");
        System.out.println("Deus acima de tudo. \n");
        
        // Exemplo \b: dá um backspace, apaga o último caracter
        System.out.println("Apa\bgand\boTexto");

    }   
}
