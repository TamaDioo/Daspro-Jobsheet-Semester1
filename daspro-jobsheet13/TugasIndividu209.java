import java.util.Scanner;

public class TugasIndividu209 {
    static Scanner sc = new Scanner(System.in);
    static int[][] nilai = new int[5][7];
    static String[] nama = { "Sari", "Rina", "Yani", "Dwi", "Lusi" };

    public static void main(String[] args) {
        //Memanggil fungsi inputNilai
        inputNilaiMhs();  
        System.out.println("============================================================");
        //Memanggil fungsi tampilkanNilai
        tampilkanNilaiMhs();
        System.out.println("============================================================");  
        //Memanggil fungsi hariTertinggi
        hariTertinggi();
        //Memanggil fungsi nilaiMhsTertinggi
        nilaiMhsTertinggi();
    }

    //Membuat fungsi untuk menginput nilai kelima mahasiswa
    public static void inputNilaiMhs() {
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[0].length; j++) {
                System.out.print("Masukkan nilai " + nama[i] + " pada minggu ke-" + (j + 1) + " : ");
                nilai[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    //Membuat fungsi untuk menampilkan nilai kelima mahasiswa
    public static void tampilkanNilaiMhs() {
        System.out.println("Nilai kelima mahasiswa mulai dari minggu pertama sampai ke-7");
        for (int i = 0; i < nama.length; i++) {
            System.out.print(nama[i] + " : "); // Nama mahasiswa
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j]);
                if (j < nilai[0].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }

    /*Membuat fungsi untuk mencari pada hari keberapakah terdapat 
    nilai tertinggi dibanding hari lain dari keseluruhan mahasiswa*/
    public static void hariTertinggi() {
        int nilaiTertinggi = nilaiTertinggi(nilai);//Memanggil fungsi nilaiTertinggi
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[0].length; j++) {
                if (nilai[i][j] == nilaiTertinggi) {
                    System.out.println("Nilai tertinggi ada pada minggu ke-" + (j + 1));
                }
            }
        }   
    }

    /*Fungsi untuk menampilkan mahasiswa yang memiliki nilai tertinggi (juga menampilkan
    keterangan nilai dari minggu ke-) */
    public static void nilaiMhsTertinggi() {
        int nilaiTertinggi = nilaiTertinggi(nilai);//Memanggil fungsi nilaiTertinggi
    
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[0].length; j++) {
                if (nilai[i][j] == nilaiTertinggi) {
                    System.out.println("Mahasiswa dengan nilai tertinggi adalah " + nama[i] +
                            " dengan nilai " + nilaiTertinggi + " pada minggu ke-" + (j + 1));
                }
            }
        }
    }
    
    //Membuat fungsi untuk mencari nilai tertinggi
    static int nilaiTertinggi(int[][] array) {
        int nilaiTertinggi = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = array[i][j];
                }
            }
        }
        return nilaiTertinggi;
    }
}