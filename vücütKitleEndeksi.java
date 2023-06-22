import java.util.Scanner;
public class vücütKitleEndeksi {
    public static void main(String[] args) {

        Scanner endeks = new Scanner(System.in);

        double kilo, boy, kitleEndeksi;


        System.out.println("Lütfen Boyunuz (Metre Cinsinden)  Giriniz : ");
        boy = endeks.nextDouble();

        System.out.println("Lütfen Kilonuzu Giriniz");
        kilo = endeks.nextDouble();

        kitleEndeksi = kilo / ( boy * boy);
        System.out.println("Vücut kitle indeksiniz: " + kitleEndeksi);
        System.out.println(kitleEndeksi);









    }
}
