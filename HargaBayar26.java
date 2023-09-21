import java.util.Scanner;

public class HargaBayar26 {
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);

        int harga, jumlah;
        double dis=0.5, total, bayar, jmlDis;
        String merkbuku, jmlHalbuku;

        System.out.println("Merk Buku ");
        merkbuku= input.nextLine();
        System.out.println("Masukkan jumlah halaman buku ");
        jmlHalbuku=input.nextLine();

        System.out.println("Masukkan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukkan Jumlah jumlah barang yang dibeli ");
        jumlah=input.nextInt();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);
    }
}
