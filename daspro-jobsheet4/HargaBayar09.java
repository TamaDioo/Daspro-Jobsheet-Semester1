import java.util.Scanner;
public class HargaBayar09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga, jumlah, jmlHlmnBuku;
        double dis, total, bayar, jmlDis;
        String merk;
        System.out.println("Masukkan merk buku yang dibeli");
        merk= input.nextLine();
        System.out.println("Masukkan jumlah halaman buku yang dibeli");
        jmlHlmnBuku= input.nextInt();
        System.out.println("Masukkan besaran diskon");
        dis= input.nextDouble();
        System.out.println("Masukkan harga barang yang dibeli");
        harga= input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli");
        jumlah= input.nextInt();
        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;
        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);
    }
}
