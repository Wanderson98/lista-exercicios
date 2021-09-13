package Atividade4;

import java.util.Scanner;

public class programa {
    
    public static void main(String[] args) throws Exception {
       //declaração dos objetos
        Scanner ler = new Scanner(System.in);
        aluno alu = new aluno();
        //leitura e atribuição dos dados
        System.out.println("Digite os dados do aluno: ");
        System.out.print("Nome do aluno: ");
        alu.nome = ler.nextLine();
        System.out.print("Nota 1: ");
        alu.nota1 = ler.nextDouble();
        System.out.print("Nota 2: ");
        alu.nota2 = ler.nextDouble();
        System.out.print("Nota 3: ");
        alu.nota3 = ler.nextDouble();
        //chamada do metodo na classe aluno que imprime os dados
        alu.analiseMedia();



    ler.close();
    
    }   

}