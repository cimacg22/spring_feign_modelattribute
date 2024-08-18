package cimacg.poc.feign.modelattribute.client;

import feign.Client;
import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuración de Feign para la comunicación con el servicio REST.
 */
@Configuration
@Slf4j
public class FeignConfiguracion {
    /**
     * Configuración de Feign para la codificación de los mensajes.
     *
     * @param converters Convertidores de mensajes.
     * @return Codificador de mensajes.
     */
    @Bean
    public Encoder encoder(ObjectFactory<HttpMessageConverters> converters) {
        converters.getObject().getConverters().forEach(conv -> log.info("Converter: {}", conv));
        return new SpringFormEncoder(new SpringEncoder(converters));
    }
}