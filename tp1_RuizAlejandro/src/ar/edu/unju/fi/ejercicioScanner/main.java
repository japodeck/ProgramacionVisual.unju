package ar.edu.unju.fi.ejercicioScanner;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// uso de estrucutra de seleccion multiple
		Scanner sc = new Scanner(System.in);
		byte opcion =0;
		do {
			System.out.println("1- Alta de alumno");
			System.out.println("2- Alta de Materia");
			System.out.println("3- Mostrar Alumno");
			System.out.println("4- Salir");
			System.out.println("Seleccione una opcion");
			opcion = sc.nextByte();
			switch(opcion) {
				case 1:
					sc.nextLine();
					System.out.println("ingrese nombre");
					String nombreAlumno = sc.nextLine();
					System.out.println("el nombre ingresado es: "+nombreAlumno);
					break;
				case 2:
					sc.nextLine();
					System.out.println("ingrese nombre materia:");
					String nombreMateria = sc.nextLine();
					System.out.println("el nombre de la materia es: "+nombreMateria);
					break;
				case 3:
					System.out.println("es la opcion ");
					break;
				case 4:
					System.out.println("fin del programa");
					break;
				default:
						System.out.println("opcion incorrecta");
			
					
			}
		}while(opcion != 4);
		System.out.println("fuera del dowhile!");
		sc.close();
		
	}

}
