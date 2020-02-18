package utilits;


/**@descrition Este clase nos ayuda para mostrar los menus,
 * el splash las descrpciones etc...
 * @author Sebastian Martinez
 *
 */
public class ViewUtilits {

	
	/**
	 * @description Este metodo nos sirve para generar una linea
	 * de caracteres
	 * @param character el caracter que quiere
	 * @param width el tamaño de la linea
	 * @return La cadena de los caracteres 
	 */
	public String generate(char character,int width) {
		String aux = "";
		for (int i = 0; i < width; i++) {
			aux += character;
		}
		return aux;
	}

	/**
	 * @description Este meotdo nos imprime una linea.
	 * @param border el borde de la linea
	 * @param width el tamaño de la linea
	 * @param text el texto que se quiere mostrar 
	 */
	public void showLine(char border, int width, String text) {
		System.out.println(border+configureText(text, width-2)+border);
	}
	
	/**
	 * @description Este metodo divide la linea si se excede del tamaño
	 * @param text la linea de texto
	 * @param width el tamaño de la cadea
	 * @return la cadena partida o la cadena con 1 espacio agregado
	 */
	public String configureText(String text,int width) {
		if (text.length() > width) {
			return text.substring(0,width);
		}else {
			return text + generate(' ', width-text.length());
		}
	}
	
	/**
	 * @descrption Este metodo centra el texto dependiendo del tamaño
	 * @param text la linea de texto 
	 * @param width el tamaño maximo
	 * @return nos devuelve una linea centrada dependiendo el tamaño
	 */
	public String alignText(String text,int width) {
		int addSpaces = width-text.length();
		while (addSpaces > 0) {
			for (int i = 0; i < text.length()-1 && addSpaces > 0; i++) {
				if (text.charAt(i) == ' ') {
					text = text.substring(0,i) + " " + text.substring(i);
					addSpaces--;
					i++;
				}
			}
		}
		return text;
	}
	
	/**
	 * @descrption Este metodo nos centra la linea de texto
	 * @param width el tamaño de la linea
	 * @param text el texto que se quiere mostrar 
	 * @return la cadena centrada
	 */
	public String centerText(int width,String text) {
		return generate(' ',(width-text.length())/2) + text + generate(' ',(width-text.length())/2);
	}
	
	/**
	 * @description Este metodo nos parte por linea un texto
	 * que es demasiado grande
	 * @param text
	 * @param width
	 * @return
	 */
	public MyArray<String> wordWrap(String text,int width) {
		String[] words = text.split(" "); 
		MyArray<String> result = new MyArray();
		int countWords = 0, countCharacters = 0;
		String line = "";
		while(countWords < words.length) {
			if (width-countCharacters > words[countWords].length()) {
				line += words[countWords] + " ";
				countCharacters += words[countWords].length()+1;
				countWords++;
			}else {
				result.addData(alignText(line, width));
				countCharacters = 0;
				line = "";
			}
			
		}
//		words = result.getDatas();
		return result;
	}
	
	
}
