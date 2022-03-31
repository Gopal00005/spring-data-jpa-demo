package com.cygnet.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@ToString
// @Entity annotation defines that a 
// class can be mapped to a table
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class Employee {

	// @ID This annotation specifies
	// the primary key of the entity.
	@Id

	// @GeneratedValue This annotation
	// is used to specify the primary
	// key generation strategy to use
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NonNull
	private String name;
	@NonNull
	private String city;
	@Transient
	private String city1;
	@NonNull
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE })
	private Department department;

}