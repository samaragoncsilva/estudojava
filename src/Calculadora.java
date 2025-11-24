import  java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, resultado=0;
        String opcao = "";

        System.out.println("digite o n1:");
        num1 = sc.nextDouble();
        System.out.println("digite o n2:");
        num2 = sc.nextDouble();


        System.out.println(" ESCOLHA A OPERAÇÃO:");
        System.out.println("+");
        System.out.println("-");
        System.out.println("*");
        System.out.println("/");

        opcao = sc.next();

        switch (opcao) {

            case "+":
                resultado = num1 + num2;
                break;

            case "-":
                resultado = num1 - num2;
                break;

            case "*":
                resultado = num1 * num2;
                break;

            case "/":
                resultado = num1 / num2;
                break;

        }

        System.out.println("resultado=" + resultado);

        sc.close();
    }
}





