import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;


        for (i = 0; i <= 5; i++) {
            System.out.print(" digite os nomes:");
            String nome= sc.nextLine();
            System.out.println("Nome " + (i + 1) + ": " + nome);
        }
        sc.close();
    }
}



