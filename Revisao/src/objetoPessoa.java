import java.util.Scanner;
public class objetoPessoa {
    public static void main(String[] args) {
        Pessoa objtPessoa = new Pessoa();
        Scanner scan = new Scanner(System.in);


        System.out.println("Insria o nome da pessoa:");
        String nome = scan.nextLine();
        System.out.println("Insira a idade da pessoa:");
        int idade = scan.nextInt();


        objtPessoa.setNome(nome);
        objtPessoa.setIdade(idade);


        objtPessoa.ExibirPessoa();


        }
    }

