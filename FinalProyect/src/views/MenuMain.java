package views;

import utilits.ViewUtilits;

public class MenuMain {

	private String title;
	private String question;
		
	public MenuMain(String title, String question) {
		this.title = title;
		this.question = question;
	}

	public Menu[] optionsMenus() {
		Menu[] menus = {
				new Menu('1',"Agregar Conjunto de productos"),
				new Menu('2',"Agregar un producto"),
				new Menu('3',"Agregar unidades a un producto"),
				new Menu('4',"Clientes registrados"),
		};
		return menus;
	}
	
	public void show(int width) {
		ViewUtilits utilits = new ViewUtilits();
		utilits.showLine('*', width,utilits.generate('*', width));
		utilits.showLine('*', width,utilits.centerText(width,this.title));
		for (Menu menus : optionsMenus()) {
			utilits.showLine('*', width,menus.option + " - " + menus.text);
		}
		utilits.showLine('*', width,utilits.generate('*', width));
		utilits.showLine('*', width,utilits.centerText(width,this.question));
		utilits.showLine('*', width,utilits.generate('*', width));
		
	}
}
