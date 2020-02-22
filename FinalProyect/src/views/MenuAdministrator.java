package views;

import utilities.ViewUtilities;

public class MenuAdministrator extends Menu implements showMenu{
	
	public MenuAdministrator(String title, String question) {
		super(title, question);
	}

	@Override
	public Menu[] optionsMenus() {
		Menu[] menus = {
				new Menu(MessageMenu.OPTION_ONE,MessageMenu.ADD_PRODUCTS),
				new Menu(MessageMenu.OPTION_TWO,MessageMenu.ADD_PRODUCT),
				new Menu(MessageMenu.OPTION_THREE,MessageMenu.LIST_CLIENT),
				new Menu(MessageMenu.OPTION_FOUR,MessageMenu.ADD_UNITS_PRODUCT),
				new Menu(MessageMenu.OPTION_FIVE,MessageMenu.EXIT),
		};
		return menus;
	}
	
	@Override
	public void show(int width) {
		ViewUtilities utilits = new ViewUtilities();
		utilits.showLine('*', width,utilits.generate('*', width));
		utilits.showLine('*', width,utilits.centerText(width,this.title));
		for (Menu menus : optionsMenus()) {
			utilits.showLine('*', width,menus.getOption() + " - " + menus.getText());
		}
		utilits.showLine('*', width,utilits.generate('*', width));
		utilits.showLine('*', width,utilits.centerText(width,this.question));
		utilits.showLine('*', width,utilits.generate('*', width));
	}

}
