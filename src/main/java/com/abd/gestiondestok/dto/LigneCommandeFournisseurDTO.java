package com.abd.gestiondestok.dto;

import java.math.BigDecimal;


import com.abd.gestiondestok.models.Article;
import com.abd.gestiondestok.models.CommandeFounisseur;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LigneCommandeFournisseurDTO {

	private Integer id;
	
	private ArticleDTO article;
	

	private CommandeFounisseurDTO commandeFournisseur;
	
	private BigDecimal quantite;
	
	
	private BigDecimal prxUnitaire;
}
