import java.util.Scanner;
    public class IfKondisi09 {
        public static void main(String[] args) {
            Scanner sc09 = new Scanner(System.in);

            System.out.print("Masukkan suhu :");
            int suhu = sc09.nextInt();

            if (suhu<16) {
                System.out.println("Silahkan menggunakan jaket");
            }
            if (suhu<20) {
                System.out.println("Silahkan pakai baju tebal");              
            }
            else{
                System.out.println("Silahkan pakai topi");
            }
        }
}