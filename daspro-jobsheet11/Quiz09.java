import java.util.Scanner;
import java.util.Random;
public class Quiz09 {
    public static void main(String[] args) {
        //Deklarasi objek dari class Random dan class Scanner, Class Random.
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        char menu='y';
        do{
            int number = random.nextInt(10) + 1;
            boolean success = false;
        do {
            System.out.print("Tebak angka (1-10): ");
            int answer = input.nextInt();
            input.nextLine();
            success = (answer == number);
            //Struktur pemilihan if-else if-else dalam perulangan dalam untuk mengecek angka tebakan
            if (answer < number) {
                System.out.println("Angka tebakan lebih kecil dari jawaban yang benar.");
            } else if (answer > number) {
                System.out.println("Angka tebakan lebih besar dari jawaban yang benar.");
            } else {
                System.out.println("Luar biasa! tebakan Anda benar.");
                success = true;
            }
        } while(!success);
            System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
            menu = input.nextLine().charAt(0);
        } while(menu=='y' || menu=='Y');
    }
}