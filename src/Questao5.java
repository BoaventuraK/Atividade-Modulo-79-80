import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int num1=0,num2=0;

        System.out.println("Digite o valor do primeiro numero: ");
        num1=sc.nextInt();

        System.out.println("Digite o valor do segundo numero: ");
        num2=sc.nextInt();

        System.out.println((num1>num2)?String.format("O numero primeiro (%d), é maior que o segundo (%d)",num1,num2) : String.format("O numero primeiro (%d), é maior que o segundo (%d)",num2,num1));

        sc.close();
    }
}
