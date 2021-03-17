package pierwszy_projekt_package;
import java.util.Scanner;

public class projekt_6
{
    public static void main(String[] args)
    {
        int tablica[] = new int[5];
        int i = 0;
        for(i=0;i<5;i++)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("podaj liczbe");
            tablica[i] = scan.nextInt();
        }

        for(i=4;i>=0;i--)
        {
            System.out.println(tablica[i]);
        }
    }
}
