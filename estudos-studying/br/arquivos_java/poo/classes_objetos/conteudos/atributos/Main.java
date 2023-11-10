package classes_objetos.conteudos.atributos;

/*
 * Rodrigo
 * 04/11
 * Exemplo de Teste para classes e objetos retirados de um livro
 */

public class Main {
    //Método Main, chamado ponto de entrada, recebe um vetor de strings como Parâmetro
    public static void main(String[] args) {
        //Variável pessoa vem da classe Pessoa
        Pessoa pessoa1;
        //long containerCPF;

        pessoa1 = new Pessoa();
        
        pessoa1.nome = "Bertolucci Maria";
        pessoa1.CPF = 12345678911L;
        pessoa1.sexo = "Masculino";

        
        Pessoa pessoa2 = new Pessoa();
        
        pessoa2.nome = "Valdomiro Luciens";
        pessoa2.CPF = 12345678912L; //Não pode começar com zero, aprender a lidar com Strings
        pessoa2.sexo = "Masculino";

        Pessoa pessoa3 = new Pessoa();

        pessoa3.nome = "Luciana Da Luz";
        pessoa3.CPF = 92134532109L;
        pessoa3.sexo = "Feminino";

        //testando prints

        //Exibe o padrão classe@hashcode, é possível mudar isso alterando a função toString() na classe Pessoa
        System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(pessoa3);

        System.out.println(pessoa1.nome);
        System.out.println(pessoa2.nome);
        System.out.println(pessoa3.nome);
        System.out.printf(
            "CPFs respectivos: %n%d, %d, %d%n", pessoa1.CPF, pessoa2.CPF, pessoa3.CPF
        );
        System.out.printf(
            "Sexo de cada um: %s, %s, %s.", pessoa1.sexo, pessoa2.sexo, pessoa3.sexo
            );
    }
}

