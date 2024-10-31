package br.edu.fatecpg.associacao.view;

import br.edu.fatecpg.associacao.model.Empresa;


public class Main {

    public static void main(String[] args) {
        Empresa fatec = new Empresa("Fatec");

        // Adicionando funcionários
        fatec.addFunc(0, "Maria", "Gerente", 5000.0);
        fatec.addFunc(1, "Gilmar", "Coordenador", 4000.0);
        fatec.addFunc(2, "Alessandro", "Professor", 3000.0);
        fatec.addFunc(3, "Viviam", "Diretora", 6000.0);

        // Adicionando clientes
        fatec.adicionarCliente("Carlos", "carlos@example.com");
        fatec.adicionarCliente("Ana", "ana@example.com");

        // Exibindo funcionários e clientes
        fatec.exibirFuncionarios();
        fatec.exibirClientes();

        // Exibindo média salarial
        fatec.exibirMediaSalarial();

        // Exibindo dados completos da empresa
        System.out.println(fatec);
    }
}
