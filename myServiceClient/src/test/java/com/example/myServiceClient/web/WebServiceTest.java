/*package com.example.myServiceClient.web;

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
    private BookService bookService;

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

    // Test pour le endpoint "allBooks()"
    @Test
    public void testAllBooks() throws Exception {
        // Créer des livres factices
        List<BookClient> bookList = new ArrayList<>();
        bookList.add(new BookClient("ABC123", "Tolkien", "The Lord of the Ring", false, "Galimard"));
        bookList.add(new BookClient("DEF456", "JK Rowling", "Harry Potter", true, "Folio"));

        // Simuler la réponse du service BookService
        when(bookService.allBooks()).thenReturn(bookList);

        // Effectuer une requête GET et vérifier le résultat
        mockMvc.perform(get("/books")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[0].ISBN", equalTo("ABC123")))
                .andExpect(jsonPath("$[1].ISBN", equalTo("DEF456")));
    }

    // Test pour le endpoint "getBookById()"
    @Test
    public void testGetBookById() throws Exception {
        // Créer un livre factice
        BookClient book = new BookClient("DEF456", "JK Rowling", "Harry Potter", true, "Folio");


        // Simuler la réponse du service BookService pour un ID spécifique
        when(bookService.getBookByISBN("DEF456")).thenReturn(book);

        // Effectuer une requête GET et vérifier le résultat
        mockMvc.perform(get("/books/DEF456")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.ISBN", equalTo("DEF456")))
                .andExpect(jsonPath("$.author", equalTo("Harry Potter")));
    }

    // Test pour le endpoint "postBookRent()"
    @Test
    public void testPostBookRent() throws Exception {
        // Simuler la réponse du service BookService
        when(bookService.postRentBook("ABC123", true)).thenReturn("{\"Actual_Rent\": true}");

        // Effectuer une requête PUT (et non GET) et vérifier le résultat
        mockMvc.perform(put("/books/ABC123")
                        .param("rent", "true")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("\"Actual_Rent\": true")));
    }
}
*/