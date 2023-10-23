import java.util.*;
public class Tugas109 {
    public static void main(String[] args) {

        //Deklarasi Scanner
        Scanner sc = new Scanner(System.in);

        //Meminta inputan jumlah elemen kepada user bertipe integer.
        System.out.print("Masukkan jumlah Elemen: ");
        int jmlElemen = sc.nextInt();

        //Deklarasi array 
        int[] nilai = new int[jmlElemen];

        //Meminta inputan nilai kepada user menggunakan struktur perulangan for.
        for (int i = 0; i < jmlElemen; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }
        
        //Mengurutkan nilai-nilai dalam array.
        Arrays.sort(nilai);

        //Menghitung nilai tertinggi dan terendah.
        int nilaiTertinggi = nilai[jmlElemen - 1];
        int nilaiTerendah = nilai[0];
        int total = 0;

        //Menghitung total nilai.
        for (int i = 0; i < jmlElemen; i++) {
            total += nilai[i];
        }

        //Menghitung rata-rata elemen array.
        double rata2 = total / jmlElemen;

        //Menampilkan hasil
        System.out.println("Nilai terbesar: " + nilaiTertinggi);
        System.out.println("Nilai terkecil: " + nilaiTerendah);
        System.out.println("Rata-rata: " + rata2);
    }
}
