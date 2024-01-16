package com.school.sba.Entity;

import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Schedule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int scheduleId;
	private LocalTime opensAt;
	private LocalTime closeAt;
	private int classHoursPerDay;
	private LocalTime classHoursLength;
	private LocalTime breakTime;
	private LocalTime breakLength;
	private LocalTime lunchTime;
	private LocalTime lunchLength;
	
	@OneToOne
	private School school;
	
}
