import java.text.DecimalFormat;
import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        // Değişkenlerimizi tanımlıyoruz
        double armut, armutKg, elma, elmaKg, domates, domatesKd, muz, muzKg, patlican, patlicanKg, total;
        armut = 2.14;
        elma = 3.67;
        domates = 1.11;
        muz = 0.95;
        patlican = 5.00;

        DecimalFormat df = new DecimalFormat("#.##");
        
        // Kullanıcıdan değerleri alıyoruz
        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç kilo armut alacaksınız: ");
        armutKg = inp.nextDouble();

        System.out.print("Kaç kilo elma alacaksınız: ");
        elmaKg = inp.nextDouble();

        System.out.print("Kaç kilo domates alacaksınız: ");
        domatesKd = inp.nextDouble();

        System.out.print("Kaç kilo muz alacaksınız: ");
        muzKg = inp.nextDouble();

        System.out.print("Kaç kilo patlican alacaksınız: ");
        patlicanKg = inp.nextDouble();

        // Toplam tutarı bulan formül
        total = (armut * armutKg) + (elma * elmaKg) + (domates * domatesKd) + (muz * muzKg) + (patlican * patlicanKg);
        System.out.println("Toplam ödemeniz gereken tutar: " + df.format(total));
    }
}
