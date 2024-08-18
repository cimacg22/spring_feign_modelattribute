package cimacg.poc.feign.modelattribute.model;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PocFichero {
	private String codiCarpeta;
	private String classeDocument;
	private String idClasseDocument;
	private String titol;
	private String descripcio;
	private String unitatProductora;
	private String codiTipus;
	private String codiCataleg;
	private String numRegistre;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dataEntrada;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dataSortida;
	
	private String unitatDesti;
	private String nifCiutada;
	private String nomCiutada;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dataEmisio;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dataCaducitat;
	
	private MultipartFile fitxer;
	
	private String endpointCallback;

	private List<String> atributsPropis;
	
	private PocDocumento documentMetadata;
	 
}
