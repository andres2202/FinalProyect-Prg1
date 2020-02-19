package views;

import presenters.Message;
import utilits.ViewUtilits;

public class MenuMain extends Menu implements showMenu{
		
	public MenuMain(String title, String question) {
		super(title, question);
	}

	@Override
	public Menu[] optionsMenus() {
		Menu[] menus = {
				new Menu(MessageMenu.OPTION_ONE,MessageMenu.ADD_CLIENT),
				new Menu(MessageMenu.OPTION_TWO,MessageMenu.BUY_PRODUCTS),
				new Menu(MessageMenu.OPTION_THREE,MessageMenu.ADMINISTRATOR),
				new Menu(MessageMenu.OPTION_FOUR,MessageMenu.STADISTICS),
				new Menu(MessageMenu.OPTION_FIVE,MessageMenu.EXIT),
		};
		return menus;
	}
	
	@Override
	public void show(int width) {
		ViewUtilits utilits = new ViewUtilits();
		utilits.showLine(Message.ASTERIST, width,utilits.generate(Message.ASTERIST, width));
		utilits.showLine(Message.ASTERIST, width,utilits.centerText(width,this.title));
		for (Menu menus : optionsMenus()) {
			utilits.showLine(Message.ASTERIST, width,menus.getOption() + " - " + menus.getText());
		}
		utilits.showLine(Message.ASTERIST, width,utilits.generate(Message.ASTERIST, width));
		utilits.showLine(Message.ASTERIST, width,utilits.centerText(width,this.question));
		utilits.showLine(Message.ASTERIST, width,utilits.generate(Message.ASTERIST, width));
	}
	
	/**
	 * @description Este metodo nos dice si la optionb es correcta o no
	 * @param option la opcion que pase
	 * @return true si se cumple false si no
	 */
	public boolean isValidateOption(char option) {
		for (Menu menus : optionsMenus()) {
			if (option == menus.getOption()) {
				return true;
			}
		}
		return false;
	}
}
