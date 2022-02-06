package com.abd.gestiondestok.models;

import java.math.BigDecimal;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "mvStck")
public class MvStck extends AbstractEntity{
	
	@Column(name = "dateMvSDck")
	private Instant dateMvSDck;
	
	@Column(name = "quantite")
	private BigDecimal quantite;
	

	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;
	
	
	@Column(name = "typeMvStck")
	private TypeMvStock typeMvStck;
}
