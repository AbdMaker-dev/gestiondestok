package com.abd.gestiondestok.models;

import java.time.Instant;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name= "utilisateur")
public class Utilisateur extends AbstractEntity{

	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom;
	
	
	@Column(name="email")
	private String email;
	
	@Column(name="dateNaissance")
	private Instant dateNaissance;
	
	@Column(name="password")
	private String password;
	
	@Embedded
	private Adresse adresse;
	
	@Column(name="photo")
	private String photo;
	
	@ManyToOne
	@JoinColumn(name = "idEntreprise")
	private Entreprise entreprise;
	
	@ManyToOne
	@JoinColumn(name = "idRole")
	private Role role;
	
}
