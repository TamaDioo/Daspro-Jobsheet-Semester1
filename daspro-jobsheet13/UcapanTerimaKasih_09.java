import java.util.Scanner;

public class UcapanTerimaKasih_09 {
    //Membuat fungsi PenerimaUcapan
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan:");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

     //Membuat fungsi UcapanTerimaKasih
     public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you" + " " + nama+ " " + "for being the best teacher in the world.\n" +
        "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();//Memanggil fungsi UcapanTerimaKasih
        UcapanTambahan("Salam Sehat");//Memanggil fungsi UcapanTambahan
    }

    //Membuat fungsi UcapanTambahan
    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }
}