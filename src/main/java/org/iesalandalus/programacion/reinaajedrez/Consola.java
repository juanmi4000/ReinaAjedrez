package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

	private Consola() {

	}

	public static void mostrarMenu() {

		System.out.println("1. Crear reina por defecto.");
		System.out.println("2. Crear reina eligiendo el color.");
		System.out.println("3. Mover.");
		System.out.println("4. Salir.");
	}

	public static int elegirOpcionMenu() {
		int opcion;

		do {
			System.out.print("Elija una de las opciones: ");
			opcion = Entrada.entero();
		} while (opcion < 1 || opcion > 4);

		switch (opcion) {
		case 1:
			System.out.println("Opcion 1, ha elegido crear reina por defecto.");
			break;
		case 2:
			System.out.println("Opcion 2, ha elegido crear reina eligiendo color.");
			break;
		case 3:
			System.out.println("Opcion 3, mover.");
			break;
		case 4:
			System.out.println("Opcion 4, salir.");
			break;
		}

		return opcion;
	}

	public static Color elegirColor() {
		Color color = null;
		int opcionColor;
		do {
			System.out.println("1. Blanca.");
			System.out.println("2. Negra.");
			System.out.print("Introduce la opcion del color de la reina: ");
			opcionColor = Entrada.entero();
		} while (opcionColor < 1 || opcionColor > 2);
		switch (opcionColor) {
		case 1:
			color = Color.BLANCO;
			break;
		case 2:
			color = Color.NEGRO;
			break;
		}
		return color;
	}

	public static void mostrarMenuDireccion() {
		System.out.println("1. Norte");
		System.out.println("2. Noreste");
		System.out.println("3. Este");
		System.out.println("4. Sureste");
		System.out.println("5. Sur");
		System.out.println("6. Suroeste");
		System.out.println("7. Oeste");
		System.out.println("8. Noroeste");
	}

	public static Direccion elegirDireccion() {
		Direccion direccion = null;
		int opcionDireccion;

		do {
			System.out.print("Escoge la direccion: ");
			opcionDireccion = Entrada.entero();
		} while (opcionDireccion < 1 || opcionDireccion > 8);
		switch (opcionDireccion) {
		case 1:
			System.out.println("Ha elegido norte.");
			direccion = Direccion.NORTE;
			break;
		case 2:
			System.out.println("Ha elegido noreste.");
			direccion = Direccion.NORESTE;
			break;
		case 3:
			System.out.println("Ha elegido este.");
			direccion = Direccion.ESTE;
			break;
		case 4:
			System.out.println("Ha elegido sureste.");
			direccion = Direccion.SURESTE;
			break;
		case 5:
			System.out.println("Ha elegido sur.");
			direccion = Direccion.SUR;
			break;
		case 6:
			System.out.println("Ha elegido suroeste.");
			direccion = Direccion.SUROESTE;
			break;
		case 7:
			System.out.println("Ha elegido oeste.");
			direccion = Direccion.OESTE;
			break;
		case 8:
			System.out.println("Ha elegido noroeste.");
			direccion = Direccion.NOROESTE;
			break;
		}

		return direccion;
	}

	public static int elegirPasos() {
		int pasos;
		do {
			System.out.print("Introduce los pasos deseados (1 al 7): ");
			pasos = Entrada.entero();
		} while (pasos <= 0);
		

		return pasos;
	}

	public static void despedirse() {
		System.out.println("¡¡¡Hasta luego Lucas!!!");
	}

}