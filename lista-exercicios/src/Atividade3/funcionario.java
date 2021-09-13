package Atividade3;
//classe funcionario
public class funcionario {
//declaração de variaveis para atribução de dados
    public String nome;
    public double salarioBruto;
    public double imposto;
//metodo para calcular o salario liquido
public double salarioLiquido(){
    return salarioBruto - imposto;
}
//metodo para aumentar o salario
public void aumentarSalario(double taxa){
    salarioBruto *= (taxa/100 + 1);
}
//metodo para impressão dos dados
public String toString(){
    return nome
    +", Salario R$ "
    + String.format("%.2f", salarioLiquido());
}

}
