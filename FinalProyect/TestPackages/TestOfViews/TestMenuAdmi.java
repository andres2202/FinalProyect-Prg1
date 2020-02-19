package TestOfViews;

import views.MenuAdministrator;
import views.MenuMain;

public class TestMenuAdmi {

	public static void main(String[] args) {
		MenuMain main = new MenuMain("MEnu principal","Eliga");
		MenuAdministrator menu = new MenuAdministrator("Menu Administrativo","¿Escoga la opcion que desea?");
		main.show(50);
		menu.show(50);
	}
}
