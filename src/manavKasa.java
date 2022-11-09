import java.util.Scanner;

public class manavKasa {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Kac kilo armut aldiniz?");
        double armut = sc.nextDouble();
        System.out.println("Aldiginiz armut tutari: " + armut*2.14 + " TL");
        System.out.println(" ");
        System.out.println("Kac kilo elma aldiniz?");
        double elma = sc.nextDouble();
        System.out.println("Aldiginiz elma tutari: " + elma*3.67 + " TL");
        System.out.println(" ");
        System.out.println("Kac kilo domates aldiniz?");
        double domates = sc.nextDouble();
        System.out.println("Aldiginiz domates tutari: " + domates*1.11 + " TL");
        System.out.println(" ");
        System.out.println("Kac kilo muz aldiniz??");
        double muz = sc.nextDouble();
        System.out.println("Aldiginiz muz tutari: " + muz*0.95 + " TL");
        System.out.println(" ");
        System.out.println("Kac kilo patlican aldiniz?");
        double patlican = sc.nextDouble();
        System.out.println("Aldiginiz patlican tutari: " + patlican*5.00 + " TL");
        System.out.println(" ");

        double sonuc = (2.14*armut) + (3.67*elma) + (1.11*domates) + (0.95*muz) + (5.00*patlican);

        System.out.println("Toplam Tutar: " + sonuc + " TL");

    }
}
