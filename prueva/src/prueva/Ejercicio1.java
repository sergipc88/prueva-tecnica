package prueva;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
	
	static int sumaDeLosFactores;
	public static void main(String[] args) {
		int x;		
		List<Integer>factores = new ArrayList<>();
		Scanner sc;
		
		sc = new Scanner(System.in);
		x = sc.nextInt();
		sc.close();
		sumaDeLosFactores = 0;
		
		for (int i = 1; i <= x; i++) {		
			if(x%i==0) {factores.add(i);}
		}

		factores.forEach(factor -> {sumaDeLosFactores = sumaDeLosFactores + factor;});
		
		System.out.println("la suma de los factores es: " + sumaDeLosFactores);
		
	}

}
