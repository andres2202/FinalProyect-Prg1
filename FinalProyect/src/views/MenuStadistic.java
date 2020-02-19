package views;

import utilits.ViewUtilits;

public class MenuStadistic extends Menu implements showMenu{

	public MenuStadistic(String title, String question) {
		super(title, question);
	}

	@Override
	public Menu[] optionsMenus() {
		Menu[] menus = {
				new Menu(MessageMenu.OPTION_ONE,MessageMenu.LIST_BEST_CLIENT),
				new Menu(MessageMenu.OPTION_TWO,MessageMenu.PRODUCT_BEST_SOLD),
				new Menu(MessageMenu.OPTION_THREE,MessageMenu.BUYS_TOTALS),
				new Menu(MessageMenu.OPTION_FOUR,MessageMenu.EXIT),
		};
		return null;
	}
	
	@Override
	public void show(int width) {
		ViewUtilits utilits = new ViewUtilits();
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
