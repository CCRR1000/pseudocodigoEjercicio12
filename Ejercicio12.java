/* 
   12. Diseñar un algoritmo que lea desde teclado la información sobre altura, edad, y sexo (F/M) de los participantes de un curso. 
   La lectura finaliza cuando se lee un valor de altura negativo. Luego calcule:
        a. Promedio de altura de las mujeres.
		b. Promedio de altura de los varones.
		c. Promedio de edad de los participantes. 
*/

import java.util.*;

public class Ejercicio12 {

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);

		int altura, contador=0, edad, hombres=0, mujeres=0;
		double promAltHombre, promAltMujer, promEdad, sumaEdad=0, sumAlturaH=0, sumAlturaM=0;
		String sexo;

		do {
			System.out.println("\n-> Datos de Persona "+(contador+1));
			System.out.print("Ingrese la altura(cm): ");
			altura = Integer.parseInt(read.nextLine());

			if (altura>0) {
				System.out.print("Ingrese la edad: ");
				edad = Integer.parseInt(read.nextLine());
				System.out.print("Ingrese el sexo(M/F): ");
				sexo = read.nextLine();

				sumaEdad += edad;
				contador++;

				if (sexo.equals("M") || sexo.equals("m")) {
					sumAlturaH += altura;
					hombres++;
				}

				if (sexo.equals("F") || sexo.equals("f")) {
					sumAlturaM += altura;
					mujeres++;
				}

			} else {
				System.out.println("Valor incorrecto");
			}

		} while (altura>=0);

		promAltHombre = sumAlturaH/hombres;
		promAltMujer = sumAlturaM/mujeres;
		promEdad = sumaEdad/contador;

		System.out.println("\n   Promedio de altura de mujeres: "+promAltMujer);
		System.out.println(  "   Promedio de altura de hombres: "+promAltHombre);
		System.out.println(  "   Promedio de edades: "+promEdad+"\n");
	}


}

