package com.shankar.hazlecast.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class hrEmployeeDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5580016624248647982L;
	private String id;
	private String name;

}
