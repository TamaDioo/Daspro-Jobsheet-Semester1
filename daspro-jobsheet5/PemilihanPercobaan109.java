import java.util.Scanner;
public class PemilihanPercobaan109 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input09.nextInt();
            String hasil = (angka %2 == 0) ? "Angka "+angka+" adalah bilangan genap." : "Angka "+angka+" adalah bilangan ganjil." ;
            System.out.println(hasil);
    }
}