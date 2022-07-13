package Heranca;

public class Mamifero extends Animal{
	private String corDoPelo;
	private String comprimentoDoPelo;
	
	public void mamar()
	{
		System.out.println("Mamando...");
	}

	public String getCorDoPelo() {
		return corDoPelo;
	}

	public void setCorDoPelo(String corDoPelo) {
		this.corDoPelo = corDoPelo;
	}

	public String getComprimentoDoPelo() {
		return comprimentoDoPelo;
	}

	public void setComprimentoDoPelo(String comprimentoDoPelo) {
		this.comprimentoDoPelo = comprimentoDoPelo;
	}
	
}
