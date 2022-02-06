package com.abd.gestiondestok.dto;

import java.time.Instant;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UtilisateurDTO {

	private Integer id;
	
	private String nom;
	
	
	private String prenom;
	
	
	
	private String email;
	
	
	private Instant dateNaissance;
	
	
	private String password;
	
	private AdresseDTO adresse;
	
	
	private String photo;
	
	
	private EntrepriseDTO entreprise;
	
	
	private List<RoleDTO> roles;
}
