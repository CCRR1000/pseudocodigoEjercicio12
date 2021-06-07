Algoritmo Ejercicio12
	
	Definir altura, hombres, mujeres, contador, sumAlturaH, sumaAlturaM, sumaEdad como Entero
	Definir promAltHombre, promAltMujer, promEdad como Real
	
	Repetir
		Escribir "Datos de Persona " (contador+1)
		Escribir "Ingrese la altura:(cm)"
		Leer altura
		
		Si altura > 0 Entonces
			Escribir "Ingrese la edad:"
			Leer edad
			Escribir "Ingrese el sexo:(M/F)"
			Leer sexo
			
			sumaEdad <- sumaEdad + edad
			contador <- contador + 1
			
			Si sexo="M" O sexo="m" Entonces
				sumAlturaH <- sumAlturaH + altura
				hombres <- hombres + 1
			Fin Si
			
			Si sexo="F" O sexo="f" Entonces
				sumAlturaM <- sumAlturaM + altura
				mujeres <- mujeres + 1
			Fin Si
			
		SiNo
			Escribir "Valor incorrecto"
		Fin Si
		
	Hasta Que altura < 0
	
	promAltHombre <- sumAlturaH / hombres
	promAltMujer <- sumAlturaM / mujeres
	promEdad <- sumaEdad / contador
	
	Escribir "Promedio de altura de mujeres: " promAltMujer
	Escribir "Promedio de altura de hombres: " promAltHombre
	Escribir "Promedio de edades: " promEdad
	
FinAlgoritmo
