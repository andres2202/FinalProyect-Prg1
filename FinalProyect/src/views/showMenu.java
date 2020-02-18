package views;


/**
 * @description Esta interface nos permite mostrar los diferentes menus
 * @author Sebastian Martinez
 * @date 18/02/2020
 */
public interface showMenu {

	public abstract void show(int width); // muestra los menus
	public abstract Menu[] optionsMenus(); // Nos obliga a crear las opciones
}
