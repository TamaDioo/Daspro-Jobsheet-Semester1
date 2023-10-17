public class LatihanMandiric09 {
    public static void main(String[] args) {
        
        //Deklarasi variabel
        int i;

        //Struktur perulangan for untuk mengecek bilangan mulai 1 sampai 50
        for (i = 1; i <= 50; i++)  {
            //Kondisi if untuk mengecek apakah bilangan kelipatan 3 atau bukan
            if (i % 3 == 0) {
                //Jika iya, maka bilangan kelipatan 3 akan diskip
                continue;
            }

            //Menampilkan output bilangan dari 1 sampai 50 kecuali kelipatan 3
            System.out.print(i + " ");
        }
    }
}