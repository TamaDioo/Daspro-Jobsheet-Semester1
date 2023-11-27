import java.util.Scanner;
public class PenjumlahanRekursif09 {

    //Membuat fungsi rekursif untuk menjumlahkan bilangan 
    public static int penjumlahanRekursif(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + penjumlahanRekursif(n - 1);
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

        //Memanggil fungsi rekursif
        System.out.print(" = " + penjumlahanRekursif(bil));
    }
}
