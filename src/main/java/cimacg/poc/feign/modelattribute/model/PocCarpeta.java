package cimacg.poc.feign.modelattribute.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PocCarpeta {
	private String codi;
	private String nom;
	private String codiAlternatiu;
	private String campanya;
	private String nifInteressat;
	private String nomInteressat;
	private String descripcio;
	private String estat;
	private String unitatProductora;
	private String serie;
	private String tipus;
	private String expedientsRelacionats;
	private String suport;
	private boolean restringit;
	private String motiuRestriccio;
}
