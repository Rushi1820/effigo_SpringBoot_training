package com.jsonhandlers.json.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@JsonInclude(value = Include.NON_NULL) //for excluding null values
//@JsonInclude(value = Include.NON_EMPTY) //for excluding empty spacesor values
//@JsonInclude(value = Include.NON_DEFAULT) //for only returning values defined not default values
public class Product {

	private String name;
	private String prodno;
	@JsonInclude(value = Include.NON_EMPTY)
	private String targetArea;
	private double buyingprice;
	private String selfStatus;

	@Override
	public String toString() {
		return "Product [name=" + name + ", prodno=" + prodno + ", targetArea=" + targetArea + ", buyingprice="
				+ buyingprice + ", selfStatus=" + selfStatus + "]";
	}

}
