import java.util.Scanner;
public class ArrayNilai09 {
    public static void main(String[] args) {

        //Deklarasi Scanner
        Scanner sc = new Scanner(System.in);

        //Deklarasi array bertipe integer dengan nama nilaiAkhir berkapasitas 10 elemen
        int[] nilaiAkhir = new int[10];

        //Struktur perulangan untuk menerima input dan mengisi elemen array nilaiAkhir.
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = sc.nextInt();
        }
        //Struktur perulangan untuk menampilkan semua isi elemen array nilaiAkhir.
        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai akhir ke-"+i+" adalah "+nilaiAkhir[i]);
        }
    }
}