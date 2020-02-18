package views;

import utilits.ViewUtilits;

public class MenuAdministrator{

	private String title;
	private String question;
	private MessageMenu message;

	public MenuAdministrator(String title, String question) {
		this.title = title;
		this.question = question;
	}

	public Menu[] fill() {
		Menu[] menus = new Menu[3];
		for (int i = 0; i < menus.length; i++) {
			menus[i] = new Menu(message.optionsOfAdministrator()[i],message.textsOfAdministrator()[i]);
		}
		return menus;
	}

	public void showMenu(int width) {
		fill();
		ViewUtilits utilit = new ViewUtilits();
		utilit.showLine('*', width,utilit.generate('*', width));
		utilit.showLine('*', width,utilit.centerText(width,this.title));
//		for (Menu menu : fill()) {
//			utilit.showLine('*', width,utilit.centerText(width,menu.option + " - " + menu.text));
//		}
		utilit.showLine('*', width,utilit.generate('*', width));
		utilit.showLine('*', width,utilit.centerText(width,this.question));
		utilit.showLine('*', width,utilit.generate('*', width));
		
	}
	
	
}
