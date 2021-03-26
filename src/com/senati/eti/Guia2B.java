package Guia02;

import java.util.Scanner;

public class caso12 {

 public static void main(String[] args) {
  //Caso 12: Lea los siguientes datos: empleado, nivel (1-4) y sueldo, se pide calcular: 
  //:black_small_square: % Incremento: Según el nivel será: o 1, defina 4.5%. o 2, defina 6.0%. o 3, 
  //defina 8.5%. o 4, defina 11.0%. o Otro valor, será 0. 
  //:black_small_square: Nuevo Sueldo: Aumente el sueldo en el % Incremento hallado.
  //variables 
  String nombre ;
  int nivel;
  float sueldo;
  //entrada de datos
  Scanner sc=new Scanner(System.in);
  System.out.print("ingrese nombre empleado: ");
  nombre=sc.nextLine();
  System.out.print("ingrese el nivel  entre[1-4]: ");
  nivel=sc.nextInt();
  System.out.print("ingrese el sueldo: ");
  sueldo=sc.nextFloat();
  //calcular
  float incre=0;
  if (nivel<=4) {
	  
   switch (nivel) {
   case 1:
    incre=(float)4.5;
    break;
   case 2:
    incre=(float)6.0;
    break;
   case 3:
    incre=(float)8.5;
    break;
   case 4:
    incre=(float)11.0;
    break;
  }
  
  }
  else if (nivel>5) {
   incre=0;
  }
  //nuevo sueldo
  float incre1=(sueldo*incre)/100;
  float nsueldo=(float)(sueldo+incre1);
  //salida de datos
  System.out.println("empleado: "+nombre);
  System.out.println("nivel: "+nivel);
  System.out.println("sueldo: "+sueldo);
  System.out.println("incremento: "+incre);
  System.out.println("nuevo sueldo: "+nsueldo);
 }

}