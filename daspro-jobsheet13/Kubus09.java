import java.util.Scanner;
public class Kubus09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Deklarasi variabel sisi, luas permukaan, dan volume
        int s, Lp, vol;

        //Meminta inputan panjang sisi kubus
        System.out.print("Masukkan sisi kubus: ");
        s=input.nextInt();

        //Memanggil fungsi hitungLuasPermukaan
        Lp=hitungLuasPermukaan(s);
        System.out.println("Luas permukaan kubus adalah: " + Lp);

        //Memanggil fungsi hitungVolumeKubus
        vol=hitungVolumeKubus(s);
        System.out.println("Volume kubus adalah: " + vol);

    }
    //Membuat fungsi untuk menghitung luas permukaan kubus
    public static int hitungLuasPermukaan(int s) {
        int Luaspermukaan=6*s*s;
        return Luaspermukaan;
    }
    //Membuat fungsi untuk menghitung volume kubus
    public static int hitungVolumeKubus(int s) {
        int Volume=s*s*s;
        return Volume;
    }
}