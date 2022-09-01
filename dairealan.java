import java.text.DecimalFormat;
import java.util.Scanner;

public class dairealan {
    public static void main(String[] args) {
        // Dairenin alanını cevresini ve bir diliminin alanını bulan program
        // Değişkenlerimizi tanımlıyoruz.
        double pi, r, alfa, alan, cevre, daireAlan;
        pi = 3.14;

        // Kullanıcıdan dairenin yarıçapını alıyoruz.
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen Dairenin Yarı Çapını(r) Giriniz: ");
        r = inp.nextDouble();

        // Değerlerin virgülden sonraki 2 basamağını almak için bir pattern yazdık.
        DecimalFormat df = new DecimalFormat("#.##");

        // Dairenin alan formülü
        alan = (pi * r * r);
        System.out.println("Dairenin Alanı: " + df.format(alan));
        // System.out.format("Dairenin Alanı: " + "%.2f",alan);

        // Dairenin çevresinin hesaplanma formülü
        cevre = (2 * pi * r);
        System.out.println("Dairenin Çevresi: " + cevre);

        // Daire Diliminin Alanını Bulan Formül
        System.out.print("Daire Diliminin Merkez Açısını Giriniz: ");
        alfa = inp.nextDouble();
        daireAlan = (alan * alfa) / 360;
        System.out.println("Verilen daire diliminin alanı: " + df.format(daireAlan));
    }
}
