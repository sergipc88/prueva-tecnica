package prueva;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {

	
	public static void main(String[] args) {
		
		int numero ;
		Scanner sc;
		String binarioString;
		char[] binarioArray;
		int gruposDeCeros;
		
		sc = new Scanner(System.in);
		System.out.println("introduce un numero:");
		numero = sc.nextInt();
		binarioString = Ejercicio2.obtenerBinario(numero);
		sc.close();		
		
		binarioArray = binarioString.toCharArray();
		gruposDeCeros = 0;
		
		for (int i = 0; i < binarioArray.length; i++) {
			
		}
		
		System.out.println("parar!!!");
		

	}
	
	
	public static String obtenerBinario(int numero) {
		String numeroBinario = "";
		List<String> binario = new ArrayList<String>();
		int resto;
		
		for (int i = numero; numero >= 2;) {
			resto = numero%2;
			numero = numero/2;
			binario.add(0, Integer.toString(resto));
			i = numero;
		}
		
		if(numero == 2) {		
		numero = numero/2;		
		}		
		binario.add(0, Integer.toString(numero));
		
		for(int i = 0; i< binario.size(); i++) {
			numeroBinario += binario.get(i);
		}
		return numeroBinario;				
	}

}
