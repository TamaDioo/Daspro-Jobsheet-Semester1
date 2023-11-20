import java.util.Scanner;

public class Ucapan_09 {
    //Membuat fungsi PenerimaUcapan
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan:");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void main(String[] args) {
        //mengisi variabel nama dengan fungsi PenerimaUcapan
        String nama = PenerimaUcapan(); 
        System.out.println("Thank you" + " " + nama + "\nMay the force be with you");
    }
}