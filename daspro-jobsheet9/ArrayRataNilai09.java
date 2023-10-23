import java.util.Scanner;
public class ArrayRataNilai09 {
    public static void main(String[] args) {
    
    //Deklarasi Scanner
    Scanner sc = new Scanner(System.in);

    //Deklarasi array bertipe integer dengan nama nilaiMhs berkapasitas 10 elemen.
    int[] nilaiMhs = new int[10];
    //Deklarasi variable total dan rata2 bertipe double.
    double total = 0;
    double rata2;

    //Struktur perulangan untuk meminta input untuk mengisi array nilaiMhs.
    for (int i = 0; i < nilaiMhs.length; i++) {
        System.out.print("Masukkan nilai mahassiwa ke-"+(i+1)+" : ");
        nilaiMhs [i] =sc.nextInt();
    }
    //Struktur perulangan untuk menghitung jumlah keseluruhan nilai dalam array nilaiMhs
    for (int i = 0; i < nilaiMhs.length; i++) {
        total += nilaiMhs[i];
    }

    //Menghitung nilai rata2 dengan cara nilai total dibagi jumlah elemen dari array nilaiMhs.
    rata2 = total/nilaiMhs.length;
    //Menampilkan rata-rata nilai.
    System.out.println("Rata-rata nilai ="+rata2);
    
    }
}