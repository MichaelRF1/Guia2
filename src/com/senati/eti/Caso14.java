package com.senati.eti;

import java.text.DecimalFormat;

import java.util.Scanner;


public class Caso14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese alumno: ");
		String nombre = sc.nextLine();
		
		System.out.print("Carrera [DS/RC/DG]: ");
		String carrera = sc.nextLine();
		
		System.out.print("Turno [M/T/N]: ");
		String turno = sc.nextLine();
		
		String ncarrera = "";
		String nturno = "";
		float monto = 0;
		float dscto = 0;
		
		switch(carrera) {
		
		    case "DS":
		        ncarrera = "Desarrollo de Software";
		        monto = 1500;
		        break;
		    case "RC":
		        ncarrera = "Redes y Conectividad";
		        monto = 1400;
		        break;
		    case "DG":
		        ncarrera = "Diseño Gráfico";
		        monto = 1300;
		        break;
		 default:
		        ncarrera = "Carrera no reconocida";
		}
		switch (turno) {
		    case "M":
		        nturno = "Mañana";
		        dscto = 0.1f;
		        break;	
		    case "T":
		        nturno = "Tarde";
		        dscto = 0.2f;
		        break;
		    case "N":
		        nturno = "Noche";
		        dscto = 0.15f;
		        break;
		    default:
		        nturno = "Turno no conocido";
		}
		float tot_pag = monto - (monto * dscto);
		float pag_dol = tot_pag / 3.33f;
		
		System.out.println("\n========== RESULTADOS==========");
		System.out.println("Alumno............: " + nombre);
		System.out.println("Carrera...........: " + ncarrera);
		System.out.println("Turno.............: " + nturno);
		System.out.println("Descuento.........: " + dscto * 100 + " %");
		System.out.println("Total a Pagar.....: " + "S/. " + df.format(tot_pag));
		System.out.println("Total a Pagar($)..: " + "$ " + df.format(pag_dol));
					
		}

	}