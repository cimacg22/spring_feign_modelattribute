package cimacg.poc.feign.modelattribute.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PocRelacion {
	private String codiCarpeta;	
	private String codiDocument;
	//private String classeDocument;
}
