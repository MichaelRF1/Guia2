package com.senati.eti;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese numero 1...: ");
		int n1 = sc.nextInt();
		
		System.out.print("Ingrese numero 2...: ");
		int n2 = sc.nextInt();
		
		String estado = "";
		
		if (n1 == n2)
			estado = "Los numero son iguales";
		else if (n1 > n2)
			estado = "El primer numero es mayor.";
		else
			estado = "El segundo numero es mayor";
		
		System.out.println("\n======= Resultados =======");
		System.out.println("Estado...: " + estado);

	}

}
