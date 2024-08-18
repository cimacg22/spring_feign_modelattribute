package cimacg.poc.feign.modelattribute.controller;

import cimacg.poc.feign.modelattribute.model.PocMetadatosEstructurados;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * ControllerPoc Clase que implementa el controlador que utilizaremos para la carga de ficheros y en conde queremos demostrar
 * que los datos se mapean al utilizar @ModelAttribute
 * También donde explicaremos como solucionar el problema del mapeo al utilizar @ModelAttribute
 */
@Controller
public class ControllerPoc {

    /**
     * Método que utilizaremos para cargar un fichero y donde mostraremos como se mapean los datos al utilizar @ModelAttribute
     * Este servicio solo pasara los valores que recibimos y en donde notaremos que el mapeo no se realiza correctamente si no ajustamos el modelo de clases.
     * @param multipartFile Fichero que queremos cargar
     * @param pocMetadatosEstructurados Parámetros que utilizaremos para cargar el fichero
     * @return ResponseEntity<PocMetadatosEstructurados> Devuelve los parámetros que hemos utilizado para cargar el fichero
     */
    @PostMapping(value = "/api/pod/cargaFichero"
            , consumes = MediaType.MULTIPART_FORM_DATA_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PocMetadatosEstructurados> cargaFichero(
            @RequestParam(value = "file", required = false) MultipartFile multipartFile,
            @ModelAttribute("cargaFichero") PocMetadatosEstructurados pocMetadatosEstructurados) {
        return new ResponseEntity<>(pocMetadatosEstructurados, HttpStatus.OK);
    }
}