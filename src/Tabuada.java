import java.util.Scanner;
public class Tabuada {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int numero;
        int contador=1;
        int resultado;

        System.out.println("TABUADA");
        System.out.println("DIGITE O NUMERO:");
        numero= sc.nextInt();

        while (contador<=10){
             resultado=numero*contador;

            System.out.println(numero+"x"+contador+"="+resultado);
            contador++;


        }
    }

}
