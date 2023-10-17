import java.util.Scanner;
public class SistemPenggajian09$gaji {
    public class gaji {
        public static void main(String[] args) {
            try (Scanner scan = new Scanner(System.in)) {
                System.out.print("Masukkan nama: ");
                String nama = scan.nextLine();
                System.out.print("Masukkan jumlah hari kerja: ");
                int hariKerja = scan.nextInt();
                System.out.print("Masukkan jumlah jam lembur: ");
                int jamLembur = scan.nextInt();

                int gajiPokok = 30000;
                int jumlahGajiPokok = gajiPokok * hariKerja;
                int gajiLembur = 6000;
                int jumlahGajiLembur = gajiLembur * jamLembur;

                int jumlahGajiBulanan = jumlahGajiPokok + jumlahGajiLembur;

                System.out.println("----------------------------------");
                System.out.println("Nama : " + nama);
                System.out.println("Gaji pokok : " + jumlahGajiPokok);
                System.out.println("Gaji lembur : " + jumlahGajiLembur);
                System.out.println("Jumlah gaji bulanan : " + jumlahGajiBulanan);
            }

            System.out.println("==================================");   

        
        }
    }
}
