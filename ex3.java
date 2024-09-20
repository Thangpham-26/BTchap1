import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        char ch;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input a character: ");
        ch=keyboard.next().charAt(0);
        System.out.println("ASCII code of "+ch+ " is "+(byte)ch );
    }
}
