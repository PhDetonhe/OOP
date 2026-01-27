
import java.util.Scanner;
public class ex3 {
    public static void main(String[] args){
        Scanner read = new Scanner (System.in);


        System.out.println("Digite um numero:");
        int num1 = read.nextInt();
        System.out.println("Digite um numero:");
        int num2 = read.nextInt();

        int soma = num1 + num2;

        System.out.println(soma);


    }
}
