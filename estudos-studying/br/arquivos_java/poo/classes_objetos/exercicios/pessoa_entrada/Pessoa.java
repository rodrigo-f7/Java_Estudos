package classes_objetos.exercicios.pessoa_entrada;

public class Pessoa {
    String nome;
    String sexo;
    String cpf;
    int idade;
    double altura;

    void imprimirDadosDaPessoa(String nome, String sexo, String cpf, int idade, double altura){
        System.out.printf("O nome da pessoa %s, de CPF %s, do sexo %s.%nPossui %d anos e uma altura de %.2fm", nome, sexo, cpf, idade, altura);
    }
}
