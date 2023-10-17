import java.util.Scanner;

public class Gaji09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jmlMasuk, jmlTdkMasuk, TotGaji, gaji, potGaji;
        System.out.println("Masukkan gaji Anda");
        gaji=input.nextInt();
        System.out.println("Masukkan potongan gaji Anda");
        potGaji=input.nextInt();
        System.out.print("Masukkan jumlah Hari Masuk Kerja Anda: ");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda: ");
        jmlTdkMasuk=input.nextInt();
        TotGaji=(jmlMasuk*gaji)-(jmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah " + TotGaji);

    }
}