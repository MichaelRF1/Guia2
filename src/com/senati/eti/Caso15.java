package com.senati.eti;

import java.text.DecimalFormat;

import java.util.Scanner;

public class Caso15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese cliente: ");
		String cliente = sc.nextLine();
		
		System.out.print("Ingrese producto [TB/LT/MN/IM]: ");
		String producto = sc.nextLine();
		
		System.out.print("Ingrese forma de pago [C1/C2]: ");
		String fopag = sc.nextLine();
		
		System.out.print("Ingrese cantidad: ");
		int cant = sc.nextInt();
		
		String npro = "";
		String nforpa = "";
		float valor = 0;
		float dscto = 0;
		
		switch(producto) {
		    case "TB":
		       npro = "Tablet";
		       valor = 350;
		       break;
		    case "LT":
		       npro = "Laptop";
		       valor = 2300;
		       break;
		    case "MN":
		       npro = "Monitor";
		       valor = 850;
		       break;
		    case "IM":
		       npro = "Impresora";
		       valor = 680;
		       break;
		    default:
		       npro = "Producto no existente";
		}
		switch(fopag) {
		    case "C1":
		       nforpa = "Contado";
		       dscto = 0.05f;
		       break;
		    case "C2":
		       nforpa = "Crédito";
		       dscto = 0.12f;
		       break;
		    default:
		       nforpa = "Forma de pago no existente";
		}
		float importe = valor * cant;
		float tdscto = importe * dscto;
		float tpagar = 0;
		
		switch(fopag) {
		    case "C1":
		       tpagar = importe - tdscto;
		       break;
		    case "C2":
		       tpagar = importe + tdscto;
		       break;
	 }
		System.out.println("\n========== RESULTADOS==========");
		System.out.println("Cliente............: " + cliente);
		System.out.println("Producto...........: " + npro);
		System.out.println("Precio.............: " + valor);
		System.out.println("Cantidad...........: " + cant);
		System.out.println("Importe............: " + importe);
		System.out.println("Forma de Pago......: " + nforpa);
		System.out.println("Descuento..........: " + tdscto);
		System.out.println("Total a Pagar......: " + tpagar);

	}

}