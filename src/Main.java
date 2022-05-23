import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, sayac = 0, total = 0;
        double average;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        for (int i = 0; i <= number; i++) {

            if (i % 3 == 0 && i % 4 == 0) {
                total += i;
                sayac++;
            }
        }
        average = total / sayac;
        System.out.println("Sayıların ortalaması: " + average);
    }
}