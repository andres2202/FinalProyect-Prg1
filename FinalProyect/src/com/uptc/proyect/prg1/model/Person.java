package com.uptc.proyect.prg1.model;

/**
 * @description Esta clase nos da una persona
 * @author Sebastian Martinez
 * @date 04/12/2019
 */
public class Person {
	
	protected String name; // nombre
	protected int age; // edad
	protected String identification; // identificacion
	protected Gender gender;
		
	
	/**
	 * @description Contructor que inicializa la persona
	 * @param name
	 * @param age
	 * @param identification
	 */
	public Person(String name, int age, String identification,Gender gender) {
		this.name = name;
		this.age = age;
		this.identification = identification;
		this.gender = gender;
	}	
	
}
