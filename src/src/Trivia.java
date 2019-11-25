package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Trivia {
		public static String pregunta_config;
		public static String respuest_correc;
		public static String preguntas_posibles[] = new String [4];
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc,change, opc_config;
		int puntaje_correct=0;
		String resp,cod;
		char a='s';
		char opc_config_a = 's';


		
		
		//Crear objetos de clases
		
		Scanner sc = new Scanner (System.in);
		ArrayList<String> coleccion_preg = new ArrayList<String>();	
		ArrayList<String> coleccion_resp = new ArrayList<String>();	
		ArrayList<Integer> coleccion_punt = new ArrayList<Integer>();	
		ArrayList<ArrayList<String> > coleccion_posibles =  
                new ArrayList<ArrayList<String> >(); 
        ArrayList<String> ayuda = new ArrayList<String>(); 


		
		//Falta pedirle el nombre al usuario
		//Bienvenido
		//Jugar o salir
		
		//Segundo menu
        
        System.out.printf ("\n1. Jugar");
		System.out.printf ("\n2. Salir");
		
        
		while(a=='s') {
		System.out.printf ("\n      	Juego de Trivia      ");
		System.out.printf ("\n[1].  Configuracion");
		System.out.printf ("\n[2].  Juego");
		System.out.printf ("\n[3].  Consulta de puntaje obtenido");
		System.out.printf ("\n[4].  Salir\n");
		
		opc = sc.nextInt();
		sc.nextLine();
		switch (opc) {
			//Configuracion
			case 1:
				System.out.print ("\n      	Configuraci�n     ");
				System.out.print ("\n1.A�adir pregunta     ");
				System.out.print ("\n2.Eliminar pregunta     ");
				System.out.print ("\nPresione cualquier n�mero para salir   \n");

				opc_config = sc.nextInt();
				sc.nextLine();
				switch (opc_config) {
				
				case 1:
					
					while (opc_config_a == 's') {
						
						
						System.out.print ("\nIngrese la pregunta: ");
						Trivia.pregunta_config = sc.nextLine();
						
						System.out.print ("\nIngrese las posibles respuestas: \n"); 
						ayuda = new ArrayList<String>();
						for(int i=0;i<Trivia.preguntas_posibles.length;i++) {
							preguntas_posibles[i] = sc.nextLine();
							String b = preguntas_posibles[i];
							ayuda.add(b);
							}
					
						
						System.out.println ("Ingrese la respuesta correcta: ");
						respuest_correc = sc.nextLine();
						
						System.out.println ("Ingrese el puntaje de la respuesta correcta: ");
						puntaje_correct = sc.nextInt();
						sc.nextLine();
						
						coleccion_preg.add(Trivia.pregunta_config);
						coleccion_posibles.add(ayuda);
						coleccion_resp.add(Trivia.respuest_correc);
						coleccion_punt.add(puntaje_correct);
						
						System.out.println("�Desea a�adir otra pregunta? s/n");
						opc_config_a = sc.next().charAt(0);
						sc.nextLine();
					}
					System.out.println("Pruebas");

					//Verifica si alguna pregunta es parecida
					for (int i = 0; i < coleccion_preg.size(); i++) {
						  for (int j = 1; j < coleccion_preg.size()-1; j++) {
							  if (coleccion_preg.get(i)== coleccion_preg.get(j)) {
								  System.out.println("Alguna pregunta es igual a una ya existente.");
							  }
							  else {
								  continue;
							  }
						  }
						}


					
					System.out.println(coleccion_preg);
					System.out.println(coleccion_posibles);
					System.out.println(coleccion_resp);
					System.out.println(coleccion_punt);
					break;
				case 2:
					char e = 's';
					while (e =='s') {
						System.out.println("Aqu� se encuentran sus preguntas");
							if (coleccion_preg.size()>0) {
								for (int i=0; i<coleccion_preg.size();i++) {
									System.out.println((i+1)+".  "+coleccion_preg.get(i));
								}
								System.out.println("�Desea eliminar alguna? s/n");
								char elim = sc.next().charAt(0);
								if (elim == 's') {
									System.out.println("�Cu�l desea eliminar?");
									int delete = sc.nextInt();
									delete = delete - 1;
									sc.nextLine();
									coleccion_preg.remove(delete);
								}
								else {
										break;
								}
							
						}
							else {
								System.out.println("No hay ninguna pregunta.");
								break;
						}
						
						
						}
					break;
					
				default:
					break;			
				}
				break;
			//Juego
			//No se debe permitir al usario elegir las mismas preguntas
			//�rea de mensajes:
				//Pregunta correcta o incorrecta
				//Desea seguir jugando
			case 2:
				System.out.printf ("\n1. �A�o en que se descubre America? "); 
				System.out.printf ("\n2. �Cual es la cabecera de la provincia de Cocl�? "); 
				System.out.printf ("\n3. �Cual es raiz cuadrada de 3600? "); 
				System.out.printf ("\n4. Panam� limita al norte con "); 
				System.out.printf ("\n5. �Cantidad de Comarcas indigenas que tiene Panam�? "); 
				System.out.printf ("\n6. �Cuantos distritos tiene la provincia? "); 
				System.out.printf ("\n7.  Panam� limita con Colombia al"); 
				System.out.printf ("\n8.  El itsmo de Panam� fue visitado por primera vez por  "); 
				System.out.printf ("\n9. �A�o en que fue fundado la ciudad de Panam�?");
				System.out.printf ("\n10. �Fue el primer europeo en division el oceano Pacifico?\n");
				if (Trivia.pregunta_config != null) {
					for (int i=0; i<coleccion_preg.size();i++) 
					System.out.println("1"+(i+1)+".  "+coleccion_preg.get(i));
					
				}
				
					change = sc.nextInt();
			
				
				if (change ==1) { 
					System.out.print ("\n1. �A�o en que se descubre America? "); 
					System.out.print ("\n a) 1492 "); 
					System.out.print ("\n b) 1512 "); 
					System.out.print ("\n c)1903 "); 
					System.out.print ("\n d)2016 "); 
					System.out.print ("\n Seleccione la respuesta correcta: \n"); 
					resp=sc.next();
					}
				else if (change ==2) { 
					
					System.out.print ("\n2. C�al es la cabecera de la provincia de Cocl�?"); 
					System.out.print ("\n Aguadulce  "); 
					System.out.print ("\n Penonom�  "); 
					System.out.print ("\n Anton "); 
					System.out.print ("\n Nata "); 
					System.out.print ("\nSeleccione la respuesta correcta: \n"); 
				    resp=sc.next();
					}
				else if (change ==3) { 
					System.out.print ("\n3. �Cual es raiz cuadrada de 3600? "); 
					System.out.print ("\n  600"); 
					System.out.print ("\n 6 "); 
					System.out.print ("\n 60 "); 
					System.out.print ("\n 6000 "); 
					System.out.print ("\nSeleccione la respuesta correcta: \n"); 
					resp=sc.next();
					}	
				else if (change ==4) { 
					System.out.print ("\n4. Panam� limita al norte con "); 
					System.out.print ("\n Panam� limita al norte con "); 
					System.out.print ("\n Panam� limita al norte con "); 
					System.out.print ("\n Panam� limita al norte con "); 
					System.out.print ("\n Panam� limita al norte con "); 
					System.out.print ("\nSeleccione la respuesta correcta: \n"); 
					resp=sc.next();
					}
				else if (change ==5) { 
					System.out.print ("\n5. �Cantidad de Comarcas indigenas que tiene Panam�? "); 
					System.out.print ("\n 1 "); 
					System.out.print ("\n 5 "); 
					System.out.print ("\n 3 "); 
					System.out.print ("\n 6 "); 
					System.out.print ("\nSeleccione la respuesta correcta: \n"); 
					resp=sc.next();
					}	
				else if (change ==6) { 
					System.out.print ("\n �Cuantos distritos tiene la provincia? "); 
					System.out.print ("\n 78 "); 
					System.out.print ("\n 58 "); 
					System.out.print ("\n 68"); 
					System.out.print ("\n 48 "); 
					System.out.print ("\nSeleccione la respuesta correcta: \n"); 
					resp=sc.next();
					}
				else if (change ==7) { 
					System.out.print ("\n7.  Panam� limita con Colombia al"); 
					System.out.print ("\n Norte"); 
					System.out.print ("\n Sur"); 
					System.out.print ("\n  Este"); 
					System.out.print ("\n Oeste"); 
					System.out.print ("\nSeleccione la respuesta correcta: \n"); 
					resp=sc.next();
					}
				else if (change ==8) { 
					System.out.print ("\n8.  El itsmo de Panam� fue visitado por primera vez por  "); 
					System.out.print ("\n Vasco N��ez de Balboa"); 
					System.out.print ("\n Rodrigo de Bastidas  "); 
					System.out.print ("\n  Diego de nicueza  "); 
					System.out.print ("\n Cristobal Col�n  "); 
					System.out.print ("\nSeleccione la respuesta correcta: \n"); 
					resp=sc.next();
				
					}
				else if (change ==9) { 
					System.out.print("\n9. �A�o en que fue fundado la ciudad de Panam�?");
					System.out.print("\n 1519");
					System.out.print("\n 1529");
					System.out.print("\n 1512");
					System.out.print("\n 1509");
					System.out.print ("\nSeleccione la respuesta correcta: \n"); 
					resp=sc.next();
					}
				
				else if (change ==10) { 
					System.out.print("\n10. �Fue el primer europeo en division el oceano Pacifico?");
					System.out.print("\n Cristobal Col�n");
					System.out.print("\n Vasco N��ez de Balboa ");
					System.out.print("\n Rodrigo de Bastidas");
					System.out.print("\n Diego de Nicueza");
					System.out.print ("\nSeleccione la respuesta correcta: \n"); 
					resp=sc.next();
					}
					
				else if (change == 11 & coleccion_preg.get(0)!= null) {
					System.out.println("Si hay pregunta 11");
				}
				
				else if (change == 12 & coleccion_preg.get(1) != null) {
					System.out.println("Si hay pregunta 11");

				}
					
				else {
					System.out.println("Numero incorrecto.");
					break;
					}
				}
			}
	
		}
	}
