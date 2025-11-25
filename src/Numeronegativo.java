import java.util.Scanner;
public class Numeronegativo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int numero;
        int soma=0;

        System.out.println("DIGITE UM NUMERO<0 PARA ENCERRAR");

        System.out.println("Digite o numero1:");
        numero= sc.nextInt();

        while (numero>=0) {
            soma = soma + numero;

            System.out.println("Digite o numero2:");
            numero = sc.nextInt();
        }
            System.out.println("a soma é:"+soma);

            sc.close();

        }
    }


