import java.util.Scanner;
public class ex4 {
    public static void main(String[] args){
        Scanner read = new Scanner (System.in);

        System.out.println("Digite um numero:");
        int num1 = read.nextInt();

        if(num1 < 0){
           System.out.println("o numero é negativo");
        } else
            System.out.println("o numero é positivo");

    }
}
