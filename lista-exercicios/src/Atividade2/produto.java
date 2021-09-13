package Atividade2;
//classe entidade produtos
public class produto {
//variaveis para atribuição dos dados
    public String nome;
    public double preco;
    public int quantidade;
//metodo para calcular o valor total do estoque de determinado produto
    public double valorTotalEstoque(){
        return preco * quantidade;
    }
//metodo para adicionar produtos ao estoque
    public void addProdutos(int quant){
        quantidade += quant;
    }
//metodo para remover produtos ao estoque
    public void remProdutos(int quant){
        quantidade -= quant;
    }
//metodo para impressao dos dados do produto    
    public String toString(){
            return nome + ", R$ "
            + String.format("%.2f", preco)
            + ", "
            + quantidade
            + " unidades, Total: R$ "
            + String.format("%.2f", valorTotalEstoque());

    }
}
