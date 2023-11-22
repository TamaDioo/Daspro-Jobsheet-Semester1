import java.util.Scanner;

public class TugasIndividu209 {
    static Scanner sc = new Scanner(System.in);
    static int[][] nilai;
    static String[] nama;

    public static void main(String[] args) {

        //Meminta inputan jumlah mahasiswa dan jumlah tugas
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah minggu/tugas: ");
        int jumlahMinggu = sc.nextInt();

        // Inisialisasi array sesuai inputan pengguna
        nilai = new int[jumlahMahasiswa][jumlahMinggu];
        nama = new String[jumlahMahasiswa];

        //Memanggil fungsi inputNamaMahasiswa
        inputNamaMahasiswa();
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

    //Membuat fungsi untuk menginput nama mahasiswa
    public static void inputNamaMahasiswa() {
        for (int i = 0; i < nama.length; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            nama[i] = sc.next();
        }
    }

    //Membuat fungsi untuk menginput nilai mahasiswa
    public static void inputNilaiMhs() {
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Masukkan nilai untuk " + nama[i]);
            for (int j = 0; j < nilai[0].length; j++) {
                System.out.print("pada minggu ke-" + (j + 1) + " : ");
                nilai[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    //Membuat fungsi untuk menampilkan nilai kelima mahasiswa
    public static void tampilkanNilaiMhs() {
        System.out.println("Nilai mahasiswa");
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