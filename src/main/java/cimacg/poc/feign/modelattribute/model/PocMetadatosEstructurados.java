package cimacg.poc.feign.modelattribute.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * PocMetadatosEstructurados Clase que utilizaremos como parámetros del servicio de @ModelAttribute
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PocMetadatosEstructurados {
	private Boolean carpetaCreada;
	private String operacion;
	private PocCarpeta carpeta;
	private PocFichero fichero;
	private PocRelacion relacion;
}
