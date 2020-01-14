

public class compositepattern {

 public static void main(String[] args) {
     
   Produs produs0 =new FakeMagazin("Gucci Sunglasses",50, 20);
   Produs produs1 = new FakeMagazin("Chanel Hodie", 100, 15);
   Produs produs2 = new FakeMagazin("Gucci shoes", 100, 20);
   Produs produs3 = new FakeMagazin("Tom Ford Sunglasses", 99, 25);
   Produs fake = new Magazin("Nike OFF-WHITE",7000, 1);
   fake.add(produs0);
   fake.add(produs1);
   fake.add(produs2);
   fake.add(produs3);
   Produs produs4 = new Magazin("Gucci Jacke Denim/Lammfell",5000, 2);
   Produs produs5 = new Magazin("Limited Edition TOM FORD Sunglasses",1500, 5);
   Magazin produse = new Magazin("Chanel Navy Blue Caviar",3000, 1);
   produse.add(produs4);
   produse.add(produs5);
   produse.add(fake);
   produse.print();
   
 }
}
