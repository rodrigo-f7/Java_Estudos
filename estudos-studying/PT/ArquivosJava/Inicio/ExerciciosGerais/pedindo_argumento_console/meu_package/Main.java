package pedindo_argumento_console.meu_package;

public class Main{
    public static void main(String[] args) {
        String nome = args[0];
        String sobrenome = args[1];
        System.out.println("Olá, " + nome + " " + sobrenome);
    }
}