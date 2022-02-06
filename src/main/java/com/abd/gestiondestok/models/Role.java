package com.abd.gestiondestok.models;

import java.util.List;

import javax.persistence.Column;
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
@Table(name= "role")
public class Role extends AbstractEntity{

	@Column(name = "nom")
	private String nom;
	
	@OneToMany(mappedBy ="role")
	private List<Utilisateur> utilisateurs;
}
