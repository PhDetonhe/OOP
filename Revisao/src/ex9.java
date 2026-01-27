import java.util.Scanner;
public class ex9 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);


        System.out.println("digite um numero");
        int num = read.nextInt();

        if(num % 2 == 0){
            System.out.println("o numero é par");
        } else
            System.out.println("O numero é impar");
    }
}
