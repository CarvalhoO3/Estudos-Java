import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class Filme {
    private String titulo;
    private String genero;
    private String atorPrincipal;
    private int anoLancamento;
    private float duracao;

    public Filme(String titulo, String genero, String atorPrincipal, int anoLancamento, float duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.atorPrincipal = atorPrincipal;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Filme - Título: " + titulo + ", Gênero: " + genero + ", Ator Principal: " + atorPrincipal +
                ", Ano de Lançamento: " + anoLancamento + ", Duração: " + duracao + " min";
    }
}

class FilmeController {
    private static final ArrayList<Filme> filmes = new ArrayList<>();

    public static boolean adicionarFilme(String titulo, String genero, String atorPrincipal, String ano,
            String duracao) {
        if (titulo.isEmpty() || genero.isEmpty() || atorPrincipal.isEmpty() || ano.isEmpty() || duracao.isEmpty()) {
            return false;
        }

        try {
            int anoLancamento = Integer.parseInt(ano);
            float duracaoMin = Float.parseFloat(duracao);
            filmes.add(new Filme(titulo, genero, atorPrincipal, anoLancamento, duracaoMin));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static String listarFilmes() {
        if (filmes.isEmpty()) {
            return "Nenhum filme cadastrado.";
        }

        StringBuilder sb = new StringBuilder();
        for (Filme f : filmes) {
            sb.append(f).append("\n");
        }
        return sb.toString();
    }
}

public class FilmeMenuGrafico extends JFrame {
    private JTextArea textArea;
    private JTextField tituloField, generoField, atorField, anoField, duracaoField;

    public FilmeMenuGrafico() {
        System.out.println("Inicializando interface gráfica...");
        setTitle("Gerenciador de Filmes");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Painel de entrada
        JPanel inputPanel = new JPanel(new GridLayout(5, 2, 5, 5));

        inputPanel.add(new JLabel("Título:"));
        tituloField = new JTextField();
        inputPanel.add(tituloField);

        inputPanel.add(new JLabel("Gênero:"));
        generoField = new JTextField();
        inputPanel.add(generoField);

        inputPanel.add(new JLabel("Ator Principal:"));
        atorField = new JTextField();
        inputPanel.add(atorField);

        inputPanel.add(new JLabel("Ano de Lançamento:"));
        anoField = new JTextField();
        inputPanel.add(anoField);

        inputPanel.add(new JLabel("Duração (min):"));
        duracaoField = new JTextField();
        inputPanel.add(duracaoField);

        add(inputPanel, BorderLayout.NORTH);

        // Painel para botões
        JPanel buttonPanel = new JPanel();

        JButton incluirButton = new JButton("Incluir Filme");
        incluirButton.addActionListener(e -> incluirFilme());
        buttonPanel.add(incluirButton);

        JButton listarButton = new JButton("Listar Filmes");
        listarButton.addActionListener(e -> listarFilmes());
        buttonPanel.add(listarButton);

        add(buttonPanel, BorderLayout.SOUTH);

        // Área de exibição
        textArea = new JTextArea();
        textArea.setEditable(false);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Exibe a janela
        setVisible(true);
        System.out.println("Interface gráfica exibida com sucesso.");
    }

    private void incluirFilme() {
        boolean sucesso = FilmeController.adicionarFilme(
                tituloField.getText(),
                generoField.getText(),
                atorField.getText(),
                anoField.getText(),
                duracaoField.getText());

        if (sucesso) {
            JOptionPane.showMessageDialog(this, "Filme adicionado com sucesso!");
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao adicionar filme! Verifique os campos.");
        }
    }

    private void listarFilmes() {
        textArea.setText(FilmeController.listarFilmes());
    }

    private void limparCampos() {
        tituloField.setText("");
        generoField.setText("");
        atorField.setText("");
        anoField.setText("");
        duracaoField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            System.out.println("Executando SwingUtilities.invokeLater()");
            new FilmeMenuGrafico();
        });
    }
}
