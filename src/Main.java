import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y, media;

        System.out.print("Digit o proxime numero:");
        x=sc.nextDouble();
        System.out.print("digit o segundo numero:");
        y=sc.nextDouble();
        media=(x+y)/2.0;
        System.out.println("media= " +media);
        sc.close();

    }
}
