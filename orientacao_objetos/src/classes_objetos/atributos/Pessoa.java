package classes_objetos.atributos;

public class Pessoa{
    //Atributos da classe Pessoa
    long CPF; 
    String nome;
    String sexo;

    //Métodos
    //Função com retorno vazio
    void imprimir_nome(){
        System.out.printf("Olá, %s", nome);
    }

    //Função com retorno booleano (verdadeiro ou falso)
    boolean validarCPF(long CPF){
        boolean retorno = true;
        if(CPF != 0) {retorno = true;}
        else {retorno = false;}
        return retorno;

    };
}