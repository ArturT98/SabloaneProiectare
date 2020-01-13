
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Magazin implements Produs{

 private String numeprodus;
 private double pret;
 private double stoc;

 public Magazin(String numeprodus,double pret,double stoc){
  this.numeprodus = numeprodus;
  this.pret = pret;
  this.stoc = stoc;
 }

 List<Produs> produse = new ArrayList<Produs>();
 public void add(Produs produs) {
    produse.add(produs);
 }

 public Produs getChild(int i) {
  return produse.get(i);
 }

 public String getNumeprodus() {
  return numeprodus;
 }

 public double getPret() {
  return pret;
 }
 
 public double getStoc() {
	  return stoc;
	 }

 
 public void print() {
  System.out.println("Produs original.");
  System.out.println("Nume produs: "+getNumeprodus());
  System.out.println("Pret($)="+getPret());
  System.out.println("Stoc(articole)="+getStoc());
  System.out.println("-------------");

  Iterator<Produs> produsIterator = produse.iterator();
    while(produsIterator.hasNext()){
     Produs produs = produsIterator.next();
     produs.print();
    }
 }

 public void remove(Produs produs) {
  produse.remove(produs);
 }

}