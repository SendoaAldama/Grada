
public class Entrada {

	//Atributos
	private boolean abonado;
	private boolean entrada;
	
	//Constructor
	
	//Vacio	/Si el usuario es aleatorio
	public Entrada()
	{
		
		this.abonado = false;
		this.entrada = true;
		
	}
	
	//Completo
	public Entrada(boolean Entrada,boolean Abonado)
	{
	
		this.abonado = Abonado;
		this.entrada = Entrada;
		
	}
	
	//Metodos
		
	
	public void InformacionE()	//Imprimir si es abonado o tiene entrada
	{
		
		System.out.print("Tu estas o tienes ");
		
		if(this.abonado == true)
		{
			System.out.println("abonado");
		}
		
		if(this.entrada == true)
		{
			System.out.println("entrada");
		}
		
	}
	
	//Set y Get
	
	public void setEntradaA()	//Abonado
	{
		boolean Abonado = true;
		boolean Entrada = false;
		
		this.abonado = Abonado;
		this.entrada = Entrada;
		
		Entrada e = new Entrada(this.entrada,this.abonado);
		
	}
	
	public void setEntradaC()	//Comprado
	{
		boolean Abonado = false;
		boolean Entrada = true;
		
		this.abonado = Abonado;
		this.entrada = Entrada;
		
		Entrada e = new Entrada(this.entrada,this.abonado);
		
	}
}