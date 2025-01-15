package com.admin.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "units")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Units {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String unitName;
}
