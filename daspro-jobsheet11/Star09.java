import java.util.Scanner;
public class Star09 {
    public static void main(String[] args) {

        //Deklarasi Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt(); //Deklarasi variabel N

        //Struktur perulangan for untuk mencetak bintang
        for(int i=1; i<=N; i++){
            System.out.print("*");
            }
    }
}
