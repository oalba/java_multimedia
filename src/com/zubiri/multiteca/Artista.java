package com.zubiri.multiteca;

public class Artista {

	private static String nombre;
	private static int añoNacimiento;
	
	public Artista(){
		
	}
	public Artista(String nombr, int añoNacimient) {
	
		nombre = nombr;
		añoNacimiento = añoNacimient;
	}
	
	public static String getNombre() {
		
		return nombre;
	}
	
	public static void setNombre(String nombr) {
		
		nombre = nombr;
	}
	
	public static int getAñoNacimiento() {
		
		return añoNacimiento;
	}

	public static void setAñoNacimiento(int añoNacimient) {
		
		añoNacimiento = añoNacimient;
	}
	
}
