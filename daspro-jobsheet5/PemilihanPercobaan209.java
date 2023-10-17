import java.util.Scanner;
public class PemilihanPercobaan209 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);
        System.out.print("Nilai uas     : ");
        float uas = input09.nextFloat();
        System.out.print("Nilai uts     : ");
        float uts = input09.nextFloat();
        System.out.print("Nilai kuis    : ");
        float kuis = input09.nextFloat();
        System.out.print("Nilai tugas   : ");
        float tugas = input09.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String message = total < 65 ? "Remidi" : "Tidak remidi";
        System.out.println("Nilai akhir = " + total + " sehingga " + message);

        if (total >80 && total <= 100) {
        System.out.println("Selamat Anda mendapat nilai A dengan kualifikasi sangat baik");
        } else if (total >73 && total <= 80) {
        System.out.println("Selamat Anda mendapat nilai B+ dengan kualifikasi lebih dari baik");        
        } else if (total >65 && total <= 73) {
        System.out.println("Selamat Anda mendapat nilai B dengan kualifikasi baik");
        } 
        else if (total >60 && total <= 65) {
        System.out.println("Selamat Anda mendapat nilai C+ dengan kualifikasi lebih dari cukup");
        } else if (total >50 && total <= 60) {
        System.out.println("Selamat Anda mendapat nilai C dengan kualifikasi cukup");
        } else if (total >39 && total <= 50) {
        System.out.println("Mohon maaf Anda mendapat nilai D dengan kualifikasi kurang");
        }
         else if (total <= 39) {
        System.out.println("Sayang sekali Anda mendapat nilai E dengan kualifikasi gagal");
        }
    }
}
    

