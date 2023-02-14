import java.util.*;

/*
 *	Esta clase define los atributos que va a tener el partido que  
 *	va a ir a ver el espectador que se situa en la grada que es 
 *	otro objeto que hemos creado.
 *
 *  @author: Sendoa Aldama Ramos
 *  @version: 05/05/2022
 *  @see <a href="https://buscaminas.eu/"></a>
 *  
*/

public class Partido {
	
/*
 * Juego Es el juego que se esta jugando
 * Equipo1 Es uno de los dos equipos	
 * Equipo2 Es el segundo de los dos equipos
 * Competicion Es en la competicion en la que se encuentran
 * CondicionesMeteorologicas Es el tiempo que hace durante o el dia del partido
 * Asistencia Es el numero de asistentes que van al partido
 * CosteEntrada Es el coste de cada entrada
*/	
	
	//Atributos
	
	private String juego;
	private String equipo1;
	private String equipo2;
	private String competicion;
	private String condicionesMeteorologicas;
	private int asistencia;
	private double costeEntrada;
	
	//Constructor
	
		//Vacio
	
	/*
	 * @
	 */	
	
	public Partido()
	{
		
		this.juego = " ";
		this.equipo1 = " ";
		this.equipo2 = " ";
		this.competicion = " ";
		this.condicionesMeteorologicas = " ";
		this.asistencia = 0;
		this.costeEntrada = 0;
		
	}
	
		//Completo
	public Partido(String Juego,String Equipo1,String Equipo2,String Competicion,String Tiempo,int Asistencia,double Entrada)
	{
		
		this.juego = Juego;
		this.equipo1 = Equipo1;
		this.equipo2 = Equipo2;
		this.competicion = Competicion;
		this.condicionesMeteorologicas = Tiempo;
		this.asistencia = Asistencia;
		this.costeEntrada = Entrada;
		
	}

	
	
	//Metodos


		public void ResultadoC()
		{
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("--------------------------------------------");
			System.out.println("   ---Esto es todo lo que ha puesto---");
			System.out.println("");
			System.out.println("Estan jugando al "+this.juego);
			System.out.println("");
			System.out.println("Estan compitiendo en el/la "+this.competicion);
			System.out.println("");
			System.out.println("El partido es "+this.equipo1+" vs "+this.equipo2);
			System.out.println("");
			System.out.println("El tiempo actual es "+this.condicionesMeteorologicas);
			System.out.println("");
			System.out.println("El numero de asistentes que va a ver son "+this.asistencia);
			System.out.println("");
			System.out.println("Te a costado comprar una entrada son "+this.costeEntrada+"0€");
			System.out.println("--------------------------------------------");
			System.out.println("");
			System.out.println("");
			Partido p = new Partido(this.juego,this.equipo1,this.equipo2,this.competicion,this.condicionesMeteorologicas,this.asistencia,this.costeEntrada);
			
		}

		public void ResultadoA()
		{
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("---------------------------------------------------------------");
			System.out.println("Esto es todo lo que ha puesto");
			System.out.println("Estan jugando al "+this.juego);
			System.out.println("Estan compitiendo en el/la "+this.competicion);
			System.out.println("El partido es "+this.equipo1+" vs "+this.equipo2);
			System.out.println("El tiempo actual es "+this.condicionesMeteorologicas);
			System.out.println("El numero de asistentes que va a ver son "+this.asistencia);
			System.out.println("Te cuesta al año ser abonado = "+this.costeEntrada+"€");
			System.out.println("---------------------------------------------------------------");
			System.out.println("");
			System.out.println("");
			Partido p = new Partido(this.juego,this.equipo1,this.equipo2,this.competicion,this.condicionesMeteorologicas,this.asistencia,this.costeEntrada);
			
		}
		
		//Get set
		

		
		public void setAsistencia(int asistencia)
		{
			this.asistencia = asistencia;
		}
		
		public int getAsistencia()
		{
			return this.asistencia;
		}
		
		
		public void setJuego(String juego)
		{
			this.juego = juego;
		}


		public String getJuego() 
		{
			return this.juego;
		}


		public void setCompeticion(String competicion) 
		{
			this.competicion = 	competicion;		
		}


		public void setEquipo1(String next)
		{
			this.equipo1 = next;
		}

		public Object getEquipo1() 
		{
			return this.equipo1;
		}
		
		public void setEquipo2(String next) 
		{
			this.equipo2 = next;
		}


		public Object getEquipo2() 
		{
			return this.equipo2;
		}


		public void setCondicionesMeteorologicas(String next) 
		{
			this.condicionesMeteorologicas = next;
		}


		public void setCosteEntrada(double nextDouble) 
		{
			this.costeEntrada = nextDouble;
		}
}