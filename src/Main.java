// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.oertugrulmuhit@gmail.com
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int acilis=10,minodeme=20,mesafe;

        double perKM=2.2,tutar;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafe Girin:");
        mesafe=input.nextInt();
        tutar=acilis+(perKM*mesafe);
        tutar=tutar<minodeme?minodeme:tutar;
        System.out.printf("tutar:"+tutar);
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

    }
}