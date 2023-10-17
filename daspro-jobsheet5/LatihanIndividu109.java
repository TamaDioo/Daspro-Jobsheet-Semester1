import java.util.Scanner;
public class LatihanIndividu109 {
    public static void main(String[] args) {
        Scanner jarak  = new Scanner(System.in);
        int jarak_pertarungan;

        System.out.print("Masukkan jarak pertarungan: ");
        jarak_pertarungan = jarak.nextInt();

        if (jarak_pertarungan<5 ) {
            System.out.println("Gunakan melee weapon");
        }
        else if (jarak_pertarungan >= 5) {
            System.out.println("Gunakan ranged weapon");
        }  
    }
}

     
