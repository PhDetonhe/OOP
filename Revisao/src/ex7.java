import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);



        System.out.println("insira um numero:");
        int num1 = read.nextInt();

        for (int i = 1; i <= 10; i++){
            int multiplicar = num1 * i;
            System.out.println(num1 + "." + i + " = " + multiplicar);
        }
    }
}
