import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Çizmek istediğiniz elmasın yarı yüksekliğini tam sayı olarak giriniz : ");
        Scanner scanner = new Scanner(System.in);
        int hHeight = scanner.nextInt();


        for (int i = 0; i <= hHeight; i++) {
            for (int j = i; j <= (hHeight - 1); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = hHeight; i >= 0; i--) {
            for (int j = i; j <= (hHeight - 1); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
