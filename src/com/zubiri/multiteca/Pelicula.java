package com.zubiri.multiteca;

//import java.util.ArrayList;
import java.util.*;

public class Pelicula extends Obra{

	private String productora;
	//private ArrayList<Artista> interpretes;
	
	public Pelicula(String titulo, Artista autor, int añoEdicion, String productora) {
	//public Pelicula(String titulo, Artista autor, int añoEdicion, String productora, ArrayList<Artista> interpretes) {
		super(titulo, autor, añoEdicion);
		this.productora = productora;
		//this.interpretes = interpretes;		
	}
	public Pelicula(Scanner sc){
		super(sc);
		//Añade el resto de datos
		System.out.println("Productora: ");
		this.setProductora(sc.next());
	}
		
	public String getProductora() {
		
		return productora;
	}
	
	public void setProductora(String productora) {
		
		this.productora = productora;
	}
	
	/*public ArrayList<Artista> getInterpretes() {
		
		return interpretes;
	}
	
	public void setInterpretes(ArrayList<Artista> interpretes) {
		
		this.interpretes = interpretes;
	}*/
	
	/*public String formattedObra() {
		
	}*/
	@Override
	public void mostrarObra(){
		System.out.println("PELÍCULA:");
		super.mostrarObra();
		System.out.println("\tProductora: " + this.getProductora());
		//System.out.println("\tIntérpretes: " + this.getInterpretes());
	}

}
