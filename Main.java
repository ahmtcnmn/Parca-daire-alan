import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        double r,aci,pi=3.14,alan;

        System.out.print("Dairenizin yarıçapını giriniz : "); //Çap girişi.
        r = input.nextDouble();
        System.out.print("Dairenizin açısını giriniz : "); //Açı girişi
        aci = input.nextDouble();

        alan= ((pi*(r*r)*aci)/360); // Alan hesabı.
        System.out.print("Dairenizin alanı : "+ alan);

    }
}