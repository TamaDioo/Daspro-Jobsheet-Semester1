import java.util.Scanner;
public class DoWhileCuti09 {
    public static void main(String[] args) {
        //Deklarasi scanner
        Scanner sc = new Scanner(System.in);

        //Deklarasi variabel
        int jatahCuti, jumlahHari;
        String konfirmasi;

        //Kode untuk meminta input jatah cuti dari keyboard
        System.out.print("Jatah cuti: ");
        jatahCuti = sc.nextInt();

        //Struktur perulangan do while dengan kondisi pemilihan if untuk menghitung sisa jatah cuti.
        do {
            System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                }
            }
          //Menambahkan pengecekan kondisi konfirmasi tidak sama dengan “t”
        } while (jatahCuti > 0 && !konfirmasi.equalsIgnoreCase("t"));
    }
}
