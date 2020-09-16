package com.bezkoder.springjwt.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table
public class GroupUser {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idG;
	private String groupName;
	private String description;
	
}
