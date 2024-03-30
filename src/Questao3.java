import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int idade=0;

        System.out.println("Informe sua idade: ");
        idade=sc.nextInt();

        if(idade<18){
            System.out.println("Você ainda não pode tirar a carteira de motorista!!");
        }else{
            System.out.println("Você ja esta apto a tirar a carteira de motorista!!");
        }

        sc.close();
    }
}
