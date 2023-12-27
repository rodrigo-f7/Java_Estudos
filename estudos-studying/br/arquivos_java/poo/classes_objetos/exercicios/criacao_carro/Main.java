package classes_objetos.exercicios.criacao_carro;

//Para melhorar esse exercício, utilize estruturas de repetição.

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.marca = "Volkswagen";
        carro1.modelo = "Fusca";
        carro1.cor = "Amarelo";
        carro1.velocidadeMaxima = 110;

        carro1.imprimirDadosDoCarro(carro1.marca, carro1.modelo, carro1.cor);

        // Como alterar estados de um objeto por meio de um método

        // Qual a melhor forma de ligar o carro?
        if (!carro1.ignicao) {
            carro1.ignicao = carro1.ligar(carro1.ignicao);
            System.out.println("Carro ligado");
        } else {
            System.out.println("Carro já está ligado");
        }

        carro1.desligar(carro1.ignicao);
        System.out.println(carro1.acelerar(carro1.ignicao));
        System.out.println(carro1.freiar(carro1.ignicao));

        ;
    }
}
