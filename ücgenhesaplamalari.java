import java.util.Scanner;

public class ücgenhesaplamalari {
    public static void main(String[] args) {
        // Ücgen için parametreleri tanımlıyoruz.
        int uzunKenar, kisaKenar;
        double hipotenüs, cevre, alan, u;
        // Değerlerimizi kullanıcan alıyoruz.
        Scanner inp = new Scanner(System.in);

        System.out.print("Uzun Kenarı Giriniz: ");
        uzunKenar = inp.nextInt();

        System.out.print("Kısa Kenarı Giriniz: ");
        kisaKenar = inp.nextInt();
        // Hipotenüs işlemi için formülü uyguluyoruz.
        hipotenüs = Math.sqrt((kisaKenar * kisaKenar) + (uzunKenar * uzunKenar));
        System.out.println("Üçgenin Hipotenüsü: " + hipotenüs);

        // Ücgenin cevresi için kullanılan formül
        u = (kisaKenar + uzunKenar + hipotenüs) / 2;
        cevre = 2 * u;
        System.out.println("Ücgenin ceversi: " + cevre);

        // Ücgenin alanı için kullanılan formüller
        alan = Math.sqrt((u * (u - kisaKenar) * (u - uzunKenar) * (u - hipotenüs)));
        System.out.println("Ücgenin Alanı: " + alan);
    }
}
