import java.util.*;

public class Grada {

	
	//Atributos 

	private int columna;
	private int fila;
	private Asiento[][] asiento;

	//Constructor
		
	
		//Vacio
	
	public Grada()		//Para inicializar el array
	{
	 
		this.columna = 20;
		this.fila = 150;
		this.asiento = new Asiento[columna][fila];
		
		 for (int colum = 0; colum < this.asiento.length ; colum++)
		 {
	          for(int fil = 0; fil < this.asiento[0].length ; fil++)
	          {
	        	  
	        	  this.asiento[colum][fil] = new Asiento();			
	        	  
	           }
	       }
	 
	}	
	
	//metodo
	
		//Trasformar las letras en numeros
	
	public int Convertidor(char columnaU)
	{

		int columnaT = 0;
		
		if(columnaU == 'A'|| columnaU == 'a')
		{
			
			columnaT = 19;
		}
		
		if(columnaU == 'B'|| columnaU == 'b')
		{
			
			columnaT = 18;
		}
		
		if(columnaU == 'C'|| columnaU == 'c')
		{
			
			columnaT = 17;
		}
		
		if(columnaU == 'D'|| columnaU == 'd')
		{
			
			columnaT = 16;
		}
		
		if(columnaU == 'E'|| columnaU == 'e')
		{
			
			columnaT = 15;
		}
		
		if(columnaU == 'F'|| columnaU == 'f')
		{
			
			columnaT = 14;
		}
		
		if(columnaU == 'G'|| columnaU == 'g')
		{
			
			columnaT = 13;
		}
		
		if(columnaU == 'H'|| columnaU == 'h')
		{
			
			columnaT = 12;
		}
		
		if(columnaU == 'I'|| columnaU == 'i')
		{
			
			columnaT = 11;
		}
		
		if(columnaU == 'J'|| columnaU == 'j')
		{
			
			columnaT = 10;
		}
		
		if(columnaU == 'K'|| columnaU == 'k')
		{
			
			columnaT = 9;
		}
		
		if(columnaU == 'L'|| columnaU == 'l')
		{
			
			columnaT = 8;
		}
		
		if(columnaU == 'M'|| columnaU == 'm')
		{
			
			columnaT = 7;
		}
		
		if(columnaU == 'N'|| columnaU == 'n')
		{
			
			columnaT = 6;
		}
		
		if(columnaU == 'O'|| columnaU == 'o')
		{
			
			columnaT = 5;
		}
		
		if(columnaU == 'P'|| columnaU == 'p')
		{
			
			columnaT = 4;
		}
		
		if(columnaU == 'Q'|| columnaU == 'q')
		{
			
			columnaT = 3;
		}
		
		if(columnaU == 'R'|| columnaU == 'r')
		{
			
			columnaT = 2;
		}
		
		if(columnaU == 'S'|| columnaU == 's')
		{
			
			columnaT = 1;
		}
		
		if(columnaU == 'T'|| columnaU == 't')
		{
			
			columnaT = 0;
		}
		
		return columnaT;
		
	}
	
	
	//Ocupacion del asiento automatico
	
	public void OcupacionGradaAutomatico(Estadio esta)
	{
		Estadio estadio = esta;
		int ocupacion = estadio.getAsistencia();
	
		 for(int colu = 0; colu < this.columna ; colu++)
		 {					 
	          for(int fil = 0; fil < fila ; fil++)
	          {
	        	  if(ocupacion == 0)
	        	  {
	        		  break;
	        	  }
        		  this.asiento[colu][fil].UsuarioAleatorio();	//Nombres y datos por defecto para rellenar sitios por los asistentes aleatorios
        		  ocupacion--;
	           }
		 }

	}

	
	//Ocupacion del asiento automatico por le numero de asistentes
	
	public void OcupacionGradaAutomaticoPorNumeroUsuario(Estadio esta, int numeroU)
	{
		Estadio estadio = esta;
	
		 for(int colu = 0; colu < this.columna ; colu++)
		 {					 
	          for(int fil = 0; fil < fila ; fil++)
	          {
	        	  if(getOcupacion(colu, fil) == false)
	        	  {
		        	  if(numeroU == 0)
		        	  {
		        		  break;
		        	  }
	        		  this.asiento[colu][fil].UsuarioAleatorio();	//Nombres por defectos y datos para rellenar esos sitios por los asistentes que nos da el usuario
	        		  numeroU--;
	        		  
	        		  char letraU = this.letra(colu);
	        		  System.out.println("Este es tu asiento = "+(fil+1)+letraU);
	        	  }
	           }
		 }
		 System.out.println("");
		 System.out.println("");
	}
	
	
	
