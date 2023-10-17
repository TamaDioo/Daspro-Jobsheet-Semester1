import java.util.Scanner;
public class LatihanIndividu209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = "Tamadio91";
        String password = "4362";

         System.out.println("Masukkan username :");
         String ID = sc.next();
         System.out.println("Masukkan password :");
         String PW = sc.next();

         if (ID.equals(username) && PW.equals(password)) {
                System.out.println("Login Berhasil");
            } else {
                System.out.println("Username dan Password Salah");
            }
    }
}

    



