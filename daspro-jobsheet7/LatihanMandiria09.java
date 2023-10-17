import java.util.Scanner;
public class LatihanMandiria09 {
    public static void main(String[] args) {

        //Deklarasi Scanner
        Scanner input = new Scanner(System.in);

        //Deklarasi variabel
        String nama, jenisKelamin;
        int i;

        //Struktur perulangan for untuk menginputkan nama dan jenis kelamin mahasiswa mahasiswa samapai 30x
        for (i = 1; i <= 30; i++) {
            System.out.print("Masukkan nama mahasiswa ke " + i + ": ");
            nama = input.nextLine();
            System.out.print("Masukkan jenis kelamin mahasiswa " + i + " (Laki-laki/Perempuan): ");
            jenisKelamin = input.nextLine();

            //Pengecekan apakah jenis kelamin mahasiswa perempuan atau tidak
            if (jenisKelamin.equalsIgnoreCase("perempuan")) {
                //Jika iya, maka nama mahasiswa akan dicetak menggunakan blok kode di bawah ini
                System.out.println(nama);
            }
        }
    }
}