	//Dibujo con gradas ocupadas antes de las que pongamos
	
	
	public void DibujoOcupado(Estadio esta, int numero)
	{
		Estadio estadio = esta;
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Esta es la ocupacion actual de la grada");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Actualmente esta ocupado = "+(estadio.getAsistencia()+numero)+" sitios ");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		 for(int colu = 0; colu < this.columna ; colu++)
		 {		
				char columnaLetra = this.letra(colu);
	     		
	     		//Transformar numero en letra

				
			 System.out.print(columnaLetra+" ");
			 
	          for(int fil = 0; fil < this.fila ; fil++)
	          {
	
					if(asiento[colu][fil].getOcupado() == true)
					{
			             System.out.print(" "+(fil+1)+"(X)"+" ");
					}
						
					if(asiento[colu][fil].getOcupado() == false)
					{
			             System.out.print(" "+(fil+1)+"(#)"+" ");
					}
					
	           }
     
	          System.out.println("");
		 }
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("|                                                                               |");
	        System.out.println("|         Los asiento ocupados tendran una X y los libres tendran una #         |");  
			System.out.println("|                                                                               |");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("");
			System.out.println("");
			System.out.println("");
	     
	}
	
	
		//Dibujo despues de añadir
	
	public void DibujoOrientacion()
	{
	
		System.out.println("");
		System.out.println("");
		System.out.println("------------------------");
		System.out.println("|                      |");
		System.out.println("|   Ya estas añadido   |");
		System.out.println("|                      |");
		System.out.println("------------------------");
		System.out.println("");
		System.out.println("");
		
		 for(int colu = 0; colu < this.columna ; colu++)
		 {		
				char columnaLetra = this.letra(colu);	//Transoformar el numero de colu a letra en el metodo letra
	     		
	     		//Transformar numero en letra

				
			 System.out.print(columnaLetra+" ");
			 
	          for(int fil = 0; fil < this.fila ; fil++)
	          {
	
					if(asiento[colu][fil].getOcupado() == true)
					{
			             System.out.print(" "+(fil+1)+"(X)"+" ");
					}
						
					if(asiento[colu][fil].getOcupado() == false)
					{
			             System.out.print(" "+(fil+1)+"(#)"+" ");
					}
					
	           }
     
	          System.out.println("");
		 }
		 
		 System.out.println("");
		 System.out.println("");
		 System.out.println("");
		 
	}
	
	
		//Transformar numero en letra para el anterior metodo
	public char letra(int columna)
	{
		char columnaLetra = 'Z';
		
		if(columna == 0)
		{
			
			columnaLetra = 'T';
		}
		
		if(columna == 1)
		{
			
			columnaLetra = 'S';
		}
		
		if(columna == 2)
		{
			
			columnaLetra = 'R';
		}
		
		if(columna == 3)
		{
			
			columnaLetra = 'Q';
		}
		
		if(columna == 4)
		{
			
			columnaLetra = 'P';
		}
		
		if(columna == 5)
		{
			
			columnaLetra = 'O';
		}
		
		if(columna == 6)
		{
			
			columnaLetra = 'N';
		}
		
		if(columna == 7)
		{
			
			columnaLetra = 'M';
		}
		
		if(columna == 8)
		{
			
			columnaLetra = 'L';
		}
		
		if(columna == 9)
		{
			
			columnaLetra = 'K';
		}
		
		if(columna == 10)
		{
			
			columnaLetra = 'J';
		}
		
		if(columna == 11)
		{
			
			columnaLetra = 'I';
		}
		
		if(columna == 12)
		{
			
			columnaLetra = 'H';
		}
		
		if(columna == 13)
		{
			
			columnaLetra = 'G';
		}
		
		if(columna == 14)
		{
			
			columnaLetra = 'F';
		}
		
		if(columna == 15)
		{
			
			columnaLetra = 'E';
		}
		
		if(columna == 16)
		{
			
			columnaLetra = 'D';
		}
		
		if(columna == 17)
		{
			
			columnaLetra = 'C';
		}
		
		if(columna == 18)
		{
			
			columnaLetra = 'B';
		}
		
		if(columna == 19)
		{
			
			columnaLetra = 'A';
		}
		
		return columnaLetra;
	}
		
	//Ocupacion del asiento 
	public void CreacionGrada(int paramColumna,int paramFila,Scanner sc)
	{
	
		int colum =  paramColumna;
		int fil = paramFila;
		
	    this.asiento[colum][fil].AñadirUsuarioM(sc);

	}
	
	//Buscar sitio libre
	public int SitioLibre()
	{
		int fil = 149;

	    for(fil = 0; fil < this.fila ; fil++)
	    {			
			if(asiento[14][fil].getOcupado() == false)
				{
					return fil+1;
				}
	     }
        return fil;
	}
	
	//Get set
	
	public boolean getOcupacion(int colu, int fil)	//Get saber si esta ocupado el sitio o no
	{
		return asiento[colu][fil].getOcupado();
	}
}
