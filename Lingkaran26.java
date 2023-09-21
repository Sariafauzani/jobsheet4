import java.util.Scanner;
public class Lingkaran26 {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
    
        int r;
        double phi = 3.14;
        double keliling, luas;
        System.out.println("Masukkan jari-jari lingkaran");
        r=input.nextInt();
        System.out.println("Masukkan phi: ");
        phi=input.nextDouble();

        keliling= 2*phi*r;
        luas= phi*r*r;

        System.out.println("Hasil keliling : " + keliling);
        System.out.println("Hasil luas : " + luas);
    }
}