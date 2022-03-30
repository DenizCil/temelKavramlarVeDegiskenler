
        import java.util.Scanner;

        public class dikUcgendeHipotenusHesaplama {
            public static void main(String[] args) {
                int a,b;
                double c;
                Scanner girdi=new Scanner(System.in);
                System.out.print("1.ci Kenarı Giriniz:");
                a= girdi.nextInt();
                System.out.print("2.ci Kenarı Giriniz:");
                b= girdi.nextInt();
                c=Math.sqrt((a*a)+(b*b));
                System.out.println("Hipotenüs:"+c);
            }

}
