package src;

import java.util.Scanner;

public class Trivia {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc,change;
		int puntaje_correct;
		String resp;
		char a='s';
		String pregunta_config, respuest_correc;
		String preguntas_posibles[] = new String [5];
		
		//Crear objetos de clases
		
		Scanner sc = new Scanner (System.in);
		
		//Falta pedirle el nombre al usuario
		//Bienvenido
		//Jugar o salir
		
		//Segundo menu
		while(a=='s') {
		System.out.printf ("\n      	Juego de Trivia      ");
		System.out.printf ("\n[1].  Configuracion");
		System.out.printf ("\n[2].  Juego");
		System.out.printf ("\n[3].  Consulta de puntaje obtenido");
		System.out.printf ("\n[4].  Salir\n");
		
		opc = sc.nextInt();
		switch (opc) {
			//Configuracion
			case 1:
				System.out.print ("\n      	Configuración     ");
				
				System.out.print ("\nIngrese la pregunta: ");
				pregunta_config = sc.nextLine();
				
				System.out.print ("\nIngrese las posibles respuestas: \n"); 
				for(int i=0;i<5;i++) {
					preguntas_posibles[i] = sc.nextLine();
					}
				
				System.out.print ("\nIngrese la respuesta correcta: ");
				respuest_correc = sc.nextLine();
				
				System.out.print ("\nIngrese el puntaje de la respuesta correcta: ");
				puntaje_correct = sc.nextInt();
				
				System.out.println("Pruebas");
				System.out.println(pregunta_config);
				for(int i=0;i<preguntas_posibles.length;i++) {
					System.out.print (preguntas_posibles[i]);
					}
				System.out.println(respuest_correc);
				System.out.println(puntaje_correct);
				break;
		
			//Juego
			//No se debe permitir al usario elegir las mismas preguntas
			//Área de mensajes:
				//Pregunta correcta o incorrecta
				//Desea seguir jugando
			case 2:
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
					System.out.printf ("\n1. ¿Año en que se descubre America? "); 
					System.out.printf ("\n a) 1492 "); 
					System.out.printf ("\n b) 1512 "); 
					System.out.printf ("\n c)1903 "); 
					System.out.printf ("\n d)2016 "); 
					System.out.printf ("\n Seleccione la respuesta correcta"); 
					resp=sc.next();
					System.out.printf ("\n Seleccione la respuesta correcta"); 
					
					
				case 2:
					
					System.out.printf ("\n1. Cúal es la cabecera de la provincia de Coclé?"); 
					System.out.printf ("\n Aguadulce  "); 
					System.out.printf ("\n Penonomé  "); 
					System.out.printf ("\n Anton "); 
					System.out.printf ("\n Nata "); 
					System.out.printf ("\nSeleccione la respuesta correcta "); 
				    resp=sc.next();
					System.out.printf ("\n Seleccione la respuesta correcta "); 
				
				case 3: 
					System.out.printf ("\n3. ¿Cual es raiz cuadrada de 3600? "); 
					System.out.printf ("\n  600"); 
					System.out.printf ("\n 6 "); 
					System.out.printf ("\n 60 "); 
					System.out.printf ("\n 6000 "); 
					System.out.printf ("\nSeleccione la respuesta correcta "); 
					resp=sc.next();
					
				case 4: 
					System.out.printf ("\n4. Panamá limita al norte con "); 
					System.out.printf ("\n Panamá limita al norte con "); 
					System.out.printf ("\n Panamá limita al norte con "); 
					System.out.printf ("\n Panamá limita al norte con "); 
					System.out.printf ("\n Panamá limita al norte con "); 
					System.out.printf ("\nSeleccione la respuesta correcta ");
					resp=sc.next();
				
				case 5:
					System.out.printf ("\n5. ¿Cantidad de Comarcas indigenas que tiene Panamá? "); 
					System.out.printf ("\n 1 "); 
					System.out.printf ("\n 5 "); 
					System.out.printf ("\n 3 "); 
					System.out.printf ("\n 6 "); 
					System.out.printf ("\nSeleccione la respuesta correcta "); 
					resp=sc.next();
					
				case 6:
					System.out.printf ("\n ¿Cuantos distritos tiene la provincia? "); 
					System.out.printf ("\n 78 "); 
					System.out.printf ("\n 58 "); 
					System.out.printf ("\n 68"); 
					System.out.printf ("\n 48 "); 
					System.out.printf ("\nSeleccione la respuesta correcta "); 
					resp=sc.next();
					
				case 7:
					System.out.printf ("\n7.  Panamá limita con Colombia al"); 
					System.out.printf ("\n Norte"); 
					System.out.printf ("\n Sur"); 
					System.out.printf ("\n  Este"); 
					System.out.printf ("\n Oeste"); 
					System.out.printf ("\nSeleccione la respuesta correcta "); 
					resp=sc.next();
				
				case 8:
					System.out.printf ("\n8.  El itsmo de Panamá fue visitado por primera vez por  "); 
					System.out.printf ("\n Vasco Núñez de Balboa"); 
					System.out.printf ("\n Rodrigo de Bastidas  "); 
					System.out.printf ("\n  Diego de nicueza  "); 
					System.out.printf ("\n Cristobal Colón  "); 
					System.out.printf ("\n Seleccione la respuesta correcta "); 
					resp=sc.next();
				
				case 9:
					System.out.printf("\n9. ¿Año en que fue fundado la ciudad de Panamá?");
					System.out.printf("\n 1519");
					System.out.printf("\n 1529");
					System.out.printf("\n 1512");
					System.out.printf("\n 1509");
					System.out.printf ("\n Seleccione la respuesta correcta "); 
					resp=sc.next();
				
				case 10:
					System.out.printf("\n10. ¿Fue el primer europeo en division el oceano Pacifico?");
					System.out.printf("\n Cristobal Colón");
					System.out.printf("\n Vasco Núñez de Balboa ");
					System.out.printf("\n Rodrigo de Bastidas");
					System.out.printf("\n Diego de Nicueza");
					System.out.printf ("\n Seleccione la respuesta correcta "); 
					resp=sc.next();
				}
			}
		}
		}
}