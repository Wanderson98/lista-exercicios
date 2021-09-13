import java.util.Scanner;
public class calculoAreaTriangulo {

    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        float medida1, medida2, medida3;

        System.out.println("Digite as areas do Triangulo1");
        System.out.print("Medida 1: ");
        medida1 = ler.nextFloat();
        System.out.print("Medida 2: ");
        medida2 = ler.nextFloat();
        System.out.print("Medida 3: ");
        medida3 = ler.nextFloat();

        float areaTriangulo1 = (medida1 + medida2 + medida3) / 2;

        System.out.println("Digite as areas do Triangulo2");
        System.out.print("Medida 1: ");
        medida1 = ler.nextFloat();
        System.out.print("Medida 2: ");
        medida2 = ler.nextFloat();
        System.out.print("Medida 3: ");
        medida3 = ler.nextFloat();

        
        float areaTriangulo2 = (medida1 + medida2 + medida3) / 2;
        
        System.out.printf("Area do trinagulo 1: %.2f%n", areaTriangulo1);
        System.out.printf("Area do trinagulo 2: %.2f%n", areaTriangulo2);

            if (areaTriangulo1 > areaTriangulo2){
                System.out.print("Area maior: Triangulo 1");
            } else if(areaTriangulo1 == areaTriangulo2) { 
                System.out.print("Area maior: Os dois triangulos possuem a mesma area !");
            } else{
                System.out.print("Area maior: Triangulo 2");
            }      

     
            ler.close();

        
    } 
    
}
