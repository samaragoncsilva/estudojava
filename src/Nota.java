import  java.util.Scanner;
public class Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, media;

        System.out.print("digite a sua primeira nota:");
        nota1 = sc.nextDouble();
        System.out.print("digite a segunda nota:");
        nota2 = sc.nextDouble();
        System.out.print("digite a terceira nota:");
        nota3 = sc.nextDouble();
        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("ALUNO PROVADO!");
        } else {
            System.out.println("ALUNO REPROVADO!");
        }

        System.out.printf("media final: %.2f", media);
        sc.close();
    }
}







