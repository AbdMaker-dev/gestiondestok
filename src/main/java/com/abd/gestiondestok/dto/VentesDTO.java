package com.abd.gestiondestok.dto;

import java.time.Instant;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class VentesDTO {

	private Integer id;
	
	private String code;
	
	private Instant date;
	
	private String commentaire;
}
