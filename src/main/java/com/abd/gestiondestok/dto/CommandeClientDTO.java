package com.abd.gestiondestok.dto;

import java.time.Instant;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CommandeClientDTO {

	private Integer id;
	
	private String code;
	
	
	private Instant dateCommande;
	
	
	private ClientDTO client;
	
	
	private List<LigneCommandeClientDTO> ligneCommandeClients;
}
