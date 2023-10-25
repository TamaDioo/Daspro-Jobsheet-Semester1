import java.util.Scanner;

public class LinearSearch09 {
    public static void main(String[] args) {

        // Deklarasi Scanner
        Scanner sc = new Scanner(System.in);

        // Meminta inputan jumlah elemen kepada user.
        System.out.print("Masukkan jumlah elemen array: ");
        int jml_Elemen = sc.nextInt();

        // Instansiasi array berdasarkan jumlah elemen yang telah dimasukkan user.
        int[] arrayInt = new int[jml_Elemen];

        // Struktur perulangan untuk meminta nilai setiap elemen.
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-" + i + " : ");
            arrayInt[i] = sc.nextInt();
        }

        // Deklarasi dan inisialisasi variabel hasil untuk menyimpan indeks
        int hasil = 0;
        int i;
        //Menambahkan variabel boolean untuk pengecekan apakah key ditemukan
        //Diinisialisasi dengan false
        boolean ditemukan = false; 

        // Meminta inputan key yang ingin dicari user
        System.out.print("Masukkan key yang ingin dicari: ");
        int key = sc.nextInt();

        // Streuktur perulangan dan if untuk mencari key pada setiap elemen.
        for (i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                //Jika key ditemukan maka variabel boolean menjadi true.
                ditemukan = true; 
                break; // Jika menemukan key akan keluar dari loop.
            }
        }

        // Struktur if else untuk menentukan output jika key ditemukan/tidak.
        if (ditemukan == true) {
            System.out.println("Key ada di posisi indeks ke-" + hasil);
        } else {
            //Jika tidak ditemukan blok else akan dieksekusi.
            System.out.println("Key tidak ditemukan");
        }
    }
}
