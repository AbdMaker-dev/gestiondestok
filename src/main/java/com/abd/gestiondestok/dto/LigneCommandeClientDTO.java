package com.abd.gestiondestok.dto;

import java.math.BigDecimal;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LigneCommandeClientDTO {

	private Integer id;
	
	private ArticleDTO article;
	
	
	
	private CommandeClientDTO commandeClient;
	
	
	private BigDecimal quantite;
	
	
	private BigDecimal prxUnitaire;
}
