package com.abd.gestiondestok.dto;

import java.util.List;


import javax.persistence.Embedded;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class EntrepriseDTO {


	private Integer id;
	
	private String nom;
	
	
	private String description;
	
	private AdresseDTO adresse;
	
	
	private String photo;
	
	
	
	private String email;
	
	
	private String numTel;
	
	
	private String siteWeb;
	
	
	private List<UtilisateurDTO> utilisateurs;
}
