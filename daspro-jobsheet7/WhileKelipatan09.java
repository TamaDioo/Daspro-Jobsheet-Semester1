import java.util.Scanner;
public class WhileKelipatan09 { 
    public static void main(String[] args) {
         //Deklarasi scanner
         Scanner scan = new Scanner(System.in);

         //Inisialisasi variabel
         int kelipatan, jumlah = 0, counter = 0, i = 1;
         double rataRata = 0;

          //Kode untuk meminta input dari keyboard
        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan.nextInt();

        //Struktur perulangan while dengan kondisi pemilihan if untuk menentukan bilangan kelipatan.
        while (i <= 50) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
                //Menghitung rata-rata dari seluruh bilangan kelipatan yang ditentukan.
                rataRata = (double) jumlah / counter;
            }
             i++;
        }
        //Tampilkan banyaknya bilangan kelipatan, total bilangan, dan rata-rata kelipatan pada rentang 1 sampai dengan 50.
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("Rata-rata dari seluruh bilangan kelipatan %d adalah: %.2f\n", kelipatan, rataRata);  
        // .2 digunakan untuk menampilkan dua digit angka setelah koma, f digunakan untuk mencetak nilai desimal.
    }   
}
