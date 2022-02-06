package com.abd.gestiondestok.models;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity implements Serializable {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@CreatedDate
	@Column(name= "creationDate", nullable = false)
	@JsonIgnore
	private Instant creationDate;
	
	@LastModifiedDate
	@Column(name= "lastModifyDate")
	@JsonIgnore
	private Instant lastModifyDate;
}
