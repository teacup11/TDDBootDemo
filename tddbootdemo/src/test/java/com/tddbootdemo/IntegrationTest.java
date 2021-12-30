package com.tddbootdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
public class IntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getCar_returnsCarDetails() throws Exception {
        // arrange

        //act
        ResponseEntity<Car> response = restTemplate.getForEntity("/cars/prius", Car.class);

        //assert
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("prius", response.getBody().getName());
        assertEquals("hybrid", response.getBody().getType());
    }

}
