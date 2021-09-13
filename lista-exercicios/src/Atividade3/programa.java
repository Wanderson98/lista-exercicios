package Atividade3;

import java.util.Scanner;

public class programa {

    public static void main(String[] args) throws Exception {
    //declação dos objetos
    Scanner ler = new Scanner(System.in);
    funcionario fun = new funcionario();
    //leitura e atribuição dos dados
    System.out.println("Digite os dados do Funcionario: ");
    System.out.print("Nome: ");
    fun.nome = ler.nextLine();
    System.out.print("Salario Bruto: R$ ");
    fun.salarioBruto = ler.nextDouble();
    System.out.print("Imposto (em R$): ");
    fun.imposto = ler.nextDouble();
    //impressão dos dados inseridos
    System.out.println("\nFuncionario: " + fun );

    System.out.print("Digite o aumento do salario (em %): ");
    double taxa = ler.nextDouble();
    //incremento no salario
    fun.aumentarSalario(taxa);
    //impressão dados atualizados
    System.out.println("\nFuncionario: " + fun );
    
    ler.close();
    }
}