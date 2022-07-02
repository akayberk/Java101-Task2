import java.util.Scanner;
public class task2 {

    public static void main(String[] args) {
        float tutar, kdvOrani =0.18f, kdvTutar, kdvliTutar;
        Scanner input = new Scanner(System.in); //burada scanner fonskiyonunu cagirmamiz gerekiyor ki islev gorsun
        System.out.println("Urun fiyat bilgisini yaziniz lutfen: ");
        tutar = input.nextFloat();
        kdvTutar = tutar * kdvOrani;
        kdvliTutar = tutar + kdvTutar;
        System.out.println("Urun\'un KDV haric tutari: " + tutar);
        System.out.println("Urun\'un KDV orani: " + kdvOrani);
        System.out.println("Urun\'un KDV tutari: " + kdvTutar);
        System.out.println("Urun\'un KDV dahil fiyati: " + kdvliTutar);
    }
}
