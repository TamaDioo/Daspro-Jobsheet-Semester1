import java.util.Scanner;

public class FiturTotalGaji09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        int jumlahKaryawan, jamLembur;
        double gajiPokok, gajiLembur = 20000;

        // Membaca jumlah karyawan
        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan = input.nextInt();

        // Perulangan for untuk menghitung gaji karyawan
        for (int i = 0; i < jumlahKaryawan; i++) {
            // Membaca data karyawan
            System.out.print("Masukkan gaji pokok karyawan ke-" + (i + 1) + ": ");
            gajiPokok = input.nextDouble();
            System.out.print("Masukkan jam kerja lembur karyawan ke-" + (i + 1) + ": ");
            jamLembur = input.nextInt();

            // Menghitung gaji karyawan
            double totalGajiLembur = jamLembur * gajiLembur;
            double gaji = gajiPokok + totalGajiLembur;

            // Menampilkan gaji karyawan
            System.out.println("Gaji karyawan ke-" + (i + 1) + ": " + gaji);
        }
    }
}