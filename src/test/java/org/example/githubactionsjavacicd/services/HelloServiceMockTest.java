package org.example.githubactionsjavacicd.services;

import org.example.githubactionsjavacicd.repository.HelloRepository;
import org.example.githubactionsjavacicd.service.HelloService;
import org.example.githubactionsjavacicd.service.HelloServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class HelloServiceMockTest {

    @Mock
    private HelloRepository helloRepository;

    //@Spy
    @InjectMocks // auto inject helloRepository
    private HelloService helloService = new HelloServiceImpl();

    @BeforeEach
    void setMockOutput() {
        //when(helloService.get()).thenReturn("Hello Mockito");
        when(helloRepository.get()).thenReturn("Hello Mockito From Responsitory");
    }

    @DisplayName("Test Mock helloService + helloRepository")
    @Test
    void testGet() {
        assertEquals("Hello Mockito From Responsitory", helloService.get());
    }
}
