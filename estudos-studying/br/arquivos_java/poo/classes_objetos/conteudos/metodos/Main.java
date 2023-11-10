package classes_objetos.conteudos.metodos;


/*
 * Rodrigo
 * 04/11
 * Exemplo de Teste para classes e objetos retirados de um livro
 */

public class Main {
    //Método Main, chamado ponto de entrada, recebe um vetor de strings como Parâmetro
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Marilene de Jesus";
        pessoa1.imprimir_nome();
        long cpf = 12345678912L;
        if(pessoa1.validarCPF(cpf)){
            pessoa1.CPF = cpf;
        }
        System.out.printf("%nO CPF da pessoa de nome %s é: %d%n", pessoa1.nome, pessoa1.CPF );
        
    }
}

