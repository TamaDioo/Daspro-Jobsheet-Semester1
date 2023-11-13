public class Sorting09 {
    public static void main(String[] args) {
        String[][] atlet = {
            {"Aldo", "Dio", "Thomas", "Bambang", "Rudi"}, // Badminton
            {"Riyan", "Paul", "Rahmad", "Haikal", "Juno"}, // Tenis Meja
            {"Tito", "Reyhan", "Dimas", "Taufik", "Abdil"}, // Basket
            {"Lutfi", "Dina", "Eren", "Alif", "Gilang"}, // Bola Voly
        };

        String[] cabor = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"}; // Jenis Cabang Olahraga

        //Pengurutan ascending menggunakan bubble sort
        for (int i = 0; i < atlet.length; i++) {
            for (int j = 0; j < atlet[i].length - 1; j++) {
                for (int k = 0; k < atlet[i].length - j - 1; k++) {
                    if (atlet[i][k].compareToIgnoreCase(atlet[i][k + 1]) > 0) {
                        String temp = atlet[i][k];
                        atlet[i][k] = atlet[i][k + 1];
                        atlet[i][k + 1] = temp;
                    }
                }
            }
        }

        //Menampilkan hasil pengurutan ascending
        for (int i = 0; i < atlet.length; i++) {
            System.out.println("Cabang Olahraga " + cabor[i]);
            for (int j = 0; j < atlet[i].length; j++) {
                System.out.println("Nama atlet ke-" + (j + 1) + " : " + atlet[i][j]);
            }
            System.out.println();
        }
    }
}