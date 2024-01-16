package com.school.sba.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class School {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int schoolId;
	private String schoolName;
	private long contactNo;
	private String email;
	private String address;
	
	@OneToOne(mappedBy="school")
	private Schedule schedule;
	

	
}
