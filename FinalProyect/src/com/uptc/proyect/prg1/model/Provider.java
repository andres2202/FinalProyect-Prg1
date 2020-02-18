package com.uptc.proyect.prg1.model;

/**
 * @description Este Clase es de un proovedor 
 * @author Sebastian Martinez
 * @date 04/12/2019
 */
public class Provider extends Person{

	private GroupCommodity groupCommodity; // El grupo de mercancia que llega

	/**
	 * @description Contructor que inicializa un proovedor
	 * @param name
	 * @param age
	 * @param identification
	 * @param groupCommodity
	 */
	public Provider(String name, int age, String identification, Gender gender, GroupCommodity groupCommodity) {
		super(name, age, identification,gender);
		this.groupCommodity = groupCommodity;
	}

	/**
	 * @description Obtiene el grupo de mercancia
	 * @return the groupCommodity
	 */
	public GroupCommodity getGroupCommodity() {
		return groupCommodity;
	}
	
}
