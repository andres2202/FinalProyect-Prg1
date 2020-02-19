package com.uptc.proyect.prg1.model;

public class Product {

	private String name; // Name
	private TypeOfProduct type; // tipo
	private String code; // codigo
	
	/**
	 * @descrption Este es el contrucotr e inicializa las variables
	 * @param name
	 * @param type
	 * @param code
	 */
	public Product(String name, TypeOfProduct type, String code) {
		this.name = name;
		this.type = type;
		this.code = code;
	}

	/**
	 * @description Este es el getter de name
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @description Este es el getter de type
	 * @return the type
	 */
	public TypeOfProduct getType() {
		return type;
	}

	/**
	 * @description Este es el getter de code
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	
	
}
