package com.zubiri.multiteca;

import java.util.*;

public final class Multiteca {
	
	private static ArrayList<Obra> multiteca = new ArrayList<Obra>();
	//private static ArrayList<Disco> disco = new ArrayList<Disco>();
	//private static ArrayList<Libro> libro = new ArrayList<Libro>();
	//private static ArrayList<Pelicula> pelicula = new ArrayList<Pelicula>();
	//private static int numObras = 0;

	public Multiteca(Scanner sc) {
		int cant = -1;
		do{
			try{
				System.out.println("Cuantas obras quieres insertar? ");
				cant = sc.nextInt();
			}catch(InputMismatchException e){
				System.out.println("Eso no es un número");
				sc.nextLine();
			}
			System.out.println(cant);
		}while(cant < 0);
		for (int i = 0; i < cant; i++) {
			
			System.out.println("¿Qué obra quieres insertar?");
			System.out.println("Disco:--------1");
			System.out.println("Libro:----------2");
			System.out.println("Pelicula:--------3");
		    
			switch(sc.nextInt()) {
				case 1:
					Disco disco = new Disco(sc);
					multiteca.add(disco);
					break;
				case 2:
					Libro libro = new Libro(sc);
					multiteca.add(libro);
					break;
				case 3:
					Pelicula pelicula = new Pelicula(sc);
					multiteca.add(pelicula);
					break;
				default:
					System.out.println("No ha insertado la opción correcta.");
					break;
			}			
		}
		
	}

	/*public Multiteca(ArrayList<Obra> obras) {
		
	}
	
	public void setMultiteca(ArrayList<Obra> obras) {
		
	}
	
	public ArrayList<Obra> getMultiteca() {
		
	}
	
	public void addObra(Obra obra) {
		
	}
	
	public Obra obtainObra(int index) {
		
	}
	
	public static counter() {
		
	}
	
	public String formattedMultiteca() {
		
	}*/
	
}
