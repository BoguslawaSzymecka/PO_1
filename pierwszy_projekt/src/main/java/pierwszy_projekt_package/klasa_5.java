package pierwszy_projekt_package;
import java.util.Scanner;
import java.util.ArrayList;

public class klasa_5
{
    public static void main(String[] args)
    {
        String slowo;
        int dlugosc = 0;


        Scanner scan = new Scanner(System.in);
        System.out.println("podaj stringa");
        slowo = scan.nextLine();
        System.out.println(slowo);


        dlugosc = slowo.length();
        System.out.println(dlugosc);
        dlugosc = dlugosc/2;
        System.out.println(dlugosc);

        for(int i = 0; i < dlugosc; i++)
        {
            System.out.print(slowo.charAt(i));
        }






    }
}
