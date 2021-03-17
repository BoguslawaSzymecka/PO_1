package pierwszy_projekt_package;
import java.util.Scanner;

public class klasa_4
{
    public static void main(String[] args)
    {
        int kolumna = 0;

        //wczytywanie liczby\
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj ile rzedow program ma wyswietlic");
        kolumna = scan.nextInt();

       //wyswietlanie gwiazdek
        for(int i=1 ; i<=kolumna ; i++)
        {
            for(int j = i;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }






    }
}
