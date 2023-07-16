import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0;
        double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo, fiyat;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo? ");
        armutKilo = input.nextDouble();
        System.out.print("Elma kaç kilo? ");
        elmaKilo = input.nextDouble();
        System.out.print("Domates kaç kilo? ");
        domatesKilo = input.nextDouble();
        System.out.print("Muz kaç kilo? ");
        muzKilo = input.nextDouble();
        System.out.print("Patlıcan kaç kilo? ");
        patlicanKilo = input.nextDouble();

        fiyat = (armut*armutKilo) + (domates*domatesKilo) + (elma*elmaKilo) + (muz*muzKilo) + (patlican*patlicanKilo);
        System.out.println("Toplam tutar: " + fiyat);
    }
}