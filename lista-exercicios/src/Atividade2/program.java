package Atividade2;

import java.util.Scanner;

public class program {

    public static void main(String[] args) throws Exception{
    Scanner ler = new Scanner(System.in);
    //declaração do objeto produto, leitura e atribuição dos dados
    produto produto = new produto();
    System.out.println("Digite os dados do produto: ");
    System.out.print("Nome: ");
    produto.nome = ler.nextLine();
    System.out.print("Preço: ");
    produto.preco = ler.nextDouble();
    System.out.print("Quantidade Estoque: ");
    produto.quantidade = ler.nextInt();
    //impressão dos dados
    System.out.println("\nDados do produto: " + produto );
    
    System.out.print("Entre com o número de produtos para serem adicionados no estoque: ");
    int quant = ler.nextInt();
    //metodo para adicionar a quantidade inserida pelo usuario 
    produto.addProdutos(quant);
    // impressao dos dados atualizados
    System.out.println("\nDados do produto: " + produto );

    System.out.print("Entre com o número de produtos para serem removidos do estoque: ");
    quant = ler.nextInt();
    //metodo para remover a quantidade inserida pelo usuario 
    produto.remProdutos(quant);
    //impressao dos dados atualizados
    System.out.println("\nDados do produto: " + produto );
 
    ler.close();    
    }
    
}
