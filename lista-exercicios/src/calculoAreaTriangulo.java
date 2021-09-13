import java.util.Scanner;
public class calculoAreaTriangulo {

    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        //criação de novos objetos para usar os atributos da entidade triangulo
        entidadeTrinagulo x, y;
        x = new entidadeTrinagulo();
        y = new entidadeTrinagulo();
        //leitura dos dados
        System.out.println("Digite as areas do Triangulo1");
        System.out.print("Medida 1: ");
        x.medida1 = ler.nextDouble();
        System.out.print("Medida 2: ");
        x.medida2 = ler.nextDouble();
        System.out.print("Medida 3: ");
        x.medida3 = ler.nextDouble();
        //atribuindo o resultado do calculo da area feito no metodo da entidade triangulo
        double areaTriangulo1 = x.calcularArea();

        System.out.println("Digite as areas do Triangulo2");
        System.out.print("Medida 1: ");
        y.medida1 = ler.nextDouble();
        System.out.print("Medida 2: ");
        y.medida2 = ler.nextDouble();
        System.out.print("Medida 3: ");
        y.medida3 = ler.nextDouble();
        //as mesmas operações em cima agora para o triangulo 2
        double areaTriangulo2 = y.calcularArea();
        //Impressão das areas calculadas
        System.out.printf("Area do trinagulo 1: %.2f%n", areaTriangulo1);
        System.out.printf("Area do trinagulo 2: %.2f%n", areaTriangulo2);
        //logica para ver qual area é maior e ser imprimida para o usuário  
            if (areaTriangulo1 > areaTriangulo2){
                System.out.print("Area maior: Triangulo 1");
            } else if(areaTriangulo1 == areaTriangulo2) { 
                System.out.print("Area maior: Os dois triangulos possuem a mesma area !");
            }else{
                System.out.println("Area maior: Triangulo 2");
            }  
            ler.close();
    } 
    
}