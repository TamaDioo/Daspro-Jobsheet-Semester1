public class LatihanMandirib09 {
    public static void main(String[] args) {

        // Deklarasi variabel i dan jumlah untuk menyimpan hasil penjumlahan
        int jumlah, i;
        //Inisialisasi variabel jumlah dengan nilai 0
        jumlah = 0;

        // Struktur perulangan for untuk menjumlahkan deret bilangan 25 sampai dengan 1
        for (i = 25; i >= 1; i--) {
            jumlah += i;
        }
        //Menampilkan hasil pejumlahan deret bilangan 25 sampai dengan 1
        System.out.println("Jumlah deret bilangan 25 sampai dengan 1 adalah " + jumlah);
    }
}