package views;

public class MessageMenu {

	//OPciones
	public static final char OPTION_ONE = '1';
	public static final char OPTION_TWO = '2';
	public static final char OPTION_THREE = '3';
	public static final char OPTION_FOUR = '4';
	public static final char OPTION_FIVE = '5';
	public static final char OPTION_SIX = '6';
	
	//Textos del menu administrador
	public static final String ADD_PRODUCTS = "Añadir un grupo de productos";
	public static final String ADD_PRODUCT = "Añadir un producto";
	public static final String LIST_OF_CLIENT_STRING = "Ver la lista de clientes";
	public static final String ADD_UNITS_OF_PRODUCTS = "Añadir unidades a un producto";
	
	
	public char[] optionsOfAdministrator() {
		char[] options = {
				OPTION_ONE,
				OPTION_TWO,
				OPTION_THREE,
				OPTION_FOUR,
		};
		return options;
	}
	
	public String[] textsOfAdministrator() {
		String[] textStrings = {
				ADD_PRODUCTS,
				ADD_PRODUCTS,
				LIST_OF_CLIENT_STRING,
				ADD_UNITS_OF_PRODUCTS,
		};
		return textStrings;
	}
}
