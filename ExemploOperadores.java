import java.util.Scanner;

public class ExemploOperadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if(str1 == str2) {
            System.out.println("Comparação com ==");
        } 
        if (str1.equals(str2)) {
            System.out.println("Conteudos Iguais");
        }
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        str1 = str1 + num1;
        System.out.println("Soma de Strings" + str1);
        System.out.println("Soma de Números: " + (num1 + num2));
        sc.close();
    }

}