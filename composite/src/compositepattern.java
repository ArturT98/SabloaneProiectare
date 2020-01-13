import java.util.Scanner;

public class compositepattern {

 public static void main(String[] args) {
     
   Produs produs0 =new FakeMagazin("Guccishoes",100, 10);
   Produs produs1 = new FakeMagazin("DaAW", 2000, 15);
   Produs produs2 = new FakeMagazin("adada", 122131, 10);
   Produs produs3 = new FakeMagazin("Sneakers", 50000, 10);
   Produs fake = new Magazin("LUI", 1000, 2);
   fake.add(produs0);
   fake.add(produs1);
   fake.add(produs2);
   fake.add(produs3);
   Produs produs4 = new Magazin("chanel",121,12);
   Magazin produse = new Magazin("adawd",21,121);
   produse.add(produs4);
   produse.add(fake);
   produse.print();
   
 }
}
