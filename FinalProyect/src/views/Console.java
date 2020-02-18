package views;

import java.util.Scanner;

import presenters.MenuPrincipal;

public class Console {

	private Scanner scanner;
	
	public Console() {
		scanner = new Scanner(System.in);
	}
	
	public void closeScanner() {
		scanner.close();
	}
	
	public int getOptionMenu() throws NumberFormatException{
		return Integer.parseInt(scanner.nextLine());
	}
	
	public void showMenuPrincipal() {
		System.out.println("-------------------");
		for (MenuPrincipal menuPrincipal : MenuPrincipal.values()) {
			System.out.println(menuPrincipal.getNameOption());
		}
	}
	
	public void printErrorOfInt() {
		System.err.println("El numero digitado no es correcto");
	}
	
	public void printErrorOfNotInt() {
		System.err.println("No has digitado un numero");
	}
	
	/**
	 * @description Obtiene del usuario la edad
	 * @return La edad
	 */
	public int getAgeClient() {
		System.out.println("Por favor digite la edad.");
		return Integer.parseInt(scanner.nextLine());
	}

}
