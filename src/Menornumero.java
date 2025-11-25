import java.util.Scanner;
public class Menornumero {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int numero;
        int menor= Integer.MAX_VALUE; //QUANDO É PARA ACHAR O MENOR VALOR

        System.out.println("DIGITE 0 PARA ENCERRAR");

        System.out.println("Digite um numero:");
        numero= sc.nextInt();

        while (numero!=0) {
            if (numero < menor) {
                menor = numero;
            }

            numero = sc.nextInt();

        }

        System.out.println("O MENOR NUMERO É:"+menor);
        sc.close();

        }

    }

