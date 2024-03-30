import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int  horasTrabalhadas=0;
        double valorHoraAula=0, salarioBruto=0, salarioLiquido=0, descontoINSS=0;

        System.out.println("Informe o valor da hora aula: ");
        valorHoraAula=sc.nextDouble();

        System.out.println("Infrome a quantidade de horas trabalhadas: ");
        horasTrabalhadas=sc.nextInt();

        System.out.println("Informe a porcentagem do desconto do INSS: ");
        descontoINSS=sc.nextDouble();

        salarioBruto=valorHoraAula*horasTrabalhadas;

        salarioLiquido=(salarioBruto-(descontoINSS/100*salarioBruto));

        System.out.println(salarioLiquido);
        System.out.println(String.format("O salario bruto do professor é de: R$%.2f; ja o liquido é: R$%.2f",salarioBruto,salarioLiquido));

        sc.close();
    }
}
