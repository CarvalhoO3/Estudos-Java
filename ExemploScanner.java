import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre seu nome:");
        String nome = sc.nextLine();
        
        System.out.println("Entre sua idade:");
        int idade = sc.nextInt();
        
        System.out.println("Nome: " + nome + " Idade: " + idade);
    }
}
