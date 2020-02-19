package com.uptc.proyect.prg1.model;

public enum TypeOfProduct {

	CLEANLINESS("Aseo",'A'),
	KITCHEN("Cocina",'C'),
	DAIRY("Lacteos",'L'),
	MEATS("Carnes",'M'),
	WRAPPERS("Paquetes",'P');
	
	private final String name; // Nombre
	private final char code; // codigo
	
	/**
	 * @descrption Este es el construcotr e inicializa el enum
	 * @param name
	 * @param code
	 */
	private TypeOfProduct(String name,char code) {
		this.name = name;
		this.code = code;
	}
	
	/**
	 * @dewcrption Este metodo es el getter del nombre
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	
	/**
	 * @descrption Este metodo es el getter del codigo
	 * @return
	 */
	public char getCode() {
		return code;
	}
	
	/**
	 * @description Este metodo nos dice si es correcto o no la opcion
	 * @param option 
	 * @return true si se cumple false si no
	 */
	public boolean isValidateCode(char option) {
		for (TypeOfProduct type : TypeOfProduct.values()) {
			if (option == type.code) {
				return true;
			}
		}
		return false;
	}
}
