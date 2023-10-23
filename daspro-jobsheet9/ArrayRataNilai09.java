import java.util.Scanner;
public class ArrayRataNilai09 {
    public static void main(String[] args) {
    
    //Deklarasi Scanner
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan jumlah mahasiswa: ");
    int jumlah_Mhs = sc.nextInt();

    //Deklarasi array bertipe integer dengan nama nilaiMhs.
    int[] nilaiMhs = new int[jumlah_Mhs];
    //Deklarasi variable total dan rata2 bertipe double.
    double total = 0, totalMhslls = 0, totalMhstdklls = 0;
    double rata2lls, rata2tdklls;
    int mhsLulus = 0, mhsTdkLls = 0;

    //Struktur perulangan untuk meminta input untuk mengisi array nilaiMhs.
    for (int i = 0; i < nilaiMhs.length; i++) {
        System.out.print("Masukkan nilai mahassiwa ke-"+(i+1)+" : ");
        nilaiMhs [i] =sc.nextInt();
    }
    //Struktur perulangan untuk menghitung jumlah keseluruhan nilai dalam array nilaiMhs
    for (int i = 0; i < nilaiMhs.length; i++) {
        total += nilaiMhs[i];
        if (nilaiMhs [i] > 70) {
            totalMhslls += nilaiMhs [i];
            mhsLulus++;
        } else {
            totalMhstdklls += nilaiMhs [i];
        }
    }

    //Menghitung nilai rata2 nilai mahasiswa yang lulus.
    rata2lls = totalMhslls/mhsLulus;
    //Menampilkan rata-rata nilai mahasiswa yang lulus.
    System.out.println("Rata-rata nilai mahasiswa yang lulus = " + rata2lls);
    //Menghitung nilai rata2 nilai mahasiswa yang lulus.
    rata2tdklls = totalMhstdklls/(nilaiMhs.length-mhsLulus);
    //Menampilkan rata-rata nilai mahasiswa yang tidak lulus.
    System.out.println("Rata-rata nilai mahasiswa yang lulus = " + rata2tdklls);
    
    }
}