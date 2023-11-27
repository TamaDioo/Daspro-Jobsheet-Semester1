import java.util.Scanner;

public class CekPrimaRekursif09 {
    //Membuat fungsi untuk mengecek bilangan prima
    public static void cekPrimaRekursif(int n, int pembagi) {
        if (n <= 1) {
            System.out.println(n + " bukan bilangan prima.");
        } else if (pembagi == 1) {
            System.out.println(n + " merupakan bilangan prima.");
        } else if (n % pembagi == 0) {
            System.out.println(n + " bukan bilangan prima.");
        } else {
            // Memanggil fungsi rekursif dengan pembagi yang lebih kecil
            cekPrimaRekursif(n, pembagi - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int bil = sc.nextInt();

        //Memanggil fungsi untuk mengecek bilangan prima
        cekPrimaRekursif(bil, bil - 1);
    }
}