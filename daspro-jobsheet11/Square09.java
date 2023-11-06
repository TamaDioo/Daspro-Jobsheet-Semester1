import java.util.Scanner;
public class Square09 {
    public static void main(String[] args) {
        
         //Deklarasi Scanner
         Scanner sc = new Scanner(System.in);
         System.out.print("Masukkan nilai N = ");
         int N = sc.nextInt(); //Deklarasi variabel N
 
         //Struktur perulangan bersarang untuk mencetak bintang persegi
         for(int iOuter=1; iOuter<=N; iOuter++){
            for(int i=0; i<=N; i++){
            System.out.print("*");
            }
            System.out.println();
            }
     }
 }