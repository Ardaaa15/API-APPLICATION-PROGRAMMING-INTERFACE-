import java.util.Random;
import java.util.Scanner;

public class RandomPicker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Menghasilkan Bilangan Bulat Acak");
            System.out.println("2. Memilih Elemen Acak dari Array");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");

            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nilai minimum: ");
                    int min = scanner.nextInt();
                    System.out.print("Masukkan nilai maksimum: ");
                    int max = scanner.nextInt();
                    int angkaAcak = random.nextInt(max - min + 1) + min;
                    System.out.println("Bilangan bulat acak antara " + min + " dan " + max + ": " + angkaAcak);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah elemen dalam array: ");
                    int jumlahElemen = scanner.nextInt();
                    String[] array = new String[jumlahElemen];
                    for (int i = 0; i < jumlahElemen; i++) {
                        System.out.print("Masukkan elemen ke-" + (i+1) + ": ");
                        array[i] = scanner.next();
                    }
                    int indexAcak = random.nextInt(jumlahElemen);
                    System.out.println("Elemen acak dari array: " + array[indexAcak]);
                    break;
                case 3:
                    System.out.println("Keluar dari program.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}