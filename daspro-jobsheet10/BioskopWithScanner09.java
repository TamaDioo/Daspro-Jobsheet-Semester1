import java.util.Scanner;

public class BioskopWithScanner09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];
        int menu;
        boolean kursiSedia = true;

        while (kursiSedia) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();

                if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                    if (penonton[baris-1][kolom-1] == null) {
                        penonton[baris-1][kolom-1] = nama;
                    System.out.println("Data penonton telah disimpan.");
                    kursiSedia = false;
                } else {
                    System.out.println("Maaf, kursi sudah terisi.");
                }
            } else  {
                System.out.println("Maaf, nomor baris atau kolom kursi tidak tersedia");
            }
        }    else if (menu == 2) {
                System.out.println("Daftar penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] != null) {
                            System.out.printf("%s \t %d \t %d\n", penonton[i][j], i+1, j+1);
                        } else {
                            System.out.printf("Baris %d, kolom %d: ***\n", penonton[i][j], i+1, j+1);
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
