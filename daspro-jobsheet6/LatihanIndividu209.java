// Menambahkan import library Scanner.
import java.util.Scanner;

public class LatihanIndividu209 {
    public static void main(String[] args) {
        //Deklarasi variabel.
        int jumlahBuku, hargaBuku, jumlahDiskon, totalHargaBayar, potonganHarga, totalHarga;
        String jenisBuku;
        double diskon = 0;
        //Menambhakan deklarasi Scanner.
        Scanner input09 = new Scanner(System.in);
        //Baris kode untuk meminta inputan ke user.
        System.out.print("Masukkan jenis buku yang Anda beli: ");
        jenisBuku = input09.nextLine();
        System.out.print("Masukkan jumlah buku yang Anda beli: ");
        jumlahBuku = input09.nextInt();
        System.out.print("Masukkan harga buku yang Anda beli: ");
        hargaBuku = input09.nextInt();
        
    //Penggunaan nested if untuk melakukan pemilihan berdasarkan kondisi pada soal.
      if (jenisBuku.equalsIgnoreCase("Kamus")) {
        //Jika inputan adalah kamus maka blok if di bawah ini akan dijalankan.
        if (jumlahBuku > 2) 
            diskon = 0.12;
        //Jika jumlah buku > 2, maka akan mendapat diskon 12%.
        else diskon = 0.10;
        //Jika jumlah buku <= 2, maka akan mendapat diskon 10%
        } 

    //Jika input buku bukan kamus, maka akan dicek apakah novel atau bukan dengan else if di bawah ini.
      else if (jenisBuku.equalsIgnoreCase("Novel")) {
        //Jika inputan adalah novel maka blok if di bawah ini akan dijalankan.
        if (jumlahBuku > 3 )
            diskon = 0.09;
        //Jika jumlah buku > 3, maka akan mendapat diskon 9%.
        else 
            diskon = 0.08;
        //Jika jumlah buku <= 3, maka akan mendapat diskon 8%.
        }
        
    //Jika input buku bukan kamus dan novel, maka akan masuk ke blok else di bawah ini.
      else {
        if (jumlahBuku > 3)
            diskon = 0.05;
        //Jika jumlah buku > 3, maka akan mendapat diskon 5%. 
        //Jika jumlah buku <= 3, maka tidak mendapat diskon.
      }

      //Proses perhitungan total harga, jumlah diskon, potongan harga, dan total harga bayar setelah diskon.
      totalHarga = (hargaBuku*jumlahBuku);
      jumlahDiskon = (int) (diskon * 100);
      potonganHarga = (int) ((hargaBuku * jumlahBuku) * diskon);
      totalHargaBayar = ((jumlahBuku * hargaBuku) - potonganHarga);

      //Baris kode untuk memunculkan output.
      System.out.println("Harga awal sebelum mendapat potongan diskon: Rp " + totalHarga);
      System.out.println("Jumlah diskon yang Anda dapatkan adalah: " + jumlahDiskon + "%");
      System.out.println("Jumlah potongan harga yang Anda dapatkan adalah: Rp " + potonganHarga);
      System.out.println("Jumlah total harga yang harus Anda bayar adalah: Rp " + totalHargaBayar);

      //Menutup Scanner
      input09.close();
    }
} 
    
