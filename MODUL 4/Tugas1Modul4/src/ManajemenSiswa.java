import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Siswa {
    String nama;
    int nilai;

    public Siswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }
}

public class ManajemenSiswa {
    static ArrayList<Siswa> daftarSiswa = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Siswa");
            System.out.println("2. Urutkan dan Tampilkan berdasarkan Nama");
            System.out.println("3. Urutkan dan Tampilkan berdasarkan Nilai");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tambahSiswa();
                    break;
                case 2:
                    urutkanBerdasarkanNama();
                    break;
                case 3:
                    urutkanBerdasarkanNilai();
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);
    }

    static void tambahSiswa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan data siswa. Ketik 'selesai' untuk berhenti.");

        while (true) {
            System.out.print("Masukkan nama siswa: ");
            String nama = scanner.nextLine();
            if (nama.equalsIgnoreCase("selesai")) {
                break;
            }
            System.out.print("Masukkan nilai siswa: ");
            int nilai = scanner.nextInt();
            scanner.nextLine();
            daftarSiswa.add(new Siswa(nama, nilai));
            System.out.println("Data siswa berhasil ditambahkan.");
        }
    }

    static void urutkanBerdasarkanNama() {
        Collections.sort(daftarSiswa, new Comparator<Siswa>() {
            @Override
            public int compare(Siswa s1, Siswa s2) {
                return s1.nama.compareTo(s2.nama);
            }
        });
        tampilkanDataSiswa();
    }

    static void urutkanBerdasarkanNilai() {
        Collections.sort(daftarSiswa, new Comparator<Siswa>() {
            @Override
            public int compare(Siswa s1, Siswa s2) {
                return s2.nilai - s1.nilai;
            }
        });
        tampilkanDataSiswa();
    }

    static void tampilkanDataSiswa() {
        System.out.println("Data siswa:");
        for (Siswa siswa : daftarSiswa) {
            System.out.println("Nama: " + siswa.nama + ", Nilai: " + siswa.nilai);
        }
    }
}