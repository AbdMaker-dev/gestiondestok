package com.abd.gestiondestok.dto;

import java.util.List;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RoleDTO {

	private Integer id;
	
	private String nom;
	
	private List<UtilisateurDTO> utilisateurs;
}
