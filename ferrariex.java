package interfaceAbstrata;

public class ferrariex implements ferrari {
	
	
	@Override
	public void ligar() {
		System.out.println("ligando");
	}
   @Override
   public void engatar() {
	   System.out.println("engatando");
   }
   @Override
   public void acelerar() {
	   System.out.println("acelerando");
}
   @Override
   public void manobrar() {
	   System.out.println("manobrando");
   }
	   
  @Override
	public void frear() {
	  System.out.println("freando");
  }
	  @Override
	   public void desligar() {
		   System.out.println("desligando");
	  }
}
