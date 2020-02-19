package presenters;


import views.Console;
import views.Imput;
import views.Menu;
import views.MenuMain;
import views.Splash;

public class Presenter {

	private Console console;
	
	public Presenter() {
		console = new Console(new Imput());
		run();
	}
	
	public void run() {
		new Splash().showSplash(Message.WIDTH,Message.ASTERIST,Message.ASTERIST,Message.ASTERIST);
		MenuMain menuPrincipal = new MenuMain(Message.MENU_MAIN_STRING,Message.QUESTION);
		char option;
		do {
			menuPrincipal.show(Message.WIDTH);
			option = console.getImput().readChar();
			if (!menuPrincipal.isValidateOption(option)) {
				this.console.showMessageError(Message.READ_ERROR);
			}
		} while (!menuPrincipal.isValidateOption(option));
	}
	
	
	public void addClient() {
		
	}
	
	public static void main(String[] args) {
		new Presenter();
	}
}
