package atividade;

public abstract class Funcionario {
    protected String nome;
    protected String cpf;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }

    public abstract double calcularPagamento();
}