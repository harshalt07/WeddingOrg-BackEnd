package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "catering_menu")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CateringMenu extends BaseEntity{

	@Column(name="food_item")
	private String foodItem;
	
	private double price;
}
