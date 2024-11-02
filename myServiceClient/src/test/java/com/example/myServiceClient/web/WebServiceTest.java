package com.example.myServiceClient.web;

import com.example.myServiceClient.data.BookClient;
import com.example.myServiceClient.service.BookService;
import com.example.myServiceClient.service.MyService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(WebService.class)
public class WebServiceTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MyService myService;

    @MockBean
    private BookService carService;

    // Test pour le endpoint de "sayHello()"
    @Test
    public void testSayHello() throws Exception {
        // Simuler le comportement du service MyService
        when(myService.sayHello()).thenReturn("Hello, world!");

        // Effectuer une requête GET et vérifier le résultat
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Hello, world!")));
    }

    // Test pour le endpoint "allCars()"
    @Test
    public void testAllCars() throws Exception {
        // Créer des voitures factices
        List<BookClient> carList = new ArrayList<>();
        carList.add(new BookClient("ABC123", "Toyota", 20000, false, 1L));
        carList.add(new BookClient("DEF456", "Honda", 18000, true, 2L));

        // Simuler la réponse du service CarService
        when(carService.allCars()).thenReturn(carList);

        // Effectuer une requête GET et vérifier le résultat
        mockMvc.perform(get("/cars")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[0].plateNumber", equalTo("ABC123")))
                .andExpect(jsonPath("$[1].plateNumber", equalTo("DEF456")));
    }

    // Test pour le endpoint "getCarById()"
    @Test
    public void testGetCarById() throws Exception {
        // Créer une voiture factice
        BookClient car = new BookClient("XYZ789", "BMW", 30000, false, 3L);

        // Simuler la réponse du service CarService pour un ID spécifique
        when(carService.getCarById("XYZ789")).thenReturn(car);

        // Effectuer une requête GET et vérifier le résultat
        mockMvc.perform(get("/cars/XYZ789")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.plateNumber", equalTo("XYZ789")))
                .andExpect(jsonPath("$.brand", equalTo("BMW")));
    }

    // Test pour le endpoint "postCarRent()"
    @Test
    public void testPostCarRent() throws Exception {
        // Simuler la réponse du service CarService
        when(carService.postRentCar("ABC123", true)).thenReturn("{\"Actual_Rent\": true}");

        // Effectuer une requête PUT (et non GET) et vérifier le résultat
        mockMvc.perform(put("/cars/ABC123")
                        .param("rent", "true")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("\"Actual_Rent\": true")));
    }
}
