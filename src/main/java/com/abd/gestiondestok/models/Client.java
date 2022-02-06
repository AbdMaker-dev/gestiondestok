package com.abd.gestiondestok.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "client")
public class Client extends AbstractEntity{

	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom;
	
	@Column(name="photo")
	private String photo;
	
	@Column(name="email")
	private String email;
	
	@Column(name="nomTel")
	private String numTel;
	
	@Embedded
	private Adresse adresse;
	
	@OneToMany(mappedBy = "client")
	private List<CommandeClient> commandeClients;
}
