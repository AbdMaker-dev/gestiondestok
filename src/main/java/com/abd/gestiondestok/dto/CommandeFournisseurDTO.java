package com.abd.gestiondestok.dto;

import java.time.Instant;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CommandeFournisseurDTO {

	private Integer id;
	
	private String code;
	
	
	private Instant date;
	
	
	private FournisseurDTO fournisseur;
	
	
	private List<LigneCommandeFournisseurDTO> ligneCommandeFournisseurs;
}
