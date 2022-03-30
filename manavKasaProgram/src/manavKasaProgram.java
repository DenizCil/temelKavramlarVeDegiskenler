import java.util.Scanner;
public class manavKasaProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armutFiyat = 2.14 , elmaFiyat = 3.67 , domatesFiyat = 1.11 , muzFiyat = 0.95 , patlicanFiyat = 5;

        double armutKg, elmaKg,domatesKg,muzKg,patlicanKg;
        double armutTotal,elmaTotal,domatesTotal,muzTotal,patlicanTotal,total;

        System.out.print("Armut kaç kilo?");
        armutKg= input.nextDouble();
        armutTotal=armutFiyat*armutKg;

        System.out.print("Elma kaç kilo?");
        elmaKg= input.nextDouble();
        elmaTotal=elmaFiyat*elmaKg;

        System.out.print("Domates kaç kilo?");
        domatesKg= input.nextDouble();
        domatesTotal=domatesFiyat*domatesKg;

        System.out.print("Muz kaç kilo?");
        muzKg= input.nextDouble();
        muzTotal=muzFiyat*muzKg;

        System.out.print("Patlıcan kaç kilo?");
        patlicanKg= input.nextDouble();
        patlicanTotal=patlicanFiyat*patlicanKg;

        total = armutTotal + elmaTotal + domatesTotal + muzTotal + patlicanTotal;
        System.out.println("Toplam Tutar" + total);

    }
}
