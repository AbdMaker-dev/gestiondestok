package com.abd.gestiondestok.dto;

import java.math.BigDecimal;
import java.time.Instant;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class MvStckDTO {

	private Integer id;
	
	private Instant dateMvSDck;
	
	
	private BigDecimal quantite;
	

	private ArticleDTO article;
	
	
	private TypeMvStockDTO typeMvStck;
}
