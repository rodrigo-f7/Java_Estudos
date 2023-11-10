package classes_objetos.exercicios.criacao_carro;

/*

Rodrigo Pereira
06/11/2023

 * Ver como fazer o carro acelerar e freiar
 * 
 * Para fazer o carro parar, você pode usar uma estrutura de repetição que vai reduzindo a velocidade até chegar a zero exibindo os números.
 * 
*/

public class Carro {

    String marca, modelo, cor;

    int velocidadeMaxima;
    boolean ignicao, freiando, acelerando;

    boolean ligar(boolean ligado) {
        // This serve para alterar o objeto em questão
        if (!ignicao) {
            this.ignicao = true;
        } else {
            System.out.println("Já está ligado");
        }
        return this.ignicao;
    }

    boolean desligar(boolean desligado) {
        this.ignicao = false;
        return this.ignicao;
    }

    String acelerar(boolean ignicao) {
        if (ignicao) {
            return "Estou acelerando";
        } else {
            return "Não estou acelerando";
        }

    }

    String freiar(boolean ignicao) {
        if (ignicao) {
            return "Estou freiando";
        } else {
            return "Não estou freiando";
        }
    }

    // Sobrecarga
    void imprimirDadosDoCarro(String marca) {
        System.out.printf("Seu carro é da marca: %s%n", marca);
    }

    void imprimirDadosDoCarro(String marca, String modelo) {
        System.out.printf("Seu carro é da marca %s de modelo %s", marca, modelo);
    }

    void imprimirDadosDoCarro(String marca, String modelo, String cor) {
        System.out.printf("Seu carro é da marca %s, modelo %s e da cor %s.%n", marca, modelo, cor);
    }

}
