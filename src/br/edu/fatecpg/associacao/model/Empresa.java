package br.edu.fatecpg.associacao.model;

import java.util.Arrays;

class Calculadora {
    public double somar(double a, double b) {
        return a + b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }
}

public class Empresa {
    String nome;
    Cliente[] clientes;
    int clienteCount = 0;
    Funcionario[] funcionarios;

    public Empresa(String nome) {
        this.nome = nome;
        this.clientes = new Cliente[5];
        this.funcionarios = new Funcionario[10];
    }

    public void adicionarCliente(String nome, String email) {
        if (clienteCount < clientes.length) {
            clientes[clienteCount] = new Cliente(nome, email);
            clienteCount++;
        } else {
            System.out.println("Capacidade máxima de clientes atingida.");
        }
    }

    public void addFunc(int indice, String nome, String cargo, double salario) {
        if (indice >= 0 && indice < funcionarios.length) {
            this.funcionarios[indice] = new Funcionario(nome, cargo, salario);
        } else {
            System.out.println("Índice de funcionário inválido.");
        }
    }

    public boolean vazio() {
        int total = 0;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario == null) {
                total++;
            }
        }
        return total == funcionarios.length;
    }

    public double calcularMediaSalarial() {
        Calculadora calculadora = new Calculadora();
        double somaSalarios = 0;
        int totalFuncionarios = 0;

        for (Funcionario funcionario : funcionarios) {
            if (funcionario != null) {
                somaSalarios = calculadora.somar(somaSalarios, funcionario.salario);
                totalFuncionarios++;
            }
        }

        return totalFuncionarios > 0 ? calculadora.multiplicar(somaSalarios, 1.0 / totalFuncionarios) : 0;
    }

    public void exibirMediaSalarial() {
        double mediaSalarial = calcularMediaSalarial();
        System.out.println("Média salarial dos funcionários da empresa " + nome + ": " + mediaSalarial);
    }

    public void exibirClientes() {
        System.out.println("Clientes cadastrados na empresa " + nome + ":");
        for (Cliente cliente : clientes) {
            if (cliente != null) {
                System.out.println("Nome: " + cliente.nome + ", Email: " + cliente.email);
            }
        }
    }

    public void exibirFuncionarios() {
        System.out.println("Funcionários cadastrados na empresa " + nome + ":");
        for (Funcionario funcionario : funcionarios) {
            if (funcionario != null) {
                System.out.println("Nome: " + funcionario.nome + ", Cargo: " + funcionario.cargo + ", Salário: " + funcionario.salario);
            }
        }
    }

    @Override
    public String toString() {
        if (vazio()) {
            throw new IllegalStateException("Lista de funcionários está vazia.");
        }
        StringBuilder funcs = new StringBuilder("[");
        for (Funcionario funcionario : funcionarios) {
            if (funcionario != null) {
                funcs.append(funcionario.toString()).append(", ");
            }
        }
        if (funcs.length() > 1) {
            funcs.setLength(funcs.length() - 2);
        }
        funcs.append("]");
        return "Empresa [nome=" + nome + ", clientes=" + Arrays.toString(clientes) + ", funcionarios=" + funcs.toString() + "]";
    }
}
