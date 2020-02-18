package com.uptc.proyect.prg1.model;

/**
 * @description Este Clase es del cliente
 * @author Sebastian Martinez
 * @date 04/12/2019
 */
public class Client extends Person{

	private String code; // codigo

	/**
	 * @description Contructor del cliente
	 * @param name
	 * @param age
	 * @param identification
	 * @param code
	 */
	public Client(String name, int age, String identification, Gender gender, String code) {
		super(name, age, identification, gender);
		this.code = code;
	}


	/**
	 * @description Obtiene el codigo
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
}
