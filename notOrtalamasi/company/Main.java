import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Değişken Oluştur
        int mat,fizik,kimya,turkce,tarih,muzik;

        //Scanner sınıfımızı tanımladık
        Scanner input=new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz:");
        mat= input.nextInt();
        System.out.print("Fizik Notunuz:");
        fizik= input.nextInt();
        System.out.print("Kimya Notunuz:");
        kimya= input.nextInt();
        System.out.print("Türkçe Notunuz:");
        turkce= input.nextInt();
        System.out.print("Tarih Notunuz:");
        tarih= input.nextInt();
        System.out.print("Müzik Notunuz:");
        muzik= input.nextInt();

        int toplam=mat+fizik+kimya+turkce+tarih+muzik;
        double sonuc=toplam/6;

        if (sonuc>60)
        {
            System.out.println("Sınıfı Geçtiniz");
        }
        else
        {
            System.out.println("Kaldınız");
        }
    }



    }

