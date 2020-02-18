package TestOfViews;

import views.Menu;
import views.MenuAdministrator;
import views.MessageMenu;

public class TestMenuOfAdministrator {

	public static void main(String[] args) {
		MessageMenu m = new MessageMenu();
		MenuAdministrator administrator = new MenuAdministrator("Hola", "HOlas");
		Menu[] ma = administrator.fill();
		for (int i = 0; i < ma.length; i++) {
			System.out.println(ma[i].getOption());
		}
	}
}
