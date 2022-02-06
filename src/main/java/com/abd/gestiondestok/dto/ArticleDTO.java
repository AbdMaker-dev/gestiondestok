package com.abd.gestiondestok.dto;

import java.math.BigDecimal;

import com.abd.gestiondestok.models.Adresse;
import com.abd.gestiondestok.models.Article;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ArticleDTO {

	private Integer id;
	
	private String code;
	
	
	private String designation;
	
	
	private BigDecimal prxUnitaireHT;
	
	
	private BigDecimal tauxTva;
	
	
	private BigDecimal prxUnitaireTTC;
	
	
	private String photo;
	
	
	private CategorieDTO categorie;
	
	public ArticleDTO fromEntity(Article adresse) {
			
			if(adresse == null) {
				return null;
			}
				
			return ArticleDTO.builder()
			.build();
		}
	
	public Article toEntity(ArticleDTO articleDTO) {
		if(articleDTO == null) {
			return null;
		}
		
		Article article = new Article();
		
		return article;
	}
}
