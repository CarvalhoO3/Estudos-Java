import java.util.Scanner;

public class Exercicio2_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " é maior que " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " é menor que " + num2);
        } else {
            System.out.println(num1 + " é igual a " + num2);
        }

        input.close();
    }
}
