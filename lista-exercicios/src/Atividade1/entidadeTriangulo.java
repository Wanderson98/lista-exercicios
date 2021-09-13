package Atividade1;

public class entidadeTriangulo {
    //dados da entidade triangulo
    public double medida1;
    public double medida2;
    public double medida3;

    //metodo para calculo da area do triangulo
    public double calcularArea(){
        double p = (medida1 + medida2 + medida3) / 2;
        return  Math.sqrt(p * (p - medida1) * (p - medida2) * (p - medida3) );
    
    }
    
}