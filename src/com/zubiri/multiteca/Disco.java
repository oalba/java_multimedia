package com.zubiri.multiteca;

import java.util.*;

public class Disco extends Obra{
	
	private String discografia;
	private int nCanciones;
	
	public Disco(String titulo, Artista autor, int añoEdicion, String discografia, int nCanciones) {
		super(titulo, autor, añoEdicion);
		this.discografia = discografia;
		this.nCanciones = nCanciones;		
	}
	public Disco(Scanner sc){
		super(sc);
		//Añade el resto de datos
		System.out.println("Discografía del disco: ");
		this.setDiscografia(sc.next());
		System.out.println("Número de canciones del disco: ");
		this.setnCanciones(sc.nextInt());
	}
	
	public String getDiscografia() {
		
		return discografia;
	}
	
	public void setDiscografia(String discografia) {
		
		this.discografia = discografia;
	}
	
	public int getnCanciones() {
		
		return nCanciones;
	}
	
	public void setnCanciones(int nCanciones) {
		
		this.nCanciones = nCanciones;
	}

	
	/*public String formattedObra() {
		
	}*/
	@Override
	public void mostrarObra(){
		System.out.println("DISCO:");
		super.mostrarObra();
		System.out.println("\tDiscografía: " + this.getDiscografia());
		System.out.println("\tNúmero de canciones: " + this.getnCanciones());
	}
}
