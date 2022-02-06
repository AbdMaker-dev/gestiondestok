package com.abd.gestiondestok.dto;


import com.abd.gestiondestok.models.Adresse;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AdresseDTO {

	private Integer id;
	
	private String adresse1;
	
	
	private String adresse2;
	
	
	private String ville;
	
	
	private String codePostal;
	
	
	private String pays;
	
	public AdresseDTO fromEntity(Adresse adresse) {
		
		if(adresse == null) {
			return null;
		}
			
		return AdresseDTO.builder()
		.build();
	}
	
	public Adresse toEntity(AdresseDTO adresseDTO) {
		if(adresseDTO == null) {
			return null;
		}
		
		Adresse adresse = new Adresse();
		
		return adresse;
	}
}
