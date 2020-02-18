package views;

public class Menu {

	protected char option;
	protected String text;
	
	public Menu(char option, String text) {
		this.option = option;
		this.text = text;
	}
	
	public boolean isValidateOption(char option) {
		if (option == this.option) {
			return true;
		}
		return false;
	}
}
