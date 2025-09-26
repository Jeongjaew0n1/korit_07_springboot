package com.example.cardatabase;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.cardatabase.web.CarController;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class CardatabaseApplicationTests {
    @Autowired
    private CarController controller;

    @Test
    @DisplayName("첫 번째 테스트 케이스")
    void contextLoads() {
        assertThat(controller).isNotNull();
    }
}

