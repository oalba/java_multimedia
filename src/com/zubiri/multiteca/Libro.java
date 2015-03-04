package com.zubiri.multiteca;
import java.util.*;
import java.io.*;

public class Libro extends Obra{
	
	private String editorial;
	private int numPaginas;

	Artista artista = new Artista();
	
	public Libro(String titulo, Artista autor, int añoEdicion, String editorial, int numPaginas) {
		super(titulo, autor, añoEdicion);
		this.editorial = editorial;
		this.numPaginas = numPaginas;
		
	}
	public Libro(Scanner sc){
		super(sc);
		//Añade el resto de datos
		System.out.println("Editorial del libro: ");
		this.setEditorial(sc.next());
		System.out.println("Número de páginas del libro: ");
		this.setNumPaginas(sc.nextInt());
		try {
		FileWriter fw = new FileWriter("/home/zubiri/AriketakJava/java_multimedia/src/com/zubiri/multiteca/obras.txt", true);
        fw.write("2," 
        	+ getTitulo() + "," 
        	+ artista.getNombre() + "," 
        	+ artista.getAñoNacimiento() + "," 
        	+ getAñoEdicion() + "," 
        	+ this.getEditorial() + "," 
        	+ this.getNumPaginas() + "\n");
        fw.close(); 
		}catch(IOException e){
            System.out.println("Error E/S: "+e);
        }
	}
	
	public String getEditorial() {
		
		return editorial;
	}
	
	public void setEditorial(String editorial) {
		
		this.editorial = editorial;
	}
	
	public int getNumPaginas() {
		
		return numPaginas;
	}
	
	public void setNumPaginas(int numPaginas) {
		
		this.numPaginas = numPaginas;
	}
	
	/*public String formattedObra() {
		
	}*/
	@Override
	public void mostrarObra(){
		System.out.println("LIBRO:");
		super.mostrarObra();
		System.out.println("\tEditorial: " + this.getEditorial());
		System.out.println("\tNúmero de páginas: " + this.getNumPaginas());
	}

}
