import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        // Paramterelerimizi tanımlıyoruz
        double kmFiyat,tmAcilis,minTutar,totalUcret,gidinlenKm;
        // Baştan kabul edilen değerleri giriyoruz.
        kmFiyat = 2.20;
        minTutar = 20;
        tmAcilis = 10;

        // Kullanıcan gidilen km değerini istiyoruz.
        Scanner inp = new Scanner(System.in);
        System.out.print("Gidilen KM'yi yazınız: ");
        gidinlenKm = inp.nextDouble();

        // Gidilen KM'ye göre işlemlerimizi yapıyoruz.
        totalUcret = (gidinlenKm * kmFiyat) + tmAcilis;
        totalUcret = (totalUcret <= 20) ? minTutar: totalUcret;
        System.out.print("Ödemeniz gereken toplam Ücret: " + totalUcret);


        
        // İf else Blokları ile yapmak istersek aşağıdaki kodu yazmamız gerekiyor.


        // if (totalUcret<=20){
        //     System.out.print("Ödemeniz gereken toplam ücret: " + minTutar);
        // }
        // else{
        //     System.out.print("Ödemeniz gereken toplam Ücret: " + totalUcret);
        // }

        





    }
}
