package pierwszy_projekt_package;

import java.util.Scanner;

public class klasa_3 {

    public static void main(String[] args) {


        double przypr1 = 0;
        double przypr2 = 0;
        double przeciwpr = 0;

        //wpisywanie liczb

            Scanner scan = new Scanner(System.in);
            System.out.println("podaj pierwsza przyprostokatna");
            przypr1 = scan.nextDouble();
            System.out.println("podaj druga przyprostokatna");
            przypr2 = scan.nextDouble();
            System.out.println("podaj przeciwprostokatna");
            przeciwpr = scan.nextDouble();


        //tw. Pitagorasa
        przypr1 = przypr1*przypr1;
        przypr2 = przypr2*przypr2;
        przeciwpr = przeciwpr*przeciwpr;

        przypr1 = przypr1 + przypr2;


        //warunek rownosci
        if(przypr1 == przeciwpr)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }



    }
}