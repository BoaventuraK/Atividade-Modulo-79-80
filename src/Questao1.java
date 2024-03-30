import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int horasTrabalhadas=0;
        double salario=0, valorHora=20;

        System.out.println("Quantas horas o operario trabalhou esse mes?");
        horasTrabalhadas=sc.nextInt();

        salario=horasTrabalhadas*valorHora;

        System.out.println(String.format("O salario do  esse mes sera de: %.2fR$",salario));

        sc.close();
    }
}