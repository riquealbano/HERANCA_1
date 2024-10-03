class Cliente {
    // Atributos comuns para todos os tipos de clientes
    String nome;
    String endereco;
    String email;

    // Construtor para inicializar os valores do cliente
    public Cliente(String nome, String endereco, String email) {
        this.nome = nome;        
        this.endereco = endereco; 
        this.email = email;      
    }
}

// Classe PessoaFisica que herda da classe Cliente
class PessoaFisica extends Cliente {
    String cpf; // Atributo exclusivo de Pessoa Física

    public PessoaFisica(String nome, String endereco, String email, String cpf) {
        super(nome, endereco, email); // Usa o construtor da classe Cliente
        this.cpf = cpf;               // Inicializa o CPF do cliente
    }

    // Método para exibir as informações de Pessoa Física
    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Email: " + email);
        System.out.println("CPF: " + cpf);
    }
}

// Classe PessoaJuridica que herda (extende) da classe Cliente
class PessoaJuridica extends Cliente {
    String cnpj; // Atributo exclusivo de Pessoa Jurídica

    public PessoaJuridica(String nome, String endereco, String email, String cnpj) {
        super(nome, endereco, email); // Usa o construtor da classe Cliente
        this.cnpj = cnpj;             // Inicializa o CNPJ da empresa
    }

    // Método para exibir as informações de Pessoa Jurídica
    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Email: " + email);
        System.out.println("CNPJ: " + cnpj);
    }
}

// Classe Funcionario que herda de PessoaFisica, pois os funcionários são pessoas físicas
class Funcionario extends PessoaFisica {
    double salario; // Atributo exclusivo para funcionário

    public Funcionario(String nome, String endereco, String email, String cpf, double salario) {
        super(nome, endereco, email, cpf); // Usa o construtor de PessoaFisica
        this.salario = salario;            // Inicializa o salário do funcionário
    }

    // Método para exibir as informações do Funcionario
    public void mostrarInfo() {
        super.mostrarInfo();
        // Exibe o salário específico do funcionário
        System.out.println("Salário: R$ " + salario);
    }


// Classe main para testar as classes criadas
    public static void main(String[] args) {
        // Criando uma pessoa física
        PessoaFisica clientePF = new PessoaFisica("João da Silva", "Rua A, 123", "joao@mail.com", "111.222.333-44");
        // Exibindo as informações do cliente
        clientePF.mostrarInfo();
        System.out.println(); // Linha em branco para melhor organização

        // Criando uma pessoa jurídica
        PessoaJuridica clientePJ = new PessoaJuridica("Empresa X", "Av. B, 456", "contato@empresax.com", "12.345.678/0001-99");
        // Exibindo as informações da empresa
        clientePJ.mostrarInfo();
        System.out.println();

        // Criando um funcionário
        Funcionario funcionario = new Funcionario("Maria Oliveira", "Rua C, 789", "maria@empresa.com", "999.888.777-66", 3500.00);
        // Exibindo as informações do funcionário
        funcionario.mostrarInfo();
    }
}