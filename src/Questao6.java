import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        double notaProva1=0, notaProva2=0, notaTrabalho=0, media=0,somaNotas;

        System.out.println("Informe a primeira nota: ");
        notaProva1=sc.nextDouble();

        System.out.println("Informe a segunda nota: ");
        notaProva2=sc.nextDouble();

        System.out.println("Informe a nota do trabalho: ");
        notaTrabalho=sc.nextDouble();

        somaNotas=notaProva1+notaProva2+notaTrabalho;
        media=somaNotas/3;
        if(media < 7){
            System.out.println(String.format("Reprovado! com media %.2f",media));
        }else{
            System.out.println(String.format("Aprovado! com media %.2f",media));
        }

        sc.close();
    }
}
