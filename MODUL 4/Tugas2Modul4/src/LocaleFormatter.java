import java.util.Locale;
import java.util.Currency;
import java.text.NumberFormat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;

public class LocaleFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Locale[] locales = {
                Locale.US,
                Locale.UK,
                Locale.FRANCE,
                Locale.JAPAN,
                Locale.CHINA,
                new Locale("in", "ID")
        };

        System.out.print("Masukkan angka: ");
        double number = scanner.nextDouble();

        System.out.print("Masukkan tanggal (dd-MM-yyyy): ");
        String dateString = scanner.next();

        SimpleDateFormat inputDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = null;

        try {
            date = inputDateFormat.parse(dateString);
        } catch (ParseException e) {
            System.out.println("Format tanggal tidak sesuai. Harap masukkan dalam format dd-MM-yyyy.");
            return;
        }

        for (Locale locale : locales) {
            NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);
            Currency currency = Currency.getInstance(locale);
            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
            DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);

            System.out.printf("Locale:          %-20s\n", locale.toString());
            System.out.printf("Language:        %-20s\n", locale.getDisplayLanguage());
            System.out.printf("Country:         %-20s\n", locale.getDisplayCountry());
            System.out.printf("Display Name:    %-20s\n", locale.getDisplayName());

            System.out.println("\nLocale: " + locale.getDisplayCountry());
            System.out.println("Formatted number: " + numberFormat.format(number));
            System.out.println("Formatted currency: " + currencyFormat.format(number));
            System.out.println("Currency symbol: " + currency.getSymbol());
            System.out.println("Formatted date: " + dateFormat.format(date));
            System.out.println("----------------");
            System.out.println(); // Blank line for separation

        }
    }
}


/*
api adalah perantara dua sistem atau aplikasi untuk saling berkomunikasi
contohnya aplikasi cuaca yang menampilkan suhu, aplikasi itu menggunakan api untuk mengambil data dari program lain
tanpa harus tau bagaiamana semuanya di buat di balik layar


library adalah alat bantu code atau fungsi yg siap di gunakan untuk membantu pengguna menyelesaikan tugas,
seperti kotak alat bantu kalo kita mau memasang paku di tembok kita butuh palu, kita tinggal ambil palu itu di kotak alat
tanpa harus membuat palu sendiri
 */
