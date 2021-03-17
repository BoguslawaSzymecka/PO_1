package pierwszy_projekt_package;
import java.util.Scanner;

public class klasa_1
{
    public static void main(String[] args)
    {
        //pobieranie danych z klawiatury
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj pierwsza temperature");
        int temp1 = scan.nextInt();
        System.out.println("podaj druga temperature");
        int temp2 = scan.nextInt();


        //instrukcja warunkowa
        if(temp1<100 | temp2<100)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }


}


