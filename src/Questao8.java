import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        double raio=0,area=0;

        System.out.println("Digite o raio do circulo: ");
        raio=sc.nextDouble();

        area=Math.PI*Math.pow(raio,2);

        System.out.println(String.format("A area do circulo é: %.2f",area));

        sc.close();
    }
}
