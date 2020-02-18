package com.uptc.proyect.prg1.model;

public enum Gender {

	MASCULINE('M'),
	FEMENINE('F'),
	OTHER('O');
	
	private final char gender; // el genero
	
	private Gender(char gender) {
		this.gender = gender;
	}
	
	public char getGender() {
		return gender;
	}
}
