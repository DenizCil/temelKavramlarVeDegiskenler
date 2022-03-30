import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen boyunuzu giriniz ( m ):");
        double b= input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz ( kg ):");
        double k= input.nextDouble();

        b = b/100;
        double endeks = k/b*b;
        System.out.println("Vücut Kitle indeksiniz:" +endeks);









    }

}
