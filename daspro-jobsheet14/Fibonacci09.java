public class Fibonacci09 {

    public static void main(String[] args) {
        int bulan = 12;
        System.out.println("Jumlah pasangan marmut pada akhir bulan ke-" + bulan + " adalah " + jumlahPasanganMarmut(bulan));
    }

    //Membuat fungsi rekursif untuk menghitung jumlah pasangan marmut
    public static int jumlahPasanganMarmut(int bulan) {
        if (bulan <= 2) {
                return 1; 
        } else {
                return jumlahPasanganMarmut(bulan - 1) + jumlahPasanganMarmut(bulan - 2);
        }
    }
    
}