package com.uptc.proyect.prg1.model;

/**
 * @description Este clase se encarga de los productos de las cantidades
 * que se tienen
 * @author Sebastian Martinez
 * @date 19/02/2020
 */
public class TheProduct {

	private Product product; // Producto
	private float value; // valor
	private int units; // unidades
	
	public TheProduct(Product product, float value, int units) {
		this.product = product;
		this.value = value;
		this.units = units;
	}

	/**
	 * @description Este es el getter de Product
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @description Este es el getter de value
	 * @return the value
	 */
	public float getValue() {
		return value;
	}

	/**
	 * @description Este es el getter de units
	 * @return the units
	 */
	public int getUnits() {
		return units;
	}
	
	
}
