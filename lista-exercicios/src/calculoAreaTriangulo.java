import java.util.Scanner;
public class calculoAreaTriangulo {

    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        double medida1, medida2, medida3;

        System.out.println("Digite as areas do Triangulo1");
        System.out.print("Medida 1: ");
        medida1 = ler.nextDouble();
        System.out.print("Medida 2: ");
        medida2 = ler.nextDouble();
        System.out.print("Medida 3: ");
        medida3 = ler.nextDouble();

        double Triangulo1 = (medida1 + medida2 + medida3) / 2;
        double areaTriangulo1 = Math.sqrt(Triangulo1 * (Triangulo1 - medida1) * (Triangulo1 -medida2) * (Triangulo1 - medida3) );

        System.out.println("Digite as areas do Triangulo2");
        System.out.print("Medida 1: ");
        medida1 = ler.nextDouble();
        System.out.print("Medida 2: ");
        medida2 = ler.nextDouble();
        System.out.print("Medida 3: ");
        medida3 = ler.nextDouble();

        
        double Triangulo2 = (medida1 + medida2 + medida3) / 2;
        double areaTriangulo2 = Math.sqrt(Triangulo2 * (Triangulo2 - medida1) * (Triangulo2 -medida2) * (Triangulo2 - medida3) );

        
        System.out.printf("Area do trinagulo 1: %.2f%n", areaTriangulo1);
        System.out.printf("Area do trinagulo 2: %.2f%n", areaTriangulo2);

            if (areaTriangulo1 > areaTriangulo2){
                System.out.print("Area maior: Triangulo 1");
            } else if(areaTriangulo1 == areaTriangulo2) { 
                System.out.print("Area maior: Os dois triangulos possuem a mesma area !");
            }else{
                System.out.print("Area maior: Triangulo 2");
            }  
            ler.close();
    } 
    
}
