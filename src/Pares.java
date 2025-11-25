import java.util.Scanner;
public class Pares {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int  numero;
        int pares=0;

        System.out.println(" DIGITE 10 NUMEROS");

        for (int i=1; i<=10; i++){
            System.out.println("");
            numero= sc.nextInt();

            if (numero %2==0){
                pares++;

            }
        }

        System.out.println("Você digitou " + pares + " números pares.");
        sc.close();
    }
}
