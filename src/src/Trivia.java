package src;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;






//Falta crear métodos y que no se repita la misma pregunta.






















public class Trivia {
	
		public static char z = 's';
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc,change, opc_config,puntaj=0;
		int puntaje_correct=0;
		String cod;
		char a='s';
		char opc_config_a = 's',resp,pregunta_game ='s';
		String pregunta_config;
		String respuest_correc;
		String preguntas_posibles[] = new String [4];
		
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
        String [] letras = {"a","b","c","d"}; 
		ArrayList<String> usuarios = new ArrayList<String>();	
		ArrayList<Integer> record = new ArrayList<Integer>();
		Trivia tri = new Trivia();



		
		//Falta pedirle el nombre al usuario
		//Bienvenido
		//Jugar o salir
		
		//Segundo menu
        
		
	
		System.out.println("\n1. Jugar");
		System.out.println("\n2. Salir");
		entrada = sc.nextInt();
		sc.nextLine();
	
		if (entrada == 1) {
		while (z == 's') {
			sc.nextLine();
			System.out.println("Ingrese su nombre");
			nombre = sc.nextLine();
			System.out.println("Bienvienido " + nombre);
			
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
					switch (opc_config) {
					
					case 1:
						
						while (opc_config_a == 's') {
							
							
							System.out.print ("\nIngrese la pregunta: ");
							pregunta_config = sc.nextLine();
							
							System.out.print ("\nIngrese las posibles respuestas: \n"); 
							ayuda = new ArrayList<String>();
							for(int i=0;i<preguntas_posibles.length;i++) {
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
				//Área de mensajes:
					//Pregunta correcta o incorrecta
					//Desea seguir jugando
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
						if (coleccion_preg != null) {
							for (int i=0; i<coleccion_preg.size();i++) 
							System.out.println("1"+(i+1)+".  "+coleccion_preg.get(i));
						}	
	
						
							change = sc.nextInt();
					
						
							
						if (change ==1) { 
							System.out.print ("\n1. ¿Año en que se descubre America? "); 
							System.out.print ("\n a)1492 "); 
							System.out.print ("\n b)1512 "); 
							System.out.print ("\n c)1903 "); 
							System.out.print ("\n d)2016 "); 
							System.out.print ("\n Seleccione la respuesta correcta: \n"); 
							resp=sc.next().charAt(0);
						     	if (resp=='a'){
							System.out.print(" \nRespuesta correcta");
							puntaj=puntaj + 5;}
							else {
								System.out.print (" \nRespuesta incorrecta "); 
							puntaj=puntaj +0;}
								System.out.print(" \n¿Desea seguir jugando? s/n");
						     	pregunta_game=sc.next().charAt(0);
						}
						else if (change ==2) { 
							
							System.out.print ("\n2. Cúal es la cabecera de la provincia de Coclé?"); 
							System.out.print ("\n a)Aguadulce  "); 
							System.out.print ("\n b)Penonomé  "); 
							System.out.print ("\n c)Anton "); 
							System.out.print ("\n d)Nata "); 
							System.out.print ("\nSeleccione la respuesta correcta: \n"); 
						    resp=sc.next().charAt(0);
						    if (resp=='b'){
								System.out.print(" \nRespuesta correcta");
								puntaj=puntaj + 5;}
								else {
									System.out.print (" \nRespuesta incorrecta "); 
								puntaj=puntaj +0;
								}	
							System.out.print(" \n¿Desea seguir jugando? s/n");
						     	pregunta_game=sc.next().charAt(0);
								}
						else if (change ==3) { 
							System.out.print ("\n3. ¿Cual es raiz cuadrada de 3600? "); 
							System.out.print ("\n a)600"); 
							System.out.print ("\n b)6 "); 
							System.out.print ("\n c)60 "); 
							System.out.print ("\n d)6000 "); 
							System.out.print ("\nSeleccione la respuesta correcta: \n"); 
							resp=sc.next().charAt(0);
							if (resp=='c'){
								System.out.print(" \nRespuesta correcta");
								puntaj=puntaj + 5;}
								else {
									System.out.print (" \nRespuesta incorrecta "); 
								puntaj=puntaj +0;}
							System.out.print(" \n¿Desea seguir jugando? s/n");
					     	pregunta_game=sc.next().charAt(0);
							}	
						else if (change ==4) { 
							System.out.print ("\n4. Panamá limita al norte con "); 
							System.out.print ("\n a)Costa Rica "); 
							System.out.print ("\n b)Colombia "); 
							System.out.print ("\n c)Mar Pacifico "); 
							System.out.print ("\n d)Mar Caribe"); 
							System.out.print ("\nSeleccione la respuesta correcta: \n"); 
							resp=sc.next().charAt(0);
							if (resp=='d'){
								System.out.print(" \nRespuesta correcta");
								puntaj=puntaj + 5;}
								else {
									System.out.print (" \nRespuesta incorrecta "); 
								puntaj=puntaj +0;}
							System.out.print(" \n¿Desea seguir jugando? s/n");
					     	pregunta_game=sc.next().charAt(0);
						}
						else if (change ==5) { 
							System.out.print ("\n5. ¿Cantidad de Comarcas indigenas que tiene Panamá? "); 
							System.out.print ("\n a)1 "); 
							System.out.print ("\n b)5 "); 
							System.out.print ("\n c)3 "); 
							System.out.print ("\n d)6 "); 
							System.out.print ("\nSeleccione la respuesta correcta: \n"); 
							resp=sc.next().charAt(0);
							if (resp=='b'){
								System.out.print(" \nRespuesta correcta");
								puntaj=puntaj + 5;}
								else {
									System.out.print (" \nRespuesta incorrecta "); 
								puntaj=puntaj +0;}
							System.out.print(" \n¿Desea seguir jugando? s/n");
					     	pregunta_game=sc.next().charAt(0);
							}	
						else if (change ==6) { 
							System.out.print ("\n ¿Cuantos distritos tiene la provincia? "); 
							System.out.print ("\n a)78 "); 
							System.out.print ("\n b)58 "); 
							System.out.print ("\n c)68"); 
							System.out.print ("\n d)48 "); 
							System.out.print ("\nSeleccione la respuesta correcta: \n"); 
							resp=sc.next().charAt(0);
							if (resp=='a'){
								System.out.print(" \nRespuesta correcta");
								puntaj=puntaj + 5;}
								else {
									System.out.print (" \nRespuesta incorrecta "); 
								puntaj=puntaj +0;
								}
							System.out.print(" \n¿Desea seguir jugando? s/n");
					     	pregunta_game=sc.next().charAt(0);
							}
						else if (change ==7) { 
							System.out.print ("\n7.  Panamá limita con Colombia al"); 
							System.out.print ("\n a)Norte"); 
							System.out.print ("\n b)Sur"); 
							System.out.print ("\n c)Este"); 
							System.out.print ("\n d)Oeste"); 
							System.out.print ("\nSeleccione la respuesta correcta: \n"); 
							resp=sc.next().charAt(0);
							if (resp=='c'){
								System.out.print(" \nRespuesta correcta");
								puntaj=puntaj + 5;}
								else {
									System.out.print (" \nRespuesta incorrecta "); 
								puntaj=puntaj +0;}
							System.out.print(" \n¿Desea seguir jugando? s/n");
					     	pregunta_game=sc.next().charAt(0);
							}
						else if (change ==8) { 
							System.out.print ("\n8.  El itsmo de Panamá fue visitado por primera vez por  "); 
							System.out.print ("\n a)Vasco Núñez de Balboa"); 
							System.out.print ("\n b)Rodrigo de Bastidas  "); 
							System.out.print ("\n c)Diego de Nicuesa  "); 
							System.out.print ("\n d)Cristobal Colón  "); 
							System.out.print ("\nSeleccione la respuesta correcta: \n"); 
							resp=sc.next().charAt(0);
							if (resp=='b'){
								System.out.print(" \nRespuesta correcta");
								puntaj=puntaj + 5;}
								else {
									System.out.print (" \nRespuesta incorrecta "); 
								puntaj=puntaj +0;}
							System.out.print(" \n¿Desea seguir jugando? s/n");
					     	pregunta_game=sc.next().charAt(0);
						
							}
						else if (change ==9) { 
							System.out.print("\n9. ¿Año en que fue fundado la ciudad de Panamá?");
							System.out.print("\n a)1519");
							System.out.print("\n b)1529");
							System.out.print("\n c)1512");
							System.out.print("\n d)1509");
							System.out.print ("\nSeleccione la respuesta correcta: \n"); 
							resp=sc.next().charAt(0);
							if (resp=='a'){
								System.out.print(" \nRespuesta correcta");
								puntaj=puntaj + 5;}
								else {
									System.out.print (" \nRespuesta incorrecta "); 
								puntaj=puntaj +0;}
							System.out.print(" \n¿Desea seguir jugando? s/n");
					     	pregunta_game=sc.next().charAt(0);
							}
						
						else if (change ==10) { 
							System.out.print("\n10. ¿Fue el primer europeo en division el oceano Pacifico?");
							System.out.print("\n a)Cristobal Colón");
							System.out.print("\n b)Vasco Núñez de Balboa ");
							System.out.print("\n c)Rodrigo de Bastidas");
							System.out.print("\n d)Diego de Nicueza");
							System.out.print ("\nSeleccione la respuesta correcta: \n"); 
							resp=sc.next().charAt(0);
							if (resp=='b'){
								System.out.print(" \nRespuesta correcta");
								puntaj=puntaj + 5;}
								else {
								System.out.print (" \nRespuesta incorrecta "); 
								puntaj=puntaj +0;}
							System.out.print(" \n¿Desea seguir jugando? s/n");
					     	pregunta_game=sc.next().charAt(0);
							}
							
					else if (change == 11 & coleccion_preg.size()>=1) {
						System.out.println(coleccion_preg.get(0));
						for (int i=0; i<4; i++) {
							System.out.println(letras[i]+") "+coleccion_posibles.get(0).get(i));
						}
						String correcta = coleccion_resp.get(0);
						char corrc = correcta.charAt(0);
						System.out.print ("\nSeleccione la respuesta correcta: \n"); 
						resp=sc.next().charAt(0);
						if (resp == corrc){
							System.out.print(" \nRespuesta correcta");
							puntaj=puntaj + coleccion_punt.get(0);}
							else {
							System.out.print (" \nRespuesta incorrecta "); 
							puntaj=puntaj +0;}
						System.out.print(" \n¿Desea seguir jugando? s/n");
				     	pregunta_game=sc.next().charAt(0);
						
						
					}
					
					else if (change == 12 & coleccion_preg.size()>=2) {
						System.out.println(coleccion_preg.get(1));
						for (int i=0; i<4; i++) {
							System.out.println(letras[i]+") "+coleccion_posibles.get(1).get(i));
						}
						String correcta = coleccion_resp.get(1);
						char corrc = correcta.charAt(0);
						System.out.print ("\nSeleccione la respuesta correcta: \n"); 
						resp=sc.next().charAt(0);
						if (resp == corrc){
							System.out.print(" \nRespuesta correcta");
							puntaj=puntaj + coleccion_punt.get(1);}
							else {
							System.out.print (" \nRespuesta incorrecta "); 
							puntaj=puntaj +0;}
						System.out.print(" \n¿Desea seguir jugando? s/n");
				     	pregunta_game=sc.next().charAt(0);
					}
					
					else if (change == 13 & coleccion_preg.size()>=3) {
						System.out.println(coleccion_preg.get(2));
						for (int i=0; i<4; i++) {
							System.out.println(letras[i]+") "+coleccion_posibles.get(2).get(i));
						}
						String correcta = coleccion_resp.get(2);
						char corrc = correcta.charAt(0);
						System.out.print ("\nSeleccione la respuesta correcta: \n"); 
						resp=sc.next().charAt(0);
						if (resp == corrc){
							System.out.print(" \nRespuesta correcta");
							puntaj=puntaj + coleccion_punt.get(2);}
							else {
							System.out.print (" \nRespuesta incorrecta "); 
							puntaj=puntaj +0;}
						System.out.print(" \n¿Desea seguir jugando? s/n");
				     	pregunta_game=sc.next().charAt(0);
					}
					
					else if (change == 14 & coleccion_preg.size()>=4) {
						System.out.println(coleccion_preg.get(3));
						for (int i=0; i<4; i++) {
							System.out.println(letras[i]+") "+coleccion_posibles.get(3).get(i));
						}
						String correcta = coleccion_resp.get(3);
						char corrc = correcta.charAt(0);
						System.out.print ("\nSeleccione la respuesta correcta: \n"); 
						resp=sc.next().charAt(0);
						if (resp == corrc){
							System.out.print(" \nRespuesta correcta");
							puntaj=puntaj + coleccion_punt.get(3);}
							else {
							System.out.print (" \nRespuesta incorrecta "); 
							puntaj=puntaj +0;}
						System.out.print(" \n¿Desea seguir jugando? s/n");
				     	pregunta_game=sc.next().charAt(0);
					}
					
					else if (change == 15 & coleccion_preg.size()>=5) {
						System.out.println(coleccion_preg.get(4));
						for (int i=0; i<4; i++) {
							System.out.println(letras[i]+") "+coleccion_posibles.get(4).get(i));
						}
						String correcta = coleccion_resp.get(4);
						char corrc = correcta.charAt(0);
						System.out.print ("\nSeleccione la respuesta correcta: \n"); 
						resp=sc.next().charAt(0);
						if (resp == corrc){
							System.out.print(" \nRespuesta correcta");
							puntaj=puntaj + coleccion_punt.get(4);}
							else {
							System.out.print (" \nRespuesta incorrecta "); 
							puntaj=puntaj +0;}
						System.out.print(" \nDesea seguir jugando s/n");
				     	pregunta_game=sc.next().charAt(0);
					}
					
						
					else {
						System.out.println("Numero incorrecto.");
						break;
						}
					}
					
					
					System.out.println("Su puntaje fue de " + puntaj);
					record.add(puntaj);
					usuarios.add(nombre);
					break;
					
					
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
				if (opc == 4) {
					System.out.println("¿Quieres salir a trivia o salir definitivamente? t/v ");
					char salir = sc.next().charAt(0);
					
					if (salir == 't') {
						a = 'n';
					}
					
					else if (salir == 'v') {
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
			System.exit(0);
		}
		
		else {
			System.out.println("Código incorrecto");
			System.exit(0);
		}
		}
	}

