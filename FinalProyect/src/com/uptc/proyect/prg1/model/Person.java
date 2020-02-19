package com.uptc.proyect.prg1.model;

/**
 * @descrption Esta clase es de una persona y nos da las caracterizticas
 * mas basicas de este
 * @author Sebastian Martinez
 * @date 19/02/2020
 */
public class Person {

	protected String name; // Nombre
	protected byte age; // edad
	protected String identificator; // Identidad
	
	/**
	 * @descritpion Este es el constructor y nos inicializa las variables 
	 * @param name
	 * @param age
	 * @param identificator
	 */
	public Person(String name, byte age, String identificator) {
		this.name = name;
		this.age = age;
		this.identificator = identificator;
	}
	
}
