package presenters;


import views.Console;

public class Presenter {

	private Console console;
	
	public Presenter() {
		console = new Console();
		menuOfProgram();
	}
	
	public void menuOfProgram() {
		console.showMenuPrincipal();
		try {
			int options = console.getOptionMenu();
			switch(options) {
			case 1: // compra sin registrarse
				
			break;
			case 2: // Registrarse
				
			break;
			case 3: // Cliente registrado
			
			break;
			case 4: // Administrador
				
			break;
			case 5: // salir del programa
				
			break;
			default:
				console.printErrorOfInt();
				menuOfProgram();
			}
		} catch (Exception e) {
			console.printErrorOfNotInt();
			menuOfProgram();
		}finally {
			console.closeScanner();
		}
	}
	
	public void client() {
		
	}
	
	public static void main(String[] args) {
		new Presenter();
	}
}
