package com.uptc.proyect.prg1.model;

/**
 * @description Este Es de la mercancancia que llega o que hay.
 * @author Sebastian Martinez
 * @date 04/12/2019
 */
public class Commodity {

	private Product product; // producto
	private int units; // unidades
	private float valueStandar; // valor al cual llega el producto
	
	/**
	 * @description Constructor que inicializa una mercancia
	 * @param product
	 * @param units
	 * @param valueStandar
	 */
	public Commodity(Product product, int units, float valueStandar) {
		this.product = product;
		this.units = units;
		this.valueStandar = valueStandar;
	}
	
	/**
	 * @description Obtiene el producto
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**@description Obtiene las unidades
	 * @return the units
	 */
	public int getUnits() {
		return units;
	}

	/**
	 * @description Cambia el valor de las uidades
	 * @param units the units to set
	 */
	public void setUnits(int units) {
		this.units = units;
	}

	/**
	 * @description Obtiene el valor estandar
	 * @return the valueStandar
	 */
	public float getValueStandar() {
		return valueStandar;
	}

	/**
	 * @description Cambia el valor estandar
	 * @param valueStandar the valueStandar to set
	 */
	public void setValueStandar(float valueStandar) {
		this.valueStandar = valueStandar;
	}
}
