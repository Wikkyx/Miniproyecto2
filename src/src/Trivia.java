package src;

import java.util.Scanner;

public class Trivia {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc;
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
		}
	     
		


		
	
	
	
	
	}
}

}