import java.util.Scanner;

public class Exercicio2_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = input.nextInt();

        int soma = num1 + num2 + num3;
        double media = soma / 3.0;
        int produto = num1 * num2 * num3;
        int menor = Math.min(num1, Math.min(num2, num3));
        int maior = Math.max(num1, Math.max(num2, num3));

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Produto: " + produto);
        System.out.println("Menor número: " + menor);
        System.out.println("Maior número: " + maior);

        input.close();
    }
}
