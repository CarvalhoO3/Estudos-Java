import java.util.ArrayList;
import java.util.Scanner;

class Filme {
    String titulo;
    String genero;
    String atorPrincipal;
    int anoLancamento;
    float duracao;

    public Filme(String titulo, String genero, String atorPrincipal, int anoLancamento, float duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.atorPrincipal = atorPrincipal;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
    }

    public String toString() {
        return "Filme - Título: "
                + titulo + ", Gênero: "
                + genero + ", Ator Principal: "
                + atorPrincipal + ", Ano de Lançamento: "
                + anoLancamento + ", Duração: "
                + duracao + " min";
    }
}

public class FilmeMenu {
    static ArrayList<Filme> filmes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            menu();

            System.out.print("Digite a opção desejada: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    incluir(sc);
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    System.out.println("Opção 3: Alterar (não implementado ainda)");
                    break;
                case 4:
                    System.out.println("Opção 4: Excluir (não implementado ainda)");
                    break;
                case 5:
                    System.out.println("Saindo...");
                    sc.close();
                    return; // Encerra o programa
                default:
                    System.out.println("Opção não encontrada. Tente novamente.");
            }
        }
    }

    private static void incluir(Scanner sc) {
        System.out.println("Incluir novo filme:");
        System.out.print("Título: ");
        String titulo = sc.nextLine();
        System.out.print("Gênero: ");
        String genero = sc.nextLine();
        System.out.print("Ator principal: ");
        String atorPrincipal = sc.nextLine();
        System.out.print("Ano de lançamento: ");
        int anoLancamento = sc.nextInt();
        System.out.print("Duração (minutos): ");
        float duracao = sc.nextFloat();
        sc.nextLine();

        Filme f = new Filme(titulo, genero, atorPrincipal, anoLancamento, duracao);
        filmes.add(f);
        System.out.println("Filme adicionado com sucesso!");
    }

    private static void listar() {
        if (filmes.isEmpty()) {
            System.out.println("Nenhum filme cadastrado.");
        } else {
            System.out.println("Lista de filmes cadastrados:");
            for (Filme f : filmes) {
                System.out.println(f);
            }
        }
    }

    private static void menu() {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Incluir");
        System.out.println("2 - Listar");
        System.out.println("3 - Alterar");
        System.out.println("4 - Excluir");
        System.out.println("5 - Sair");
    }
}
