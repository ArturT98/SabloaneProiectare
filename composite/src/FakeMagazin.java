public class FakeMagazin implements Produs{

  private String numeprodus;
  private double pret;
  private double stoc;

  public FakeMagazin(String numeprodus,double pret,double stoc){
    this.numeprodus = numeprodus;
    this.pret = pret;
    this.stoc = stoc;
  }
  public void add(Produs produs) {
   
  }

  public Produs getChild(int i) {
    
    return null;
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
    System.out.println("Produs contrafacut.");
    System.out.println("Nume produs: "+getNumeprodus());
    System.out.println("Pret($)="+getPret());
    System.out.println("Stoc(piese)="+getStoc());
    System.out.println("-------------");
  }

  public void remove(Produs produs) {
   
  }

}