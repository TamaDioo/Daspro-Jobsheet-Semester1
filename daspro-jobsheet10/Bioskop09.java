public class Bioskop09 {
    public static void main(String[] args) {
        //Membuat array bertipe string berkapasitas baris 4 elemen
        //dan kolom 2 elemen.
        String[][] penonton = new String[4][2];
        //Mengisi masing-masing elemen array penonnton.
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";
       
        //Menampilkan semua isi elemen ke layar.
        System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);

        System.out.println(penonton.length);
        
        for (String[] barisPenonton : penonton) {
            System.out.println("Panjang baris: " + barisPenonton.length);
        }

        System.out.println("Penonton pada baris ke-3: ");

        for (String i : penonton[2]) {
            System.out.println(i);
        }
    }
}
