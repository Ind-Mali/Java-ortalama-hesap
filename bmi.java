import java.text.DecimalFormat;
import java.util.Scanner;


public class bmi {

    public static void main(String[] args) {
        // Vücut kitle endeksini hesaplayan program
        // Değişkenlerimizi belirliyoruz.
        double boy, kilo, bmi;
        String zayif, ideal, sisman, obez, asiriObez;
        double a, b, c, d, e;

        // Genel olarak belirlenmiş sağlık değerleriniz tanımlıyoruz.
        a = 18.5;b = 24.9;c = 29.9;d = 30;e = 35;
        zayif = "Zayif";ideal = "İdeal";sisman = "Şişman";obez = "Obez";asiriObez = "Aşırı Obez";

        // Çıktıyı bellir bir formatta döndürmek için kullandığımız method
        DecimalFormat df = new DecimalFormat("#.##");

        // Kullanıcıdan değerleri istiyoruz.
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz (örngein 1,72): ");
        boy = inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = inp.nextDouble();

        // Vücut kitle endeksi hesaplamasını yaptırıyoruz
        bmi = ((kilo) / (boy * boy));
        System.out.println("Vücut kitle endeksiniz: " + df.format(bmi));

        // Koşullar ile kullanıcının değerlerinin sonucunu döndürüyoruz.
        if (bmi <= a) {
            System.out.println("Vücut kitle endeksiyen göre değerlendirmeniz: " + zayif);
        } else if ((a < bmi) && (bmi < b)) {
            System.out.println("Vücut kitle endeksiyen göre değerlendirmeniz: " + ideal);
        } else if ((b <= bmi) && (bmi < c)) {
            System.out.println("Vücut kitle endeksiyen göre değerlendirmeniz: " + sisman);
        } else if ((c <= bmi) && (bmi < d)) {
            System.out.println("Vücut kitle endeksiyen göre değerlendirmeniz: " + sisman);
        } else if ((d <= bmi) && (bmi < e)) {
            System.out.println("Vücut kitle endeksiyen göre değerlendirmeniz: " + obez);
        } else if (bmi > e) {
            System.out.println("Vücut kitle endeksiyen göre değerlendirmeniz: " + asiriObez);
        }
    }
}
