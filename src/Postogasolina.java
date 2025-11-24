import java.util.Scanner;
public class Postogasolina {
    public  static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        double gasolina=6.90;
        double etanol=4.73;
        double diesel=6.50;
        double litro;
        double total;

        System.out.println("ESCOLHA O COMBUSTÍVEL QUE DESEJA:");
        System.out.println("1-GASOLINA");
        System.out.println("2-ETANOL");
        System.out.println("3-DIESEL");

        int opcao=sc.nextInt();

        System.out.println(" quantos litros deseja pagar?");
        litro= sc.nextDouble();

        if (opcao==1){
            total= litro*gasolina;
            System.out.printf("total: r$ %.2f",total);
        } else if (opcao==2) {
            total=litro*etanol;
            System.out.printf("total: r$ %.2f",total);
        }
        else {
            total=litro*diesel;
            System.out.printf("total: r$ %.2f",total);

        }

        sc.close();
    }
}
