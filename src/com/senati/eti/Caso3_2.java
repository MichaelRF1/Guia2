package com.senati.eti;

import java.util.Scanner;

public class Caso3_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese n�mero 1.....: ");
		int n1 = sc.nextInt();
		
		System.out.print("Ingrese n�mero 2.....: ");
		int n2 = sc.nextInt();
		
		System.out.print("Ingrese n�mero 3.....: ");
		int n3 = sc.nextInt();
		
		String estado = "";
		
		if(n1 == n2  && n1 == n3)
			estado = "Los n�meros son iguales";
		else if (n1 > n2 && n1 > n3)
			estado = "El primero n�mero " + n1 + " es mayor.";
		else if (n2 > n1 && n2 > n3)
			estado = "El segundo n�mero " + n2 + " es mayor.";
		else
			estado = "El tercer n�mero " + n3 +  " Es mayor";
		
		System.out.println("\n=========== Resultados ==========");
		System.out.println("Estado...: " + estado);
	}

}