import java.util.Scanner;
import java.lang.Math;

public class Questao7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        double altura=0,peso=0,imc=0;

        System.out.println("Digite seu peso: ");
        peso=sc.nextDouble();

        System.out.println("Digite sua altura: ");
        altura=sc.nextDouble();

        imc=peso/(Math.pow(altura,2));

        if (imc>30){
            System.out.println(String.format("Seu IMC é de: %.2f, você esta obeso",imc));
        }else{
            System.out.println(String.format("Seu IMC é de: %.2f, você não esta obeso",imc));
        }

        sc.close();
    }
}
