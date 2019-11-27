package src;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Programa hecho por Feng William, Gamero Jonathan, Saénz Rafael

public class Trivia {
		char rp, correc;
		int anad;
		public static char z = 's';
		
		//Métodos que no trabajan con arraylist
		public void Fijar_valor(char resp, char corrc, int añadir)
		{
			rp = resp;
			correc = corrc;
			anad = añadir;
			
		}
		public int RespuestaCyN() {
			int punta=0;
			if (rp == correc){
			System.out.print(" \nRespuesta correcta");
			punta=punta + anad;
			return punta;
			}
			else {
				System.out.print (" \nRespuesta incorrecta "); 
			punta=punta +0;}
			return punta;
		}
		
		
		//Programa principal
		public static void main(String[] args) {

		//variables del programa principal	
		int opc,change, opc_config,puntaj=0;
		int puntaje_correct=0;
		char a='s';
		char opc_config_a = 's',resp,pregunta_game ='s';
		String pregunta_config;
		String respuest_correc;
		String preguntas_posibles[] = new String [4];
		int añadir = 5;
        String [] letras = {"a","b","c","d"}; 
		int entrada=0;
		String nombre;	
			
		
		
		//Crear objetos de clases
		
		Scanner sc = new Scanner (System.in);
		ArrayList<String> coleccion_preg = new ArrayList<String>();	
		ArrayList<String> coleccion_resp = new ArrayList<String>();	
		ArrayList<Integer> coleccion_punt = new ArrayList<Integer>();	
		ArrayList<ArrayList<String> > coleccion_posibles =  
                new ArrayList<ArrayList<String> >(); 
        ArrayList<String> ayuda = new ArrayList<String>(); 
		ArrayList<String> usuarios = new ArrayList<String>();	
		ArrayList<Integer> record = new ArrayList<Integer>();
		ArrayList<Integer> repetir = new ArrayList<Integer>();	

		Trivia tri = new Trivia();
        
		
		//Primer menu
		System.out.println("\n1. Jugar");
		System.out.println("\n2. Salir");
		entrada = sc.nextInt();
		sc.nextLine();
	
		if (entrada == 1) {
		while (z == 's') {
			sc.nextLine();
			System.out.println("Ingrese su nombre");
			nombre = sc.nextLine();
			System.out.println("Bienvenido " + nombre);
			
			//Segundo menu
			a = 's';
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
					System.out.print ("\n      	Configuración     ");
					System.out.print ("\n1.Añadir pregunta     ");
					System.out.print ("\n2.Eliminar pregunta     ");
					System.out.print ("\nPresione cualquier número para salir   \n");
	
					opc_config = sc.nextInt();
					sc.nextLine();
					opc_config_a= 's';
					
					//Menu de la configuracion
					switch (opc_config) {
					case 1:
						
						while (opc_config_a == 's') {
							
							
							System.out.print ("\nIngrese la pregunta: ");
							pregunta_config = sc.nextLine();
							
							System.out.print ("\nIngrese las posibles respuestas: \n"); 
							ayuda = new ArrayList<String>();
							for(int i=0;i<preguntas_posibles.length;i++) {
								System.out.print(letras[i]+")");
								preguntas_posibles[i] = sc.nextLine();
								String b = preguntas_posibles[i];
								ayuda.add(b);
								}
						
							
							System.out.println ("Ingrese la letra de la respuesta correcta: ");
							respuest_correc = sc.nextLine();
							
							System.out.println ("Ingrese el puntaje de la respuesta correcta: ");
							puntaje_correct = sc.nextInt();
							sc.nextLine();
							
							
							coleccion_preg.add(pregunta_config);
							coleccion_posibles.add(ayuda);
							coleccion_resp.add(respuest_correc);
							coleccion_punt.add(puntaje_correct);
							
							
							System.out.println("¿Desea añadir otra pregunta? s/n");
							opc_config_a = sc.next().charAt(0);
							sc.nextLine();
						}
	
	
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
	
	
		
						break;
					//Eliminar preguntas
					case 2:
						char e = 's';
						while (e =='s') {
							System.out.println("Aquí se encuentran sus preguntas");
								if (coleccion_preg.size()>0) {
									for (int i=0; i<coleccion_preg.size();i++) {
										System.out.println((i+1)+".  "+coleccion_preg.get(i));
									}
									System.out.println("¿Desea eliminar alguna? s/n");
									char elim = sc.next().charAt(0);
									if (elim == 's') {
										System.out.println("¿Cuál desea eliminar?");
										int delete = sc.nextInt();
										delete = delete - 1;
										sc.nextLine();
										coleccion_preg.remove(delete);
										coleccion_posibles.remove(delete);
										coleccion_resp.remove(delete);
										coleccion_punt.remove(delete);
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
				case 2:
					puntaj = 0;
					pregunta_game = 's';
					while(pregunta_game=='s') {
						System.out.printf ("\n1. ¿Año en que se descubre America? "); 
						System.out.printf ("\n2. ¿Cual es la cabecera de la provincia de Coclé? "); 
						System.out.printf ("\n3. ¿Cual es raiz cuadrada de 3600? "); 
						System.out.printf ("\n4. Panamá limita al norte con "); 
						System.out.printf ("\n5. ¿Cantidad de Comarcas indigenas que tiene Panamá? "); 
						System.out.printf ("\n6. ¿Cuantos distritos tiene la provincia? "); 
						System.out.printf ("\n7.  Panamá limita con Colombia al"); 
						System.out.printf ("\n8.  El itsmo de Panamá fue visitado por primera vez por  "); 
						System.out.printf ("\n9. ¿Año en que fue fundado la ciudad de Panamá?");
						System.out.printf ("\n10. ¿Fue el primer europeo en division el oceano Pacifico?\n");
						
						//Evalua si exite algun elemento del arreglo
						if (coleccion_preg != null) {
							for (int i=0; i<coleccion_preg.size();i++) 
							System.out.println("1"+(i+1)+".  "+coleccion_preg.get(i));
						}	
	
						
							change = sc.nextInt();
					
						
							
						if (change ==1 & !repetir.contains(1)) { 
							System.out.print ("\n1. ¿Año en que se descubre America? "); 
							System.out.print ("\n a)1492 "); 
							System.out.print ("\n b)1512 "); 
							System.out.print ("\n c)1903 "); 
							System.out.print ("\n d)2016 "); 
							System.out.print ("\n Seleccione la respuesta correcta: \n"); 
							resp=sc.next().charAt(0);
							char corrc = 'a';
							tri.Fijar_valor(resp, corrc, añadir);
							puntaj += tri.RespuestaCyN();
							repetir.add(1);
							System.out.print(" \n¿Desea seguir jugando? s/n");
						    pregunta_game=sc.next().charAt(0);
						    
						}
						else if (change ==2 & !repetir.contains(2)) { 
							
							System.out.print ("\n2. Cúal es la cabecera de la provincia de Coclé?"); 
							System.out.print ("\n a)Aguadulce  "); 
							System.out.print ("\n b)Penonomé  "); 
							System.out.print ("\n c)Anton "); 
							System.out.print ("\n d)Nata "); 
							System.out.print ("\nSeleccione la respuesta correcta: \n"); 
						    resp=sc.next().charAt(0);
							char corrc = 'b';
							tri.Fijar_valor(resp, corrc, añadir);
							puntaj += tri.RespuestaCyN();
							repetir.add(2);
							System.out.print(" \n¿Desea seguir jugando? s/n");
						    pregunta_game=sc.next().charAt(0);
								}
						else if (change ==3 & !repetir.contains(3)) { 
							System.out.print ("\n3. ¿Cual es raiz cuadrada de 3600? "); 
							System.out.print ("\n a)600"); 
							System.out.print ("\n b)6 "); 
							System.out.print ("\n c)60 "); 
							System.out.print ("\n d)6000 "); 
							System.out.print ("\nSeleccione la respuesta correcta: \n"); 
							resp=sc.next().charAt(0);
							char corrc = 'c';
							tri.Fijar_valor(resp, corrc, añadir);
							puntaj += tri.RespuestaCyN();
							repetir.add(3);
							System.out.print(" \n¿Desea seguir jugando? s/n");
						    pregunta_game=sc.next().charAt(0);
							}	
						else if (change ==4 & !repetir.contains(4)) { 
							System.out.print ("\n4. Panamá limita al norte con "); 
							System.out.print ("\n a)Costa Rica "); 
							System.out.print ("\n b)Colombia "); 
							System.out.print ("\n c)Mar Pacifico "); 
							System.out.print ("\n d)Mar Caribe"); 
							System.out.print ("\nSeleccione la respuesta correcta: \n"); 
							resp=sc.next().charAt(0);
							char corrc = 'd';
							repetir.add(4);
							tri.Fijar_valor(resp, corrc, añadir);
							puntaj += tri.RespuestaCyN();
							System.out.print(" \n¿Desea seguir jugando? s/n");
						    pregunta_game=sc.next().charAt(0);
						}
						else if (change ==5& !repetir.contains(5)) { 
							System.out.print ("\n5. ¿Cantidad de Comarcas indigenas que tiene Panamá? "); 
							System.out.print ("\n a)1 "); 
							System.out.print ("\n b)5 "); 
							System.out.print ("\n c)3 "); 
							System.out.print ("\n d)6 "); 
							System.out.print ("\nSeleccione la respuesta correcta: \n"); 
							resp=sc.next().charAt(0);
							char corrc = 'b';
							repetir.add(5);
							tri.Fijar_valor(resp, corrc, añadir);
							puntaj += tri.RespuestaCyN();
							System.out.print(" \n¿Desea seguir jugando? s/n");
						    pregunta_game=sc.next().charAt(0);
							}	
						else if (change ==6 & !repetir.contains(6)) { 
							System.out.print ("\n ¿Cuantos distritos tiene la provincia? "); 
							System.out.print ("\n a)78 "); 
							System.out.print ("\n b)58 "); 
							System.out.print ("\n c)68"); 
							System.out.print ("\n d)48 "); 
							System.out.print ("\nSeleccione la respuesta correcta: \n"); 
							resp=sc.next().charAt(0);
							char corrc = 'a';
							tri.Fijar_valor(resp, corrc, añadir);
							puntaj += tri.RespuestaCyN();
							repetir.add(6);
							System.out.print(" \n¿Desea seguir jugando? s/n");
						    pregunta_game=sc.next().charAt(0);
							}
						else if (change ==7 & !repetir.contains(7)) { 
							System.out.print ("\n7.  Panamá limita con Colombia al"); 
							System.out.print ("\n a)Norte"); 
							System.out.print ("\n b)Sur"); 
							System.out.print ("\n c)Este"); 
							System.out.print ("\n d)Oeste"); 
							System.out.print ("\nSeleccione la respuesta correcta: \n"); 
							resp=sc.next().charAt(0);
							char corrc = 'c';
							tri.Fijar_valor(resp, corrc, añadir);
							puntaj += tri.RespuestaCyN();
							repetir.add(7);
							System.out.print(" \n¿Desea seguir jugando? s/n");
						    pregunta_game=sc.next().charAt(0);
							}
						else if (change ==8 & !repetir.contains(8)) { 
							System.out.print ("\n8.  El itsmo de Panamá fue visitado por primera vez por  "); 
							System.out.print ("\n a)Vasco Núñez de Balboa"); 
							System.out.print ("\n b)Rodrigo de Bastidas  "); 
							System.out.print ("\n c)Diego de Nicuesa  "); 
							System.out.print ("\n d)Cristobal Colón  "); 
							System.out.print ("\nSeleccione la respuesta correcta: \n"); 
							resp=sc.next().charAt(0);
							char corrc = 'b';
							tri.Fijar_valor(resp, corrc, añadir);
							puntaj += tri.RespuestaCyN();
							repetir.add(8);
							System.out.print(" \n¿Desea seguir jugando? s/n");
						    pregunta_game=sc.next().charAt(0);
						
							}
						else if (change ==9 & !repetir.contains(9)) { 
							System.out.print("\n9. ¿Año en que fue fundado la ciudad de Panamá?");
							System.out.print("\n a)1519");
							System.out.print("\n b)1529");
							System.out.print("\n c)1512");
							System.out.print("\n d)1509");
							System.out.print ("\nSeleccione la respuesta correcta: \n"); 
							resp=sc.next().charAt(0);
							char corrc = 'a';
							tri.Fijar_valor(resp, corrc, añadir);
							puntaj += tri.RespuestaCyN();
							repetir.add(9);
							System.out.print(" \n¿Desea seguir jugando? s/n");
						    pregunta_game=sc.next().charAt(0);
							}
						
						else if (change ==10 & !repetir.contains(10)) { 
							System.out.print("\n10. ¿Fue el primer europeo en division el oceano Pacifico?");
							System.out.print("\n a)Cristobal Colón");
							System.out.print("\n b)Vasco Núñez de Balboa ");
							System.out.print("\n c)Rodrigo de Bastidas");
							System.out.print("\n d)Diego de Nicueza");
							System.out.print ("\nSeleccione la respuesta correcta: \n"); 
							resp=sc.next().charAt(0);
							char corrc = 'b';
							tri.Fijar_valor(resp, corrc, añadir);
							puntaj += tri.RespuestaCyN();
							repetir.add(10);
							System.out.print(" \n¿Desea seguir jugando? s/n");
						    pregunta_game=sc.next().charAt(0);
							}
						//Aqui se trabajan los arraylist
						else if (change >10 & change<=coleccion_preg.size()+10 & coleccion_preg.size()>=1)
						{
							for (int i = 0; i<coleccion_preg.size();i++) {
								if (change ==11+i & !repetir.contains(11+i)) {
									System.out.println(coleccion_preg.get(i));
									repetir.add(11+i);
									for (int j = 0; j<4; j++) {
										System.out.println(letras[j] +")"+coleccion_posibles.get(i).get(j));
									}
									
									System.out.print ("\nSeleccione la respuesta correcta: \n"); 
									resp=sc.next().charAt(0);
									String b = coleccion_resp.get(i);
									char corrc = b.charAt(0);
									tri.Fijar_valor(resp, corrc, coleccion_punt.get(i));
									puntaj += tri.RespuestaCyN();
									
									System.out.print(" \n¿Desea seguir jugando? s/n");
								    pregunta_game=sc.next().charAt(0);
									
								}
							
							}
						}
						
						
						else {
						System.out.println("Numero incorrecto o pregunta repetida.");
						}
					
					
					}
					
					System.out.println("Su puntaje fue de " + puntaj);
					//Añade los elementos al arreglo repetir para que no repitan las preguntas
					record.add(puntaj);
					usuarios.add(nombre);
					repetir.clear();
					break;
				//Record de los juegos
				case 3:
					if (usuarios.size()>0) {
						System.out.println("Usuarios" + "    "+ "Record");
						for (int i=0; i<usuarios.size(); i++) {
							System.out.println(usuarios.get(i) + "    " + record.get(i));
						}
					}
					else {
						System.out.println("No hay registro.");
					}
					break;
				}
				//Menu para salir
				if (opc == 4) {
					System.out.println("¿Quieres salir a trivia o salir definitivamente? t/v ");
					char salir = sc.next().charAt(0);
					
					if (salir == 't') {
						a = 'n';
					}
					
					else if (salir == 'v') {
						System.out.println("Gracias por usar el programa.");
						System.exit(0);
					}
					else {
						System.out.println("Otro código.");
					}
				}
				
			
			}
		}
		}
		else if (entrada == 2) {
			System.out.println("Gracias por usar el programa.");
			System.exit(0);
		}
		
		else {
			System.out.println("Código incorrecto");
			System.exit(0);
		}
		}
	}

