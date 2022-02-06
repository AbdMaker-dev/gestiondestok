package com.abd.gestiondestok.dto;

import java.util.List;

import com.abd.gestiondestok.models.Client;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ClientDTO {

	private Integer id;
	
	private String nom;
	
	
	private String prenom;
	
	
	private String photo;

	private String email;
	
	
	private String numTel;
	
	private AdresseDTO adresse;
	
	@JsonIgnore
	private List<CommandeClientDTO> commandeClients;
	
	
	public Client toEntity(ClientDTO clientDTO) {
		if(clientDTO==null) {
			return null;
			// TODO
		}
		
		Client client = new Client();
		client.setId(clientDTO.getId());
		client.setNom(clientDTO.getNom());
		client.setPrenom(clientDTO.getPrenom());
		client.setPhoto(clientDTO.getPhoto());
		client.setEmail(clientDTO.getEmail());
		client.setNumTel(clientDTO.getNumTel());
		return client;
	}
}
