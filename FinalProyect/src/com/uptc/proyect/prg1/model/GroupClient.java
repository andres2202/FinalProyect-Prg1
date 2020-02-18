package com.uptc.proyect.prg1.model;

public class GroupClient {
	
	private Client[] clients;

	public GroupClient(Client[] clients) {
		this.clients = clients;
	}

	/**
	 * @return the clients
	 */
	public Client[] getClients() {
		return clients;
	}

}
