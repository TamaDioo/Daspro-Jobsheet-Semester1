import java.util.Scanner;

public class FiturInputData09 {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
    


        // Deklarasi variabel untuk menyimpan data karyawan
        String nama = "";
        String alamat = "";
        String divisi = "";

        // Perulangan for untuk input data karyawan
        for (int i = 0; i <= 3; i++) {
            System.out.println("-----------------------------");
            System.out.println("Data Karyawan ke-" + (i + 1));
            System.out.println("-----------------------------");
            System.out.print("Nama: ");
            nama = sc1.nextLine();
            System.out.print("Alamat: ");
            alamat = sc2.nextLine();
            System.out.println("------- Divisi -------");
            System.out.println("1. Front Office");
            System.out.println("2. House Keeping");
            System.out.println("3. Food and Beverage Service");
            System.out.println("4. Administrasi");
            System.out.print("Masukkan kategori divisi anda : ");
            divisi = sc3.nextLine();
            System.out.println("----------------------");
        }

        // Menampilkan data karyawan
        for (int i = 0; i <= 3; i++) {
            System.out.println();
            System.out.println("Karyawan ke-" + (i + 1));
            System.out.println();
            System.out.println("Nama: " + nama);
            System.out.println("Alamat: " + alamat);
            System.out.println("Divisi: " + divisi);
        }

        sc3.close();
    }
}