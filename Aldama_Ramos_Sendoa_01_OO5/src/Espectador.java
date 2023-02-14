import java.util.*;

public class Espectador {
	
	//Atributos 
	private String nombre;
	private String FechaNacimiento;
	private Entrada entrada;
	
	//Constructor
		//Vacio
	
	public Espectador()
	{
		this.nombre = " ";
		this.FechaNacimiento = " ";
		this.entrada = new Entrada();
	}
		
	
	//Metodos
		//Metodo Espectador Aleatorio
	public void EspectadorAleatorio() 
	{
		this.nombre = "Pepe";
		this.FechaNacimiento = "20/12/2002";
		this.entrada.setEntradaC();
	}
	
	
		//Si es Entrada o Abonado
	public void Entrada(Scanner sc) 
	{
		
		//Variables
		
		char respuesta;
		
		//Codigo
		System.out.println("-----------------------------------------------");
		System.out.println("|                                             |");
		System.out.println("|       Tienes abonado o entrada?             |");
		System.out.println("|     Indicalo con una A o con una E          |");
		System.out.println("|                                             |");
		System.out.println("-----------------------------------------------");
		
		do //Do while para que sea A o E
		{
			
			respuesta = sc.next().charAt(0);
			
		}while(respuesta != 'e' && respuesta != 'E' && respuesta != 'a' && respuesta != 'A');
		
		if(respuesta == 'e'|| respuesta == 'E')		//Opcion de Entrada
		{
			entrada.setEntradaC();
		}
		
		if(respuesta == 'a' || respuesta == 'A')	//Opcion de Abonado
		{
			entrada.setEntradaA();
		}
		
	}	
	
	
	//Imprimir los datos del Espectador
	public void InformacionIntroducido() 
	{
		
		System.out.println("         Esta es la informacion que has añadido");		
		System.out.println("----------------------------------------------------------------");
		System.out.println("|                                                   ");
		System.out.println("|           Su nombre es = "+this.nombre);
		System.out.println("|           Su fecha de nacimiento es = "+this.FechaNacimiento);
		System.out.print("|           ");
		entrada.InformacionE();
		System.out.println("|                                                   ");
		System.out.println("----------------------------------------------------------------");
		
		
	}
	
	//Set y Get
	public void setNombre(String Nombre)	//Set de nombre
	{
		this.nombre = Nombre;
	}
	
	
	public void setFecha(String fecha)		//Set de fecha
	{
		this.FechaNacimiento = fecha;
	}
	
}