package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;

public class MainApp {

	private static Reina reina;

	public static void main(String[] args) {

		int aux;
		do {
			Consola.mostrarMenu();
			aux = Consola.elegirOpcionMenu();
			MainApp.ejecutarOpcion(aux);

		} while (aux != 4);

	}

	private static void ejecutarOpcion(int opcion) {
		switch (opcion) {
		case 1:
			MainApp.crearReinaDefecto();
			break;
		case 2:
			MainApp.crearReinaColor();
			break;
		case 3:
			MainApp.mover();
			break;
		case 4:
			Consola.despedirse();
			break;
		}
	}

	private static void crearReinaDefecto() {
		reina = new Reina();
		MainApp.mostrarReina();
	}

	private static void crearReinaColor() {
		reina = new Reina(Consola.elegirColor());
		MainApp.mostrarReina();
	}

	private static void mover() {
		if (reina == null) {
			System.out.println("No has creado la reina. Intentelo de nuevo.");
		}
		try {
			Consola.mostrarMenuDireccion();
			reina.mover(Consola.elegirDireccion(), Consola.elegirPasos());
			MainApp.mostrarReina();
		} catch (NullPointerException | IllegalArgumentException | OperationNotSupportedException e) {
			System.out.println(e.getMessage());
		}

	}

	private static void mostrarReina() {
		if (reina == null) {
			System.out.println("No puedo mover un personaje nulo.");
		}
		System.out.println(reina);
	}

}
