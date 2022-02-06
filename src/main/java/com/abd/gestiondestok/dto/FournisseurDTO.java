package com.abd.gestiondestok.dto;

import java.util.List;


import javax.persistence.Embedded;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class FournisseurDTO {

	private Integer id;
	
	private String nom;
	

	private String prenom;
	
	
	private String photo;
	
	
	private String email;
	
	
	private String numTel;
	
	private AdresseDTO adresse;
	
	
	private List<CommandeFounisseurDTO> commandeFounisseurs;
}
