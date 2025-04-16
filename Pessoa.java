public class Pessoa {
    private String nome;
    private float salario;
    private String cpf;

    public Pessoa() {
    }

    public Pessoa(String nome, float salario, String cpf) {
        this.nome = nome;
        this.salario = salario;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa " + this.nome + " " + this.salario
                + " CPF" + this.cpf;
    }

    public class UtilizaPessoa {
        public static void main(String[] args) {
            Pessoa pessoa = new Pessoa();
            pessoa.setNome("Maria");
            pessoa.setSalario(15000);
            pessoa.setCpf("222.333.444-01");

            System.out.println("Pessoa " + pessoa.getNome()
                    + " " + pessoa.getSalario()
                    + " CPF" + pessoa.getCpf());

        }
    }

    public class UtilizaPessoaConstrutor {
        public static void main(String[] args) {
            Pessoa pessoa = new Pessoa("Maria", 15000, "222.333.444-01");
            System.out.println(pessoa);
        }
    }

public class UtilizaPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Maria");
        pessoa.setSalario(15000);
        pessoa.setCpf("222.333.444-01");


        System.out.println("Pessoa " + pessoa.getNome()
            + " " + pessoa.getSalario()
            + " CPF" + pessoa.getCpf());

        if (pessoa.getSalario() < Pessoa.SALARIO_MINIMO) {
            System.out.println("Salario inválido");
        }
    }
}