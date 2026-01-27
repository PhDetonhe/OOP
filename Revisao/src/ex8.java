import java.util.Scanner;
public class ex8 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        int num;
        double soma = 0;
        for(int i = 1; i <= 5; i++){
            System.out.println("Insira um numero inteiro:");
            num = read.nextInt();
            soma += num;
        }
        double media = soma/5;
        System.out.println("O resultado é de:" + media);




    }
}
