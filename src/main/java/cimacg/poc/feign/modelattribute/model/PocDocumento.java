package cimacg.poc.feign.modelattribute.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PocDocumento {
	private String documentId;
	private String type;
	private Integer docTypeId;
	private boolean signed;
	private Integer status;
	private Date receptionDate;

}
