import java.util.Scanner;

public class Percobaan609 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Deklarasi variabel panjang, lebar, tinggi, luas dan volume
        bertipe integer*/
        int p, l, t, L, vol;

        //Meminta inputan panjang, lebar, dan tinggi dari user
        System.out.println("Masukkan panjang");
        p=input.nextInt();
        System.out.println("Masukkan lebar");
        l=input.nextInt();
        System.out.println("Masukkan tinggi");
        t=input.nextInt();

        //Menghitung luas dengan memanggil fungsi hitungLuas
        L=hitungLuas(p, l);
        System.out.println("Luas persegi panjang adalah " +L);

        //Menghitung volume dengan memanggil fungsi hitungVolume
        vol=hitungVolume(t, p, l);
        System.out.println("Volume balok adalah " +vol);
    }

    //Membuat fungsi hitungLuas
    static int hitungLuas (int pjg, int lb) {
        int Luas=pjg*lb;
        return Luas;
    }

    //Membuat fungsi hitungVolume
    static int hitungVolume (int tinggi, int a, int b) {
        int Volume= hitungLuas(a,b)*tinggi;
        return Volume;
    }
}