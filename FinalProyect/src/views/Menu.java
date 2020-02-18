package views;

public class Menu {

	private char option;
	private String text;
	protected String question;
	protected String title;

	public Menu(char option, String text) {
		this.option = option;
		this.text = text;
	}
	
	public Menu(String title,String question) {
		this.question = question;
		this.title = title;
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
	 * @return
	 */
	public String getText() {
		return text;
	}

}
