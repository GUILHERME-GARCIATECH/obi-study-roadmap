# Classe Scanner

---
## Definição
A classe Scanner em Java é um modelo usado para analisar informações oriundas de diferentes fontes, como console e arquivos. Além disso, com ela, é possível trabalhar com tipos primitivos de uma maneira mais prática e otimizada.

---
## Métodos principais

|    Método     | Funcionalidade                                                                    |
|:-------------:|:----------------------------------------------------------------------------------|
|    close()    | Encerra a leitura do Scanner e libera os recursos associados à leitura            |
| findInLine()  | Procura a próxima ocorrência de um padrão na linha atual, ignorando delimitadores |
|    next()     | Lê a próxima palavra até um espaço                                                |
|  nextLine()   | Lê toda a linha até a quebra (ENTER)                                              |
|   nextInt()   | Lê um número inteiro (int)                                                        |
| nextDouble()  | Lê um número com casas decimais (double)                                          |
| nextBoolean() | Lê verdadeiro ou falso                                                            |
|  nextFloat()  | Lê um número decimal (float)                                                      |
|  nextLong()   | Lê um número inteiro usando valores maiores que o tipo int                        |
|   hasNext()   | Verifica se há mais dados para ler                                                |
| hasNextInt()  | Checa se o próximo valor é um int                                                 |
|    match()    | Retorna o resultado da pesquisa do último objeto Scanner                          |
|    radix()    | Retorna a base numérica usada para análise de números                             |
|    skip()     | Ignora a entrada até que o padrão especificado seja encontrado                    |

---

## Como ler o terminal

### Passo 1 - Importar

Para usar o Scanner é necessario importar a classe para o seu programa. Para fazer isso basta usar o seguinte comando no topo do seu código.

~~~java
import java.util.Scanner;
~~~
### Passo 2 - Instanciar

Em seguida, será necessário criar uma instância Scanner, essa ação permite que o programa leia os dados inseridos por meio do teclado. A requisição que você deverá usar nessa etapa é a seguinte: 

~~~
Scanner scanner = new Scanner(System.in);
~~~

### Passo 3 - Ler os dados

Agora, você vai precisar selecionar os métodos Scanner compatíveis com os tipos de dados que você deseja ler, como no exemplo a seguir:

~~~
System.out.print("Digite seu nome: ");
String nome = scanner.nextLine();

System.out.print("Digite sua idade: ");
int idade = scanner.nextInt();

System.out.print("Digite seu salário: ");
double salario = scanner.nextDouble();
~~~

### Passo 4 - Fechar o Scanner

Após finalizar a leitura, não se esqueça de fechar o Scanner para liberar espaço no sistema.

~~~
scanner.close();
~~~

## Como ler arquivos

### Passo 1 - Importar

Importar o Scanner da mesma forma.
~~~
import java.util.Scanner;
~~~

### Passo 2 - Criar objeto

Para conseguir ler as informações contidas em um arquivo é necessário criar um objeto atraves da classe FILE (importar com import java.io.File;).

~~~~
File arquivo = new File("arquivo.txt");
~~~~

### Passo 3 - Instanciar o Scanner

Instanciar o Scanner com o objeto criado.
~~~~
Scanner scanner = new Scanner(arquivo);
~~~~

### Passo 4 - Ler os dados

~~~~
// Verifique se há próximas linhas
while (sc.hasNextLine()) {
    String linha = sc.nextLine();
    System.out.println(linha);
}
~~~~