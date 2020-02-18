package com.uptc.proyect.prg1.model;

import java.time.LocalDate;

/**
 * @description Esta clase nos da una fecha de expedicion y de vencimiento
 * @author Sebastian Martinez
 * @date 04/12/2019
 */
public class DateProduct {

	private LocalDate dateExpedition; // Fecha de expedicion
	private LocalDate dateExpiration; // Fecha de vencimiento

	/**
	 * @description Este es el constructor e inicializa las fechas
	 * @param dateExpedition Fecha de expedicion
	 * @param dateExpiration Fecha de vencimiento
	 */
	public DateProduct(LocalDate dateExpedition, LocalDate dateExpiration) {
		this.dateExpedition = dateExpedition;
		this.dateExpiration = dateExpiration;
	}
	/**
	 * @description Obtiene la fecha de expedicion
	 * @return la fecha de expedicion
	 */
	public LocalDate getDateExpedition() {
		return dateExpedition;
	}
	/**
	 * @description Obtiene la fecha de vencimiento
	 * @return la fecha de vencimiento 
	 */
	public LocalDate getDateExpiration() {
		return dateExpiration;
	}
}
