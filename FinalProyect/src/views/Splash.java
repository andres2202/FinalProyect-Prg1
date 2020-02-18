package views;

import presenters.Message;
import utilits.MyArray;
import utilits.ViewUtilits;



public class Splash {

	public void showSplash(int width,char ... borders) {
		ViewUtilits viewUtilits = new ViewUtilits();
		viewUtilits.showLine(borders[0],width,viewUtilits.generate(borders[1],width));
		viewUtilits.showLine(borders[2],width,viewUtilits.centerText(width,Message.NAME_APP));
		viewUtilits.showLine(borders[2],width,viewUtilits.centerText(width,Message.NAME_AUTHOR));
		viewUtilits.showLine(borders[2],width,viewUtilits.centerText(width,Message.VERSION_OF_APP));
		int size = viewUtilits.wordWrap(Message.DESCRIPTION_OF_APP, width).size();
		for (int i = 0; i < size; i++) {
			viewUtilits.showLine(borders[0], width, viewUtilits.wordWrap(Message.DESCRIPTION_OF_APP, width).getData(i));
		}
		viewUtilits.showLine(borders[0],width,viewUtilits.generate(borders[1],width));		
	}
}
