public class BubbleSortExample09 {
    public static void main(String[] args) {
        
        // //Deklarasi array bertipe integer dengan nama intData dan diisi dengan 7 elemen.
        int[] intData = {34, 18, 87, 72, 32, 54, 43};
        int temp = 0;

        //Struktur perulangan bersarang.
        for (int i=0; i < intData.length; i++) {
            //Struktur perulangan kedua untuk perbandingan dan penukaran elemen dalam array.
            for (int j=1; j < intData.length-i; j++) {
                if (intData[j-1] > intData[j]) {
                        //swap elemen
                        temp = intData[j];
                        intData[j] = intData[j-1];
                        intData[j-1] = temp;
                }
            }
        }

        //Mencetak hasil sorting.  
        System.out.println("Hasil pengurutan:");
        //Struktur perulangan untuk mencetak setiap elemen array dari yang terkecl ke terbesar.
        for (int i=0; i < intData.length; i++) {
            System.out.println(intData[i]);
        }
    }
}