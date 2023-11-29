import java.util.Scanner;
public class PenjumlahanRekursif09 {

    //Membuat fungsi rekursif untuk menjumlahkan bilangan 
    public static int penjumlahanRekursif(int n, int c) {
        if (n == c) {
            return n;
        } else {
            return n + penjumlahanRekursif(n + 1, c);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bil = sc.nextInt();

        System.out.print("Hasil penjumlahan deret bilangan : ");
        //mencetak penjumlahan deret angka  
        for (int i = 1; i <= bil; i++) {
            System.out.print(i);
            if (i < bil) {
                System.out.print(" + ");
            }
        }

        //Memanggil fungsi rekursif untuk menghitung penjumlahan deret
        System.out.print(" = " + penjumlahanRekursif(1, bil));
    }
}
