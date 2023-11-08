import java.util.Scanner;
public class TugasIndividu309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print(" Masukkan tinggi nilai X: ");
        int X = sc.nextInt(); 

        //Memastikan nilai X adalah bilangan ganjil
        if (X % 2 == 0) {
            System.out.println("Nilai X harus bilangan ganjil");
            return;
        }

        //Perulangan untuk mencetak pola X
        for (int i = 1; i <= X; i++) {
            for (int j = 1; j <= X; j++) {
                if (j == i || j == (X - i + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}