import java.util.Scanner;

public class Individu109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        
         // Memastikan nilai N < 3
         if (N < 3) {
            System.out.println("Nilai N minimal 3!");
            return;
        }

        //Mencetak tampilan segitiga angka
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}