import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        double temperatura=0;

        System.out.println("Qual a teperatura informada pelo termometro em graus celsius? ");
        temperatura=sc.nextDouble();

        if(temperatura>37){
            System.out.println("Voce esta com febre!");
        }else if(temperatura<36){
            System.out.println("Sua temperatura esta abaixo do que deveria!");
        }else{
            System.out.println("Sua temperatura esta normal!!");
        }

        sc.close();
    }
}
