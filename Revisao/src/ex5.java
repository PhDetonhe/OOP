import java.util.Scanner;
public class ex5 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        System.out.println("informe sua idade:");
        int idade = read.nextInt();

        if(idade >= 18){
            System.out.println("Você é maior de idade");
        } else
            System.out.println("vocÊ é menor de idade");
    }
}
