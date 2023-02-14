import java.util.Scanner;

public class Main {

	public static void main(String [] args)
	{
			
		//Variables
		
		Scanner sc = new Scanner(System.in);	//Crear variable Scanner
		Estadio estadio = new Estadio();
		
		//Codigo
		
		//Inicio
		System.out.println("");
		System.out.println("-------------------------------------------------------------");
		System.out.println("|                                                           |");
		System.out.println("|---------- Formulario de infromacion del Estadio ----------|");
		System.out.println("|                                                           |");
		System.out.println("-------------------------------------------------------------");
		System.out.println("");
		System.out.println("");
		
		//Entrada al metodo de estadio
		estadio.Principal(estadio,sc);
		
		
		
		//Fin		
		System.out.println("");
		System.out.println("-------------------------------------------------------------");
		System.out.println("|                                                           |");
		System.out.println("|-------------------- Fin del formulario -------------------|");
		System.out.println("|                                                           |");
		System.out.println("-------------------------------------------------------------");
				
		sc.close();	//Cerrar Scanner
	}
}
