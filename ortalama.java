import java.util.Scanner;;

public class ortalama{
    public static void main(String[] args) {
        // Değişkenleri oluşturmak
        double mat, fizik, turkce, tarih, muzik;
 
        // Scanner sınıfını tanımladık
        Scanner inp = new Scanner(System.in);

        // Kullanıcadan  derslerin notlarını al

        System.out.print("Matematik Notunuz: ");
        mat = inp.nextDouble();

        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextDouble();

        System.out.print("Turkce Notunuz: ");
        turkce = inp.nextDouble();

        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextDouble();

        System.out.print("Muzik Notunuz: ");
        muzik = inp.nextDouble();

        double toplam = (mat+fizik+turkce+tarih+muzik);
        double sonuc = (toplam/5.0);
        System.out.println("Ortalamanız: "+sonuc);
        System.out.println(sonuc > 60 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız");

    }

}
