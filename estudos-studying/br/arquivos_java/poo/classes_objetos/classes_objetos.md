# Classes e Objetos

A programação orientada a objetos define que todo problema deve ser tratado como objetos ou conceitos do mundo real. Isto possibilita maior modularização e técnicas como o encapsulamento, a herança e o polimorfismo para facilitar a manutenção dos códigos. Esses objetos podem ser exemplificados como um simples carro, uma conta bancária, um cálculo, etc. Tais entidades sempre possuem atributos e métodos que podem se comunicar entre si. 

No exemplo do carro tem-se alguns atributos como cor, velocidade máxima, marca, etc., e métodos tais quais ligar, desligar, acelerar, frear, abrir janela e outros.

Acontece que, na programação, para que haja a efetivação desses objetos, é necessário que eles sejam definidos e projetados por meio de uma classe. A classe, portanto, é o molde dos objetos ditando seus atributos e métodos. Esta classe irá instanciar os objetos na memória do computador, normalmente em uma classe com o método Main, colocando-os em ação com seus estados e comportamentos. Estado e comportamento é o nome que se dá aos atributos e métodos de um objeto instanciado.

Ainda, vale ressaltar a respeito do contexto em que as classes estão inseridas, o domínio das classes, modificando-se seus atributos e métodos. Um exemplo de meu professor do curso de Técnico de Informática, Orlando Vicente Oliveira Filho, a respeito disso foi o seguinte: um piloto de quadro branco pode ter uma função (método) para um professor, como escrever(), mas para um artista pode ter uma outra função, que é desenhar(); para uma pessoa comum, o que importa sobre seus atributos são EstáCheio, cor e marca, mas para um engenheiro que projeta esses pilotos pode ser, por exemplo, tamanho da base, tamanho da ponta e do bucal. Em suma, o contexto em que está inserido modifica os atributos e métodos que precisam ser definidos.

É importante destacar também que toda classe deve possuir somente uma responsabilidade, ou seja, somente um único fim. Criar uma classe com atributos de um Carro e de uma Pessoa seria, portanto, um erro. O nome desse princípio é SRP (Single Responsibility Principle). Por isso, é comum que as classes possuam poucos atributos e métodos.
