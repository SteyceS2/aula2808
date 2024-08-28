package interfaceAbstrata;


public class Lobo implements animalx{
	
	@Override
	public void dormir() {
		System.out.println("Dormindo");
	}
   @Override
   public void caminhar() {
	   System.out.println("caminhando");
   }
   @Override
   public void correr() {
	   System.out.println("correndo");
}
   @Override
   public void emitir() {
	   System.out.println("emitindo");
   }
   
}
