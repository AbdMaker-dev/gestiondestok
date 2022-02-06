package com.abd.gestiondestok.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
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
@Table(name= "categorie")
public class Categorie extends AbstractEntity{

	@Column(name="code")
	private String code;
	
	@Column(name="designation")
	private String designation;
	
	
	@OneToMany(mappedBy = "categorie")
	private List<Article> articles;
	
}
