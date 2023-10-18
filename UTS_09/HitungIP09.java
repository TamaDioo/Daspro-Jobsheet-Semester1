import java.util.Scanner;
public class HitungIP09 {
    public static void main(String[] args) {

        //Deklarasi Scanner
        Scanner input09 = new Scanner(System.in);
        int jml_matKul = 0, jml_SKS, jml_MK_remidi = 0;
        String nama, matkul, indeks_nilai, konfirmasi;
        double totalSKS = 0, totalNilai = 0;

        //Meminta inputan kepas
        System.out.print("Masukkan nama: ");
        nama = input09.nextLine();

        //Inisialisasi variabel konfirmasi dengan y
        konfirmasi = "y";

        //Struktur perulangan while dengan kondisi konfirmasi = y
        while (konfirmasi.equalsIgnoreCase("y")) {
            System.out.print("Nama Mata Kuliah: ");
            matkul = input09.nextLine();

            System.out.print("Nilai (A, B+, B, C+, C, D, E): ");
            indeks_nilai = input09.nextLine();

            System.out.print("Masukkan jumlah SKS: ");
            jml_SKS = input09.nextInt();

            input09.nextLine(); 

            //Menambah jumlah matkul dan total SKS
            jml_matKul++;
            totalSKS += jml_SKS;

            //Mengkonversi nilai menggunakan switch case
            double nilai = 0;
            switch (indeks_nilai.toUpperCase()) {
                case "A":
                    nilai = 4.0;
                    break;
                case "B+":
                    nilai = 3.5;
                    break;
                case "B":
                    nilai = 3.0;
                    break;
                case "C+":
                    nilai = 2.5;
                    break;
                case "C":
                    nilai = 2.0;
                    break;
                case "D":
                    nilai = 1.0;
                    jml_MK_remidi++;
                case "E":
                    nilai = 0.0;
                    jml_MK_remidi++;
                    break;
            }

            //Menghitung total nilai
            totalNilai += nilai * jml_SKS;

            //Mengecek apakah pengguna ingin melanjutkan menginput nilai
            System.out.print("Apakah lanjut input nilai (Y/N)? ");
            konfirmasi = input09.nextLine();
        }

        //Menghitung ip dengan rumus dari soal
        double ip = totalNilai / totalSKS;

        //Menampilkan output
        System.out.println("\n-- Hasil Perhitungan IP --");
        System.out.println("Nama: " + nama);
        System.out.println("Indeks Prestasi (IP): " + ip);
        System.out.println("Jumlah mata kuliah: " + jml_matKul);
        System.out.println("Jumlah SKS: " + totalSKS);
        System.out.println("Jumlah mata kuliah yang harus perbaikan/remidi: " + jml_MK_remidi);
    }
}