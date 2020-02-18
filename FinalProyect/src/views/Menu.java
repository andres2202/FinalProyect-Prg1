package views;


/**
 * @description Este metodo nos crea un menu x
 * @author Sebastian Martinez
 * @date 18/02/2020
 */
public class Menu {

	private char option; // la opcion
	private String text; // el texto
	
	
	/**@description Este Es el contructor
	 * @param option
	 * @param text
	 */
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


	/**
	 * @return the option
	 */
	public char getOption() {
		return option;
	}


	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}
	
	
}
