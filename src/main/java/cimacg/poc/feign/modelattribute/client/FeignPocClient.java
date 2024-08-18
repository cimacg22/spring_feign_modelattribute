package cimacg.poc.feign.modelattribute.client;

import cimacg.poc.feign.modelattribute.model.PocMetadatosEstructurados;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * Cliente Feign para el servicio "Carga de fichero".
 */
@FeignClient(name = "POC", url = "http://localhost:18081", configuration = FeignConfiguracion.class)
public interface FeignPocClient {
    /**
     * Muestra un cliente del servicio "Carga de fichero"
     *
     * @param multipartFile             fitxer a carregar
     * @param pocMetadatosEstructurados paràmetres con el modelo de datos estructurado.
     * @return resposta de la crida
     */
    @PostMapping(value = "/api/pod/cargaFichero"
            , consumes = MediaType.MULTIPART_FORM_DATA_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PocMetadatosEstructurados> cargaFichero(
            @RequestParam(value = "file", required = false) MultipartFile multipartFile,
            @ModelAttribute("cargaFichero") PocMetadatosEstructurados pocMetadatosEstructurados);
}
