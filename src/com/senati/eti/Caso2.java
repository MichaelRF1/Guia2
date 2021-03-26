package com.senati.eti;

import java.util.Scanner;

public class Caso1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese numero...: ");
		int n = sc.nextInt();
		
		String mensaje = "Numero es par";
		
		if (n % 2 != 0)
			mensaje = "Numero es par";
		
		System.out.println("\n======= Resultados =======");
		System.out.println("Mensaje...: " + mensaje);

	}

}
