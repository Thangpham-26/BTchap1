import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("input two int numbers: ");
        int a=k.nextInt();
        int b=k.nextInt();
        System.out.println(a+" + "+b+" = "+(a+b));
        System.out.println(a+" - "+b+" = "+(a-b));
        System.out.println(a+" x "+b+" = "+(a*b));
        System.out.println(a+" / "+b+" = "+(a/b));
        System.out.println(a+" mod "+b+" = "+(a%b));

    }
}
