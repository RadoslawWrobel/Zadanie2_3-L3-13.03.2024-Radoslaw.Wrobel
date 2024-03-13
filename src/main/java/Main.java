import java.util.Scanner;
import java.lang.Math;
import java.util.InputMismatchException;

public class Main 
  {
  public static void main(String[] args) 
  {
      {
        int ZadeklarowanaLiczba = 1337;
        System.out.println(ZadeklarowanaLiczba);

        System.out.println("Wprowadz jeszcze dwie liczby: ");
        Scanner SkanerWprowadzaniaLiczb = new Scanner(System.in);
        int a = SkanerWprowadzaniaLiczb.nextInt();
        int b = SkanerWprowadzaniaLiczb.nextInt();
        
        if (ZadeklarowanaLiczba > a && ZadeklarowanaLiczba > b)
        {
          System.out.println("Najwieksza liczba to: "+ZadeklarowanaLiczba);
        }
        else if (a > ZadeklarowanaLiczba && a > b)
        {
          System.out.println("Najwieksza liczba to: "+a);
        }
        else
        {
          System.out.println("Najwieksza liczba to: "+b);
        }
     }
  }
}