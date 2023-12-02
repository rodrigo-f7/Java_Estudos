# Como compilar o arquivo java?

Java é uma linguagem interpretada e compilada, ou seja, os arquivos são interpretados pela JVM e compilados para bytecodes. Nesse sentido, é necessário compilar os arquivos ".java". Para fazer isso, abra o prompt de comando e movimente-se pelos diretórios de seu projeto até a pasta onde contém os arquivos fonte. Em seguida, execute o comando:

`javac Nome.java`

E assim o arquivo é compilado na pasta em que o prompt se encontra. Para executar o arquivo, utilize:

`java Nome`

E o arquivo será executado.

## Como compilar e passar para pasta target?

Existe um padrão no ecossistema java que prediz que os arquivos compilados devem estar separados dos arquivos fonte. Por isso, é necessário a criação de uma pasta target onde eles serão armazenados. Para realizar isso, imaginando a seguinte estrutura de diretórios: 

```
exercicios
    ├───java_distributiva_valores
    ├───java_quadrado_das_somas
    ├───java_quadrado_da_diferenca
    ├───java_soma_dos_quadrados
    └───troca_de_dados
```

Estando em exercícios, você deve fazer o seguinte comando:

`javac -d target nomedapasta\*.java`

Porém nesse caso se torna algo muito maçante e cansativo ter que fazer repetitivamente para cada uma das pastas, portanto para fazer isso mais rápida utilize o comando na pasta imediatamente acima daquela que você deseja:

`for /r exercicios %i in (*.java) do javac -d exercicios\target "%i"`

Esse comando vai iterar cada uma das pastas e procurar os arquivos que terminam com ".java" e vai colocá-los dentro da pasta target. Um ponto a ressaltar é que a pasta target virá com os diretórios do package do arquivo fonte java, para caso se estranhe a estrutura.

Para depois: verificar como executar os arquivos em target pela pasta principal.