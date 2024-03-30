import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double num1=0,num2=0,soma=0;

        System.out.println("Informe o primeiro numero: ");
        num1=sc.nextDouble();

        System.out.println("Informe o segundo numero: ");
        num2=sc.nextDouble();

        soma=num1+num2;

        if(soma>10){
            System.out.println(String.format("A soma de %.2f + %.2f é igual a: %.2f",num1,num2,soma));
        }

        System.out.println("Fim do programa");
        sc.close();
    }
}
