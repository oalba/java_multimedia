package com.zubiri.multiteca;

import java.util.*;

public abstract class Obra {
	
	private String titulo;
	private Artista autor;
	private int añoEdicion;
	//Artista artista = new Artista();

	//public Obra(){

	//}
	
	public Obra(String titulo, Artista autor, int añoEdicion) {
	
		this.titulo = titulo;
		this.autor = autor;
		this.añoEdicion = añoEdicion;
	}

	public Obra(Scanner sc) {
		System.out.println("Título de la obra:");
		this.setTitulo(sc.next());
		System.out.println("Nombre del autor:");
		Artista.setNombre(sc.next());
		System.out.println("Año de nacimiento del autor:");
		Artista.setAñoNacimiento(sc.nextInt());
		System.out.println("Año de edición de la obra:");
		this.setAñoEdicion(sc.nextInt());
	}
	
	public Artista getAutor() {
		
		return autor;
	}

	public void setAutor(Artista autor) {
		
		this.autor = autor;
	}

	public int getAñoEdicion() {
		
		return añoEdicion;
	}

	public void setAñoEdicion(int añoEdicion) {
		
		this.añoEdicion = añoEdicion;
	}

	public String getTitulo() {
		
		return titulo;
	}
	public void setTitulo(String titulo) {
		
		this.titulo = titulo;
	}
	
	/*public String formattedObra() {
		
	}*/
	public void mostrarObra(){
		//Artista artista = new Artista();
		System.out.println("\tTítulo: " + this.getTitulo());
		System.out.println("\tNombre del autor: " + Artista.getNombre());
		System.out.println("\tAño de nacimiento del artista: " + Artista.getAñoNacimiento());
		System.out.println("\tAño de edición: " + this.getAñoEdicion());
	}
}