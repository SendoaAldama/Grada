import java.util.*;




public class Estadio {

	//Atributos
	private Partido partido;
	private Grada grada;
	
	
	//Constructores 
	
	public Estadio()
	{
		this.partido = new Partido();
		this.grada = new Grada();
	}		
	
	//Metodos
	
	public void Principal(Estadio estadio, Scanner sc)
	{
		
		//Variables

		boolean Entrada;
		
		//Codigo
				
				//Juego
		
		System.out.println("Comenzaremos recogiendo informacion sobre el partido al que vas a ir");
		System.out.println();
		System.out.println();
		
				//Deporte practicado
		
		estadio.Juego(sc);		
		
				//Competicion
		
		estadio.Competicion(sc);
		
				//Equipo1
		
		estadio.Equipo1(sc);
		
				//Equipo2
		
		estadio.Equipo2(sc);
		
				//Tiempo del dia del partido
		
		estadio.Tiempo(sc);
		
				//Entrada
		
		Entrada = estadio.Entrada(sc);
		
				//Asisencia

		partido.setAsistencia(new Random().nextInt(500));
		
		
			//Ver resultado de lo que hemos hecho, con la diferencia entre entrada y abonado
		
		
		if(Entrada == true)		
		{
			partido.ResultadoC();	//Si escogemos entrada venimos a esta opcion
		}
		
		if(Entrada == false)
		{
			partido.ResultadoA();	//Si escogemos abonado vendremos a esta opcion
		}
		
		estadio.InformacionGrada(estadio,sc);	//Ir a rellenar la informacion de la grada
		
	}	
	
	
		//Juego
	public void Juego(Scanner sc)
	{
		
		System.out.println("");
		System.out.println("");
		System.out.println("-----------------------------------------------");
		System.out.println("|         Que deporte estan jugando?          |");
		System.out.println("-----------------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		partido.setJuego(sc.nextLine());	//Rcoger por Scanner el deporte que juegan
		
	}
		
	
		//Competicion
	public void Competicion(Scanner sc)
	{
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("---------------------------------------------");
		System.out.println("|      En que competicion se encuentran     |");	
		System.out.println("---------------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		partido.setCompeticion(sc.nextLine());	//Recoger por Scannere en que competicion estan jugando
	
	}
	
	
		//Equipo1
	public void Equipo1(Scanner sc)
	{
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("---------------------------------------------");
		System.out.println("|     Dime uno de los equipos que juegan    |");
		System.out.println("---------------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		partido.setEquipo1(sc.nextLine());	//Recoger por Scanner el nombre del primer equipo
		
	}
	
	
		//Equipo2
	public void Equipo2(Scanner sc)
	{
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("----------------------------------------------------------------");
		System.out.println("|   Dime como se llama el otro equipo, no me pongas el mismo   |");
		System.out.println("|      porque te hare repetirmelo hasta que pongas otro        |");
		System.out.println("----------------------------------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println(""); 	
		
		do
		{
			
			partido.setEquipo2(sc.nextLine());		//Recoger por Scanner el nombre del segundo equipo
			
			if(partido.getEquipo1().equals(partido.getEquipo2()))	//Comprobador de que no es el mismo equipo que el de antes
			{
				System.out.println("Pusiste el mismo");
				System.out.println("       -_-      ");
			}
			
				
		}while(partido.getEquipo1().equals(partido.getEquipo2()));		//Al no ser el mismo pasa el do while perfectamente
		
	}
	
	
		//Tiempo
	public void Tiempo(Scanner sc)
	{
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("|     Que tipo de tiempo va a hacer el dia del partido     |");
		System.out.println("------------------------------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		partido.setCondicionesMeteorologicas(sc.nextLine());	//Scanner para recoger el tiempo que pone el usuario
		
	}
	
	
		//Entrada
	public boolean Entrada(Scanner sc)
	{
		boolean Entrada = true;
		
		//Variables de entrada
		
		int pregunta;
		double precioEntrada;
		
				
			//Codigo
				
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("-----------------------------------------------");
		System.out.println("|   Eres abonado o has comprado la entrada?   |");
		System.out.println("--------------   1. Entrada   ------------------");
		System.out.println("             |   2. Abonado   |");
		System.out.println("             ------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("");
				
		do
		{
					
			pregunta = sc.nextInt();
			if(pregunta == 1)	//Opcion de entrada 
			{
				Entrada = true;
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("--------------------------------------");
				System.out.println("|     La entrada cuesta 25.50€       |"); 
				System.out.println("--------------------------------------");
				precioEntrada = 25.50;
				partido.setCosteEntrada(precioEntrada);	//Indicar el precio de la entrada
				break;
						
			}
					
			if(pregunta == 2)	//Opcion de abonado
			{
				Entrada = false;
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("-----------------------------------------");
				System.out.println("|  Cuanto pagas al año por ser abonado  |");
				System.out.println("-----------------------------------------");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				partido.setCosteEntrada(sc.nextDouble());		//Recoger por scanner lo que cuesta al año ser abonado					
				break;
			}
					
		}while(pregunta == 1 || pregunta == 2);
		
		return Entrada;
		
	}
		
	
	
		//Rellenar fila y columna
	public void InformacionGrada(Estadio estadio,Scanner sc)
	{
		
		//Variables Filas y columnas
		char fila = 0;
		char respuesta;
		int columna = 0;
		int numero = 0;
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("|                                                                                                                                       |");
		System.out.println("|                                          Despues de darnos la informacion del partido                                                 |");
		System.out.println("|                                                                                                                                       |");
		System.out.println("|                               Que modo quieres usar para sentarte en un asiento de la grada                                           |");
		System.out.println("|                                                                                                                                       |");
		System.out.println("|                     Indicalo con un A o una M, si es M te mandaremos que nos indiques cual es tu asiento                              |");
		System.out.println("|                                                                                                                                       |");
		System.out.println("|              Si es A, Te preguntaremos cuantos sitios quieres ocupar y te sentaremos automaticamente en esos sitios                   |");
		System.out.println("|                                                                                                                                       |");
		System.out.println("|         La opcion de M, intoduciras manualmente el asiento, tendras un chance de 3 errores, sino te ofreceremos un sitio              |");
		System.out.println("|                                                   puedes añadir mas de uno                                                            |");
		System.out.println("|                                                                                                                                       |");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		do
		{
			
			respuesta = sc.next().charAt(0);
			
		}while(respuesta != 'm' && respuesta != 'M' && respuesta != 'a' && respuesta != 'A');
		
		
		grada.OcupacionGradaAutomatico(estadio); //Ocupacion automatica con los asistentes aleatorios de antes
		
		
			//Esta opcion es la opcion de que no tiene ningun sitio asignado
		
		
		if(respuesta == 'm' || respuesta == 'M')
		{
			
			estadio.Manual(estadio, numero, sc, columna, fila, respuesta);			
			
		}
		

			//Esta es la opcion de cuando tiene ya un sitio asignado
		
		
		if(respuesta == 'a' || respuesta == 'A')
		{
			
			estadio.Automatico(estadio, numero, sc, columna, fila, respuesta);
			
		}
		
	}
	
	
	
	
	//Opcion manual
	
	public void Manual(Estadio estadio, int numero, Scanner sc, int columna, char fila, char respuesta)
	{
		//Variables
		
		int contadorError = 0;	//Contador de errores
		int libre = 0;
		
		//Codigo
		
		do  // Nuevo usuario
		{
			System.out.println("");
			System.out.println("");
			System.out.println("");
			grada.DibujoOcupado(estadio,numero);	//Dibujo de como esta ocupado la grada
			System.out.println("");
			System.out.println("");
			System.out.println("--------------------------------------------------------------------------------------------------------");
			System.out.println("|                                                                                                      |");
			System.out.println("|  Escoge un sitio para ocupar, si seleccionas 3 veces uno que esta ocupado te diremos un sitio libre  |");
			System.out.println("|                                                                                                      |");
			System.out.println("--------------------------------------------------------------------------------------------------------");
			System.out.println("");	
			System.out.println("");
			System.out.println("");
			
			
			do { //Bucle comprobar si esta ocupado el sitio
				
				System.out.println("");
				System.out.println("----------------------------------------------------------------------------------------------------------------");
				System.out.println("|                                                                                                              |");
				System.out.println("|   Dime en que columna te vas a sentar, ten presente que solo hay 150 columnas, comienza desde la columna 1   |");		
				System.out.println("|                                    Errores cometidos "+contadorError+"                                                       |");
				System.out.println("----------------------------------------------------------------------------------------------------------------");
				System.out.println("");
				System.out.println("");
				System.out.println("");
	
				
				do	//Comprobar las filas
				{
					
						columna = sc.nextInt();	//Scanner de Int para las filas
						columna = columna-1;	//Quitar una para que luego se vea bien en el dibujo
						
					}while(columna < 0 || columna > 149);
				
				System.out.println("");
				System.out.println("");
				System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("|                                                                                                                                       |");
				System.out.println("|      Ahora dime cual es tu fila, puedes escribir la letra en mayusculas y en minusculas, la ultima letra que puedes poner es T        |");
				System.out.println("|                                                                                                                                       |");
				System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("");
				System.out.println("");
				System.out.println("");
	
				
				do 	//Comprobar las columnas
				{
					
							fila = sc.next().charAt(0);	//Columna que escoje el usuario
							
					}while(fila != 'A' && fila != 'a' && fila != 'B' && fila != 'b' && fila != 'C' && fila != 'c' && fila != 'D' && fila != 'd' && fila != 'E' && fila != 'e' && fila != 'F' && fila != 'f' && fila != 'G' && fila != 'g' && fila != 'H' && fila != 'h' && fila != 'I' && fila != 'i' && fila != 'J' && fila != 'j'  && fila != 'K' && fila != 'k'  && fila != 'L' && fila != 'l'  && fila != 'M' && fila != 'm'  && fila != 'N' && fila != 'n' && fila != 'P' && fila != 'p'  && fila != 'Q' && fila != 'q'  && fila != 'R' && fila != 'r'  && fila != 'S' && fila != 's' && fila != 'T' && fila != 't');
					
					int columnaU;
					columnaU = grada.Convertidor(fila);	//Transformar la letra en numero para el int de grada
					
					System.out.println("");
					System.out.println("");
					System.out.println("-----------------------------------------------------------------------------------");
					System.out.println("|");
					System.out.println("|   Tu sitio con la informacion que me has dado es este "+(columna+1)+fila);
					System.out.println("|");
					System.out.println("------------------------------------------------------------------------------------");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					
					if(grada.getOcupacion(columnaU,columna) == false)
					{
						grada.CreacionGrada(columnaU,columna,sc);
						break;
					}
					
					if(grada.getOcupacion(columnaU,columna) == true)
					{
						System.out.println("Este sitio esta ocupado");
						
						contadorError++;	//Sumar uno al contador
						if(contadorError == 3)		//Si llega a 3 el contador
						{
							
							System.out.println("Este es un sitio que esta libre, por si quieres escojerlo?");
							libre = grada.SitioLibre();
							System.out.println(libre+"F"); //Ejemplo de sitio vacio							
							contadorError = 0;		//Reinicio de errores del contador
						}		
					}			
					
			}while(grada.getOcupacion(grada.Convertidor(fila),columna) == true);	
			grada.DibujoOrientacion();	//Dibujo despues de escoger
			
			System.out.println("");
			System.out.println("");
			System.out.println("--------------------------------------------------------------");
			System.out.println("|                                                            |");
			System.out.println("|   Quieres meter otro usuario? Di S si es si o N si es no   |");
			System.out.println("|                                                            |");
			System.out.println("--------------------------------------------------------------");
			
			do	//Comprobar si es S o N, sino vuelve a mandar escribir
			{
				
					respuesta = sc.next().charAt(0);	//Recoger Char
					
			}while(respuesta != 's' && respuesta != 'S' && respuesta != 'n' && respuesta != 'N');
			
			if(respuesta == 's' || respuesta == 'S')
			{
				System.out.println("-----------------------------");
				System.out.println("|                           |");
				System.out.println("|   Volvemos a empezar...   |");
				System.out.println("|                           |");
				System.out.println("-----------------------------");
				numero = numero+1;
			}
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			
		}while(respuesta != 'n' && respuesta != 'N');
		grada.DibujoOrientacion();		//Dibujo despues de escoger
		
	}
	
	
	
	//Opcion Automatica
	
	public void Automatico(Estadio estadio, int numero, Scanner sc, int fila, char columna, char respuesta)
	{
		//Variables
		
		int numeroUsuarios = 0;		//Numero de usuarios a crear
		int ocupacionMaxima = 3000-estadio.getAsistencia();
		
		//Codigo
		

		System.out.println("");
		System.out.println("");
		System.out.println("");
		grada.DibujoOcupado(estadio,numero); //Ocupacion de la tabla
		System.out.println("");
		System.out.println("");
		System.out.println("-----------------------------------------");
		System.out.println("|                                       |");
		System.out.println("|   Cuantas asientos quieres ocupar?    |");
		System.out.println("|                                       |");
		System.out.println("-----------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("|                                                                                  |");
		System.out.println("|     El numero tiene que ser mayor de 0 y menor del numero actual de asistentes   |");
		System.out.println("|                   Sino tendras que repetir el numero indicado                    |");
		System.out.println("|                   Solo puedes ocupar actualmente "+ocupacionMaxima+" asientos                   |");
		System.out.println("|                                                                                  |");
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		do 	//Comprobar que el numero no sea ni mayor de la asistencia que hay en el partido ni menos de 0
		{
		
			numeroUsuarios = sc.nextInt();	//Numero a introducir
			
		}while(numeroUsuarios > ocupacionMaxima || numeroUsuarios <= 0 );
		
		grada.OcupacionGradaAutomaticoPorNumeroUsuario(estadio,numeroUsuarios);		//Ocupacion de la grada por el numero indicado anteriormente
		grada.DibujoOrientacion();		//Dibujo despues de escoger
		
	}
	
	//Get y set
	
	
	public int getAsistencia()
	{
		return this.partido.getAsistencia();
	}
	
	public Partido getPartido() {
		return partido;
	}
	public void setPartido(Partido partido) {
		this.partido = partido;
	}
	public Grada getGrada() {
		return grada;
	}
	public void setGrada(Grada grada) {
		this.grada = grada;
	}
}