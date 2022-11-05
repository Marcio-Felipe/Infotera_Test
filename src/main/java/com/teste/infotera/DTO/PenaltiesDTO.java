package com.teste.infotera.DTO;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PenaltiesDTO  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date from;
	private String description;
}
