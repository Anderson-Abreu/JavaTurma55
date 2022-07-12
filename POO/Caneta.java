package POO;

public class Caneta {

	//CARACTERISTICAS -> ATRIBUTOS
	
	private String cor;
	private double ponta;
	private int carga;
	private boolean tampada;
	
	//METODO CONSTRUTOR
	public Caneta(String c, double p)
	{
		this.cor=c;
		this.ponta=p;
	}
	
	//COMPORTAMENTOS -> METODOS
	
	public void escrever()
	{
		if(this.tampada==true)
			System.out.println("Erro! Caneta tampada...");
		else
			System.out.println("Escrevendo...");
	}
	
	public void tampar()
	{
		if(this.tampada==true)
			System.out.println("ERRO! Caneta ja esta tampada...");
		else
			this.tampada=true;
	}
	
	public void destampar()
	{
		this.tampada=false;
	}
	
	public void estado()
	{
		System.out.println("Cor: "+this.cor);
		System.out.println("Ponta: "+this.ponta);
		System.out.println("Esta tampada? "+this.tampada);
		System.out.println("A carga esta em "+this.carga+"%");
	}

	//METODOS ACESSORES->GETS E MODIFICADORES->SETS
	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public String getCor() {
		return cor;
	}

	public double getPonta() {
		return ponta;
	}

	public boolean getTampada() {
		return tampada;
	}
	
	
	
}
