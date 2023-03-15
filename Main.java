import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
    double a,b,c,x;
    System.out.println("Podaj liczbę a:");
    Scanner liczba = new Scanner(System.in);
    a = liczba.nextInt();
    System.out.println("Podaj liczbę b:");
    b = liczba.nextInt();
    System.out.println("Podaj liczbę c:");
    c = liczba.nextInt();
    x=a;
    if (b>x) x=b;
    if (c>x) x=c;
    System.out.println("Największa liczba:"+x);
  }
}