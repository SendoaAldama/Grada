import java.util.*;

public class Asiento {
	
	
	//Atributos
	private Espectador espectador;
	private boolean ocupado;
	
	//Constructor
	 
		//Asiento vacio 
	public Asiento()
	{
		
		this.espectador = new Espectador();
		this.ocupado = false;
		
	}
		
	//Metodos
	
		//Espectador añadido manual
	public void AñadirUsuarioM(Scanner sc)
	{
				
		this.ocupado = true;	//Asiento ocupado
		System.out.println("");
		System.out.println("--------------------------------------------------------");
		System.out.println("|                                                      |");
		System.out.println("|     Hola, rellena este formulario de espectador      |");
		System.out.println("|                                                      |");
		System.out.println("--------------------------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("-----------------------------------------------");
		System.out.println("|                                             |");
		System.out.println("|              Como se llama?                 |");
		System.out.println("|                                             |");
		System.out.println("-----------------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		sc.nextLine();
		this.espectador.setNombre(sc.nextLine());	//Introducir nombre
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("-----------------------------------------------");
		System.out.println("|                                             |");
		System.out.println("|          En que fecha naciste?              |");
		System.out.println("|       Introduce la fecha completa           |");
		System.out.println("|                                             |");
		System.out.println("-----------------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		this.espectador.setFecha(sc.nextLine());	//Introducir fecha
		espectador.Entrada(sc);					//Tipo de entrada o abonado
		espectador.InformacionIntroducido();	//Syso que enseña lo escrito
		
		
	}
	
	
		//Usuario aleatorio metido de base
	public void UsuarioAleatorio()
	{
		
		this.ocupado = true;	//Sitio ocupado
		this.espectador.EspectadorAleatorio();	//Informacion por defecto
		
	}

	
	//Get y set
	
	public boolean getOcupado()	//Get para saber si esta ocupado el asiento
	{
		return this.ocupado;
	}
}