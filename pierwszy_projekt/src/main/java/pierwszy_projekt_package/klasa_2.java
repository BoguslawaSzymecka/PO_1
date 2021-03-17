package pierwszy_projekt_package;
import java.util.Scanner;

public class klasa_2
{

public static void main(String[] args)
{
    int tablica[] = new int[5];

//wpisywanie liczb do tablicy
    for(int i=0;i<5;i++)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj liczbe do tablicy");
        int liczba = scan.nextInt();
        tablica[i] = liczba;
    }


    //petla szukajaca sekwencji
    for(int i = 0;i<5;i++)
    {
        System.out.println(tablica[i]);
        if(tablica[i] == 1)
        {
            if(tablica[i+1] == 2)
            {
                if(tablica[i+2] == 3)
                {
                    System.out.println(true);
                }
            }
        }
    }




}












}
