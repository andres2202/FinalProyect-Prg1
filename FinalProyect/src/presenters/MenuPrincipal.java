package presenters;

/**
 * @description Este es un enum de las opciones del menu principal
 * @author Sebastian Martinez
 * @date 04/12/2019
 */
public enum MenuPrincipal {
		BUY_NOT_REGISTER("1. Compra Sin registrarse"),
		REGISTER("2. Registrarse"),
		REGISTER_CLIENT("3. Cliente registrado"),
		ADMINISTRATOR("4. Administrador"),
		EXIT("5. Salir"),
		TEXT_WELCOME("¡¡Bienvenidos!!");

		private final String nameOption; // el atributo que llama al texto

		/**
		 * @description El constructor que inicializa los textos
		 * @param nameOption
		 */
		MenuPrincipal(String nameOption){
			this.nameOption = nameOption;
		}

		/**
		 * @description Obtiene los textos
		 * @return los textos
		 */
		public String getNameOption(){
			return nameOption;
		}
}
