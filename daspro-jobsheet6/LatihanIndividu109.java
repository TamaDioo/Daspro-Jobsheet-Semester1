import java.util.Scanner;

public class LatihanIndividu109 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = input09.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = input09.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        int bil3 = input09.nextInt();

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                System.out.println("Bilangan terbesar adalah bilangan " + bil1);
            } else {
                System.out.println("Bilangan terbesar adalah bilangan " + bil3);
            }
        } else {
            if (bil2 > bil3) {
                System.out.println("Bilangan terbesar adalah bilangan " + bil2);
            } else {
                System.out.println("Bilangan terbesar adalah bilangan " + bil3);
            }
            input09.close(); 
        }
    }
}
