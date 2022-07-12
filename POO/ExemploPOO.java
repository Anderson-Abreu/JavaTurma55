package POO;

public class ExemploPOO {

	public static void main(String[] args) {
		Caneta bic = new Caneta("Vermelho",0.7);
		Caneta kilometrica = new Caneta("Azul",1.0);
		Caneta c1 = new Caneta("Dourada", 0.5);
		
		System.out.println("Caneta bic");
		bic.setCarga(35);
		bic.tampar();
		bic.estado();
		
		System.out.println("\nCaneta kilometrica");
		kilometrica.setCarga(57);
		kilometrica.estado();

		System.out.println("\nCaneta C1");
		c1.estado();
		
	}

}
