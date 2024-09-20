import javax.swing.*;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        byte ASCIIcode;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input an ASCII code:");
        ASCIIcode = keyboard.nextByte();
        System.out.println("ASCII code " + ASCIIcode +" is " + (char)ASCIIcode);
    }
}
