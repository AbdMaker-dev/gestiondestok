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
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "ligneVentes")
public class LigneVente extends AbstractEntity{

	@ManyToOne
	@JoinColumn(name = "idVente")
	private Ventes vente;
	
	@Column(name = "quantite")
	private BigDecimal quantite;
	
	@Column(name = "prxUnitaire")
	private BigDecimal prxUnitaire;
}
