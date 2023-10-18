import java.util.Scanner;

public class Toko09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Toko");
        System.out.print("Masukkan nama Anda: ");
        String nama = sc.nextLine();

        // Variable
        double totalHarga = 0;
        double totalDiskon = 0;
        int jmlProduk = 0;

        String tambah_produk = "y";

        // Inputan produk
        while (tambah_produk.equalsIgnoreCase("y")) {
            System.out.print("Masukkan produk yang Anda beli: ");
            String produk = sc.nextLine();

            System.out.print("Banyaknya: ");
            int qty = sc.nextInt();

            System.out.print("Harga: ");
            double harga = sc.nextDouble();

            System.out.print("Diskon (%): ");
            double diskon = sc.nextDouble();

            // Perhitungan diskon 
            double hargaDiskon = harga * (1 - diskon / 100);
            double hargaTotal = hargaDiskon * qty;

            totalHarga += harga * qty;
            totalDiskon += harga * qty - hargaTotal;
            jmlProduk += qty;

            System.out.print("Apakah Anda mau menambahkan produk (Y/N)? ");
            tambah_produk = sc.nextLine();
        }

        // Menanyakan apakah pelanggan punya kartu member
        System.out.print("Apakah Anda punya kartu member (Y/N)? ");
        String member = sc.nextLine();

        System.out.println("===============Total Pembelian===============");
        System.out.println("Nama pelanggan: " + nama);

        // Pengecekan dan perhitungan kartu member
        if (member.equalsIgnoreCase("Y")) {
            System.out.println("Tipe: Member");
            double diskon_member = totalHarga >= 200000 ? 0.1 : 0.05;
            totalDiskon += diskon_member * totalHarga;
        } else {
            System.out.println("Tipe: Non-Member");
        }

        System.out.println("Total item barang yang dibeli: " + jmlProduk);

        //Perhitungan hasil penjumlahan
        double totalHargaBayar = totalHarga - totalDiskon;

        System.out.println("SubTotal                    = " + totalHarga);
        System.out.println("Total Diskon                = " + totalDiskon);
        System.out.println("Total yang Harus dibayar    = " + totalHargaBayar);
    }
}