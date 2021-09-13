package Atividade4;

public class aluno {
    //declaração das variaveis  
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    //metodo do calculo da media 
    public double calculoMedia(){
        return (nota1 + nota2 + nota3);
    }
    //metodo para verificação da aprovação ou reprovação do aluno
    public void analiseMedia(){
        if(calculoMedia()>= 60){
            System.out.printf("Parabéns, você foi aprovado!!\n" +
            "Sua media foi: %.2f%n", calculoMedia() );
        } else {
            double media = 60 - calculoMedia() ;
            System.out.printf("Infelizmente você foi reprovado!!\n" +
            "Faltaram: %.2f pontos para a aprovação\n", media);
        }
    }
}
