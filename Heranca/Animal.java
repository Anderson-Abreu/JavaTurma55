package Heranca;

public class Animal {
	
	private int patas;
	private String revestimento;
	
	public void movimento() 
	{
		System.out.println("Movimentando...");
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public String getRevestimento() {
		return revestimento;
	}

	public void setRevestimento(String revestimento) {
		this.revestimento = revestimento;
	}
	
}
