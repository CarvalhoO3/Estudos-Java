import java.util.Scanner;

public class Exercicio2_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();

        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Diferença: " + (num1 - num2));
        System.out.println("Produto: " + (num1 * num2));
        System.out.println("Quociente: " + ((num2 != 0) ? (num1 / (double) num2) : "Indefinido"));

        input.close();
    }
}
