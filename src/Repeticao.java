import java.util.Scanner;
public class Repeticao {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num;
        int maior = Integer.MIN_VALUE; //QUANDO É PRA ACHAR O MAIOR VALOR

        System.out.println("Digite os números:(0 para parar)");
        num=sc.nextInt();

        while (num!=0){
            if (num>maior){
                maior=num;

            }
            num=sc.nextInt();
        }
        System.out.println("maior número:"+maior);


    }
}
