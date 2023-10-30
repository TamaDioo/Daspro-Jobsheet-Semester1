import java.util.Scanner;

public class DemoGaji09 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String[] username = { "viraalfita", "dioandika", "taufikdimas" };
        String[] password = { "virapass", "diopass", "taufikpass" };

        String inputUsername, inputPassword;
        int hasil = 0; // untuk pengecekan username terdapat dalam array
        int gajiPokok, gajiLembur, jmlGajiPokok, jmlGajiLembur, totalGaji = 0;

        System.out.print("Masukkan username : ");
        inputUsername = scan.nextLine();
        System.out.print("Masukkan password : ");
        inputPassword = scan.nextLine();

        for (int i = 0; i < username.length; i++) {
            if (username[i].equalsIgnoreCase(inputUsername)) {
                hasil = i;
                break;
            }
        }

        if (hasil == 0) {
            System.out.println("Username tidak ditemukan");
        } else {
            System.out.println("Berhasil login");
            System.out.println();
            int jumlahKaryawan;
            System.out.println("---------------- Input Karyawan ---------------");
            System.out.println("");
            System.out.print("Masukkan jumlah karyawan yang akan di input : ");
            jumlahKaryawan = scan.nextInt();
            scan.nextLine();

            String[] namaKaryawan = new String[jumlahKaryawan];
            String[] alamatKaryawan = new String[jumlahKaryawan];
            String[] divisiKaryawan = new String[jumlahKaryawan];

            for (int j = 0; j < jumlahKaryawan; j++) {
                System.out.println("");
                System.out.println("Karyawan ke - " + (j + 1));
                System.out.print("Nama    : ");
                namaKaryawan[j] = scan.nextLine();
                System.out.print("Alamat  : ");
                alamatKaryawan[j] = scan.nextLine();
                System.out.println("------- Divisi -------");
                System.out.println("1. Front Office");
                System.out.println("2. House Keeping");
                System.out.println("3. Food and Beverage Service");
                System.out.println("4. Administrasi");
                System.out.print("Masukkan kategori divisi anda : ");
                divisiKaryawan[j] = scan.nextLine();
                System.out.println("----------------------");

                System.out.println("--- Perhitungan Gaji Pokok ---");
                System.out.print("Masukkan hari kerja: ");
                int hariKerja = scan.nextInt();
                System.out.print("Masukkan jam lembur: ");
                int jamLembur = scan.nextInt();
                System.out.println();
                scan.nextLine();

                switch (divisiKaryawan[j]) {
                    case "1":
                        gajiPokok = 80000;
                        gajiLembur = 12000;
                        jmlGajiPokok = gajiPokok * hariKerja;
                        jmlGajiLembur = gajiLembur * jamLembur;

                        totalGaji = jmlGajiPokok + jmlGajiLembur;

                        break;
                    case "2":
                        gajiPokok = 70000;
                        gajiLembur = 13000;
                        jmlGajiPokok = gajiPokok * hariKerja;
                        jmlGajiLembur = gajiLembur * jamLembur;

                        totalGaji = jmlGajiPokok + jmlGajiLembur;

                        break;
                    case "3":
                        gajiPokok = 60000;
                        gajiLembur = 10000;
                        jmlGajiPokok = gajiPokok * hariKerja;
                        jmlGajiLembur = gajiLembur * jamLembur;

                        totalGaji = jmlGajiPokok + jmlGajiLembur;
                        break;
                    case "4":
                        gajiPokok = 80000;
                        gajiLembur = 12000;
                        jmlGajiPokok = gajiPokok * hariKerja;
                        jmlGajiLembur = gajiLembur * jamLembur;

                        totalGaji = jmlGajiPokok + jmlGajiLembur;
                        break;
                    default:
                        break;
                }
            }

            System.out.println("");
            System.out.println("Daftar Karyawan");

            for (int j = 0; j < jumlahKaryawan; j++) {
                System.out.println();
                System.out.println("Karyawan ke-" + (j + 1));
                System.out.println();
                System.out.println("Nama Karyawan : " + namaKaryawan[j]);
                System.out.println("Alamat Karyawan : " + alamatKaryawan[j]);
                System.out.println("Divisi Karyawan : " + divisiKaryawan[j]);
            }

            System.out.println("\n---------------- Search Karyawan ---------------");
            System.out.print("\nMasukkan nama karyawan yang ingin dicari: ");
            String cariNama = scan.nextLine();

            boolean ditemukan = false;
            for (int j = 0; j < jumlahKaryawan; j++) {
                if (namaKaryawan[j].equalsIgnoreCase(cariNama)) {
                    ditemukan = true;
                    System.out.println("\nKaryawan dengan nama " + cariNama + " ditemukan:");
                    System.out.println("Alamat Karyawan : " + alamatKaryawan[j]);
                    System.out.println("Divisi Karyawan : " + divisiKaryawan[j]);
                    break;
                }
                System.out.println("Total gaji: " + totalGaji);
            }

            if (!ditemukan) {
                System.out.println("\nKaryawan dengan nama " + cariNama + " tidak ditemukan.");
            }

        }

        scan.close();
    }
}