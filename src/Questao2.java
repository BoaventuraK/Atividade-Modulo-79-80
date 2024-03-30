import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int distancia=0;
        double precoGasolina=0, kmPorLitro=12, quantidadeGasolina=0, custo=0;

        System.out.println("Qual a distancia ate a fazenda? ");
        distancia=sc.nextInt();

        System.out.println("Qual o preço atual da gasolina? ");
        precoGasolina=sc.nextDouble();

        quantidadeGasolina=(distancia/kmPorLitro);
        custo=quantidadeGasolina*precoGasolina;

        System.out.println(String.format("Para chegar ate a fazenda, serão nessesarios %.0fL de gasolina, o que trara um custo de R$%.2f",quantidadeGasolina,custo));

        sc.close();
    }
}
