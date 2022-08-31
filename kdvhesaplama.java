import java.util.Scanner;

public class kdvhesaplama {
    public static void main(String[] args) {
        // Değişkenlerimizi tanımlıyoruz.
        double tutar, kdv, kdvliTutar, kdvtutar;
        // Karşıdan bir değer alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz: ");
        tutar = input.nextDouble();
        // Tutarın değer aralığına göre koşuluğumuzu yazıyoruz.
        if (tutar <= 1000) {
            kdvtutar = 0.18;
            kdv = tutar * kdvtutar;
            kdvliTutar = tutar + kdv;
            System.out.println("Ürünün KDV'si: " + kdv);
            System.out.println("Ürünün Toplam Fiyatı: " + kdvliTutar);
        } else {
            kdvtutar = 0.08;
            kdv = tutar * kdvtutar;
            kdvliTutar = tutar + kdv;
            System.out.println("Ürünün KDV'si: " + kdv);
            System.out.println("Ürünün Toplam Fiyatı: " + kdvliTutar);
        }
    }
}