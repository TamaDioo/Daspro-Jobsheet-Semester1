import java.util.Scanner;

public class BioskopWithScanner09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];
        int menu;

        //Perulangan while untuk menampilkan menu
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            //Struktur pemilihan if else if untuk memilih menu
            if (menu == 1) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();

                if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                    penonton[baris-1][kolom-1] = nama;
                    System.out.println("Data penonton telah disimpan.");
                } else {
                    System.out.println("Nomor baris atau kolom tidak valid.");
                }
            } else if (menu == 2) {
                System.out.println("Daftar penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] != null) {
                            System.out.printf("%s \t %d \t %d\n", penonton[i][j], i+1, j+1);
                        }
                    }
                }
            } else if (menu == 3) {
                break;
            } else {
                System.out.println("Menu tidak valid!");
            }
        }
    }
}