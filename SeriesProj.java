import java.util.ArrayList;
import java.util.Scanner;

// Classe Série
class Serie {
    private String titulo;
    private String genero;
    private int temporadas;
    private int anoLancamento;
    private double avaliacao;

    public Serie(String titulo, String genero, int temporadas, int anoLancamento, double avaliacao) {
        this.titulo = titulo;
        this.genero = genero;
        this.temporadas = temporadas;
        this.anoLancamento = anoLancamento;
        this.avaliacao = avaliacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + " | Gênero: " + genero + " | Temporadas: " + temporadas + 
               " | Ano de Lançamento: " + anoLancamento + " | Avaliação: " + avaliacao;
    }
}

public class SeriesProj {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Serie> series = new ArrayList<>();
    private static final String RA = "123456";
    private static final String NOME = "Luan Carvalho";

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\nMENU - GERENCIADOR DE SÉRIES");
            System.out.println("1. Listar Séries");
            System.out.println("2. Criar Nova Série");
            System.out.println("3. Atualizar Série");
            System.out.println("4. Excluir Série");
            System.out.println("5. Exibir RA e Nome do Aluno");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1 -> listarSeries();
                case 2 -> criarSerie();
                case 3 -> atualizarSerie();
                case 4 -> excluirSerie();
                case 5 -> exibirRAENome();
                case 6 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 6);
    }

    private static void listarSeries() {
        if (series.isEmpty()) {
            System.out.println("Nenhuma série cadastrada.");
        } else {
            for (int i = 0; i < series.size(); i++) {
                System.out.println((i + 1) + ". " + series.get(i));
            }
        }
    }

    private static void criarSerie() {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Gênero: ");
        String genero = scanner.nextLine();
        System.out.print("Temporadas: ");
        int temporadas = scanner.nextInt();
        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();
        System.out.print("Avaliação: ");
        double avaliacao = scanner.nextDouble();
        scanner.nextLine();
        
        series.add(new Serie(titulo, genero, temporadas, ano, avaliacao));
        System.out.println("Série adicionada com sucesso!");
    }

    private static void atualizarSerie() {
        listarSeries();
        if (series.isEmpty()) return;

        System.out.print("Digite o número da série que deseja atualizar: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        if (index >= 0 && index < series.size()) {
            Serie serie = series.get(index);
            System.out.print("Novo Título: ");
            serie.setTitulo(scanner.nextLine());
            System.out.print("Novo Gênero: ");
            serie.setGenero(scanner.nextLine());
            System.out.print("Novas Temporadas: ");
            serie.setTemporadas(scanner.nextInt());
            System.out.print("Novo Ano de Lançamento: ");
            serie.setAnoLancamento(scanner.nextInt());
            System.out.print("Nova Avaliação: ");
            serie.setAvaliacao(scanner.nextDouble());
            scanner.nextLine();
            
            System.out.println("Série atualizada com sucesso!");
        } else {
            System.out.println("Série não encontrada.");
        }
    }

    private static void excluirSerie() {
        listarSeries();
        if (series.isEmpty()) return;

        System.out.print("Digite o número da série que deseja excluir: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        if (index >= 0 && index < series.size()) {
            series.remove(index);
            System.out.println("Série removida com sucesso!");
        } else {
            System.out.println("Série não encontrada.");
        }
    }

    private static void exibirRAENome() {
        System.out.println("RA: " + RA + " | Nome: " + NOME);
    }
}
