import java.util.Scanner;

public class ManipulasiString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = scanner.nextLine();

        // Mengubah semua huruf menjadi kapital
        String kalimatKapital = kalimat.toUpperCase();
        System.out.println("Huruf kapital: " + kalimatKapital);

        // Mengganti kata
        System.out.print("Masukkan kata yang ingin diganti: ");
        String kataLama = scanner.nextLine();
        System.out.print("Masukkan kata pengganti: ");
        String kataBaru = scanner.nextLine();

        String[] kataKata = kalimat.split(" ");
        StringBuilder kalimatBaru = new StringBuilder();
        for (String kata : kataKata) {
            if (kata.equals(kataLama)) {
                kalimatBaru.append(kataBaru).append(" ");
            } else {
                kalimatBaru.append(kata).append(" ");
            }
        }
        System.out.println("Setelah mengganti kata: " + kalimatBaru.toString());

        // Membalikkan kata
        String[] kataTerbalik = kalimat.split(" ");
        StringBuilder kalimatTerbalik = new StringBuilder();
        for (String kata : kataTerbalik) {
            kalimatTerbalik.append(new StringBuilder(kata).reverse().toString()).append(" ");
        }
        System.out.println("Kalimat terbalik: " + kalimatTerbalik.toString());
    }
}