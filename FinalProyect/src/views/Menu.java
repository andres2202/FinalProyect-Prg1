package views;

public class Menu {

	private char option;
	private String text;
	protected String question;
	protected String title;
	
	public Menu() {
	}

	public Menu(char option, String text) {
		this.option = option;
		this.text = text;
	}
	
	public Menu(String title,String question) {
		this.question = question;
		this.title = title;
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
