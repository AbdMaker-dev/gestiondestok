package com.abd.gestiondestok.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name= "article")
public class Article extends AbstractEntity{

	@Column(name="code")
	private String code;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="prxUnitaireHT")
	private BigDecimal prxUnitaireHT;
	
	@Column(name="tauxTva")
	private BigDecimal tauxTva;
	
	@Column(name="prxUnitaireTTC")
	private BigDecimal prxUnitaireTTC;
	
	@Column(name="photo")
	private String photo;
	
	@ManyToOne
	@JoinColumn(name="idCategorie")
	private Categorie categorie;
}
