import java.util.Scanner;

public class DeretDescendingRekursif09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int n = sc.nextInt();
        //Memanggil fungsi rekursif
        System.out.println("Deret descending rekursif:");
        descendingRekursif(n);
        //Memanggil fungsi iteratif
        System.out.println("\nDeret descending iteratif:");
        descendingIteratif(n);
    }

    //Membuat fungsi rekursif untuk menampilkan deret
    static void descendingRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            descendingRekursif(n - 1);
        }
    }

    //Membuat fungsi untuk menampilkan deret menggunakan iteratif
    static void descendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}