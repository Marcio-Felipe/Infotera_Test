package com.teste.infotera.DTO;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CancellationPoliciesDTO  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Boolean refundable;
	private List<PenaltiesDTO> penalties;
}
