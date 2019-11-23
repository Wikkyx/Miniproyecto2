package src;

import java.util.Scanner;

public class Trivia {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc,change;
		char a='s';
		String pregunta_config;
		String preguntas_posibles[] = new String [4];
		
		//Crear objetos de clases
		
		Scanner sc = new Scanner (System.in);
		
		while(a=='s') {
		System.out.printf ("\n      	Juego de Trivia      ");
		System.out.printf ("\n[1].  Configuracion");
		System.out.printf ("\n[2].  Juego");
		System.out.printf ("\n[3].  Consulta de puntaje obtenido");
		System.out.printf ("\n[4].  Salir\n");
		
		opc = sc.nextInt();
		switch (opc) {
			case 1:
				System.out.printf ("\n      	Configuración     ");
				System.out.printf ("\nIngrese la pregunta: ");
				pregunta_config = sc.nextLine();
				System.out.printf ("\nIngrese las posibles respuestas: "); 
				for(int i=0;i<preguntas_posibles.length;i++) {
					preguntas_posibles[i] = sc.nextLine();
					}
				System.out.printf ("\nIngrese la respuesta correcta: ");
				System.out.printf ("\nIngrese el puntaje de la respuesta correcta: ");
				break;
			case 2:
				System.out.printf ("\n      Hasta la proximaaaaaaaas	:v     ");
		}
	     
		System.out.printf ("\n1. ¿Año en que se descubre America? "); 
		System.out.printf ("\n2. ¿Cual es la cabecera de la provincia de Coclé? "); 
		System.out.printf ("\n3. ¿Cual es raiz cuadrada de 3600? "); 
		System.out.printf ("\n4. Panamá limita al norte con "); 
		System.out.printf ("\n5. ¿Cantidad de Comarcas indigenas que tiene Panamá? "); 
		System.out.printf ("\n6. ¿Cuantos distritos tiene la provincia? "); 
		System.out.printf ("\n7.  Panamá limita con Colombia al"); 
		System.out.printf ("\n8.  El itsmo de Panamá fue visitado por primera vez por  "); 
		System.out.printf("\n9. ¿Año en que fue fundado la ciudad de Panamá?");
		System.out.printf("\n10. ¿Fue el primer europeo en division el oceano Pacifico?");
		
	
		change = sc.nextInt();
		switch(change) {
		case 1: 
			String resp;
			System.out.printf ("\n1. ¿Año en que se descubre America? "); 
			System.out.printf ("\n a) 1492 "); 
			System.out.printf ("\n b) 1512 "); 
			System.out.printf ("\n c)1903 "); 
			System.out.printf ("\n d)2016 "); 
			System.out.printf ("\n Seleccione la respuesta correcta"); 
			resp=sc.next();
			System.out.printf ("\n Seleccione la respuesta correcta"); 

		
		
		
		
		
		
		}
	}
}


			
			
			
			


}