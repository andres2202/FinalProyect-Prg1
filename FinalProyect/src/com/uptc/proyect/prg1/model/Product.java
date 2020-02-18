package com.uptc.proyect.prg1.model;
/**
 * @description Este Clase es de un producto y sus atributos
 * @author Sebastian Martinez
 * @date 04/12/2019
 */
public class Product {

	private String name; //nombre
	private String code;
	private String typeOfProduct; //Tipo de producto
	private DateProduct dateProduct; // Las fechas de expedicion y vencimiento
	
	/**
	 * @description Este metodo es el constructor e inicializa los productos
	 * @param name
	 * @param typeOfProduct
	 * @param dateProduct
	 */
	public Product(String name,String code, String typeOfProduct, DateProduct dateProduct) {
		this.name = name;
		this.code = code;
		this.typeOfProduct = typeOfProduct;
		this.dateProduct = dateProduct;
	}
	
	/**
	 * @description Obtiene el nombre
	 * @return el nombre
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @escription Obtiene el codigo
	 * @return el codigo
	 */
	public String getCode() {
		return code;
	}
	
	/**
	 * @description Obtiene el tipo de producto
	 * @return El tipo de producto
	 */
	public String getTypeOfProduct() {
		return typeOfProduct;
	}
	
	/**
	 * @description Obtiene las fechas
	 * @return las fechas
	 */
	public DateProduct getDateProduct() {
		return dateProduct;
	}
}
