package com.senati.eti;

import java.util.Scanner;

import java.text.DecimalFormat;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Nombre del empleado.............: ");
		String nombre = sc.nextLine();
		
		System.out.print("Horas Trabajadas................: ");
		float ht = sc.nextFloat();
		
		System.out.print("Tarifa por hora................: ");
		float th = sc.nextFloat();
		
		System.out.print("Minutos de tardanza............: ");
		float mt = sc.nextFloat();
		
		float importe = ht * th;
		float bono = 0;
		
		if( ht >= 60.00)
			bono = 0.13f * importe;
		else
			bono = (float) (0.04 * importe);
		
		float dscto = 0;
		
		if (mt >= 15.00)
			dscto = (float) (importe * 0.03);
		else
			dscto = (float) 0.00;
		
		float meta = (ht * 100) / 70;
		
		
		System.out.println("\n=========== Resultados ==========");
		System.out.println(" Trabajador..............: " + nombre);
		System.out.println(" Horas trabajadas........: " + ht);
		System.out.println(" Tarifa por hora.........: " + th);
		System.out.println(" Importe.................: " + importe);
		System.out.println(" Bono....................: " + bono);
		System.out.println(" Descuento...............: " + dscto);
		System.out.println(" Meta alcanzada..........: " + meta);

		
	}

}