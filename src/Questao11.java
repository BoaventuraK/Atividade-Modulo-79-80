import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String resultado=null;
        int num1=0, num2=0, soma=0;

        System.out.println("Informe o primeiro numero inteiro: ");
        num1=sc.nextInt();

        System.out.println("Informe o segundo numero inteiro: ");
        num2=sc.nextInt();

        soma=num1+num2;

        resultado=soma>=10 ? String.format("O resuldao da soma é: %d, acrescido de 5 fica: %d",soma,(soma+5)) : String.format("O resuldao da soma é: %d, decrescido de 7 fica: %d",soma,(soma-7));
        System.out.println(resultado);

        sc.close();
    }
}
