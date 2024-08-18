package cimacg.poc.feign.modelattribute.client;

import cimacg.poc.feign.modelattribute.Application;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = Application.class,
        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@Slf4j
class FeignPocClientTest {
    private final FeignPocClient feignPocClient;

    @Autowired
    public FeignPocClientTest(FeignPocClient feignPocClient) {
        this.feignPocClient = feignPocClient;
    }

    @Test
    void testInicial() {
        assertNotNull(this.feignPocClient);
    }


}