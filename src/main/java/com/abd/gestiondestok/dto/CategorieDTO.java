package com.abd.gestiondestok.dto;

import java.util.List;

import com.abd.gestiondestok.models.Categorie;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CategorieDTO {

	private Integer id;
	
	private String code;
	
	
	private String designation;
	
	
	private List<ArticleDTO> articles;
	
	// Mapping de Categorie --> CategorieDTO 
	public CategorieDTO fromEntity(Categorie categorie) {
		
		if(categorie==null) {
			return null;
			// TODO
		}
		return CategorieDTO.builder()
				.id(categorie.getId())
				.designation(categorie.getDesignation())
				.code(categorie.getCode())
				.build();
	}
	
	public Categorie toEntity(CategorieDTO categorieDTO) {
		if(categorieDTO==null) {
			return null;
			// TODO
		}
		
		Categorie categorie = new Categorie();
		categorie.setId(categorieDTO.getId());
		categorie.setCode(categorieDTO.getCode());
		categorie.setDesignation(categorieDTO.getDesignation());
		
		return categorie;
		
	}
	
	
}
