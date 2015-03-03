package com.zubiri.multiteca;
import java.util.*;

public final class Main {

	public static void main(String[] args) {
		int aukera = -1;
		Scanner sc = new Scanner(System.in);
		Multiteca multiteca = null;
		do {
			try{
				//Visualiza por terminal (stdout) las opciones del menú
				System.out.println("Insertar obras-----------------------------------1");
				System.out.println("Mostrar obras------------------------------------2");
				System.out.println("SALIR--------------------------------------------0");
				   
				aukera = sc.nextInt();
				switch (aukera) {
					case 1: //Solicitar productos
						multiteca = new Multiteca(sc);
						break;
					case 2: //Mostrar productos
						if (multiteca == null) {
							System.out.println("No es posible mostrar obras sin haber sido insertadas");
						}
						multiteca.mostrarMultiteca();
						break;
					case 0: //Salimos
						break;
					default:
						System.out.println("No ha insertado la opción correcta");
				}
			}catch(InputMismatchException e){
				System.out.println("Eso no es un número ");
				sc.nextLine();
			} finally {
				System.out.println("¡Gracias por haber utilizado el programa!");
			}
			
		} while (aukera != 0);
		sc.close();

		

	}

}
