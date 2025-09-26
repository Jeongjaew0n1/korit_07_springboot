package com.example.cardatabase;

import com.example.cardatabase.domain.Car;
import com.example.cardatabase.domain.CarRepository;
import com.example.cardatabase.domain.Owner;
import com.example.cardatabase.domain.OwnerRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class CarRepositoryTest {
    @Autowired
    private CarRepository carRepository;
    @Autowired
    private OwnerRepository ownerRepository;

    @Test
    @DisplayName("차량 저장 메스트 테스트")
    void saveCar() {
        // given - 제반 준비 사항
        // Car Entity를 확인해봤을 때 field로 Owner를 요구하기 때문에
        // 얘부터 먼저 만들고 -> ownerRepository에 저장
        Owner owner = new Owner("Gemini", "GPI");
        ownerRepository.save(owner);
        // 그리고 Car 객체를 만들겁니다.
        Car car = new Car("Ford","Mustang","Red","ABCDEF",2021,567890,owner);
        // when - 테스트 실행
        carRepository.save(car);
        // then - 그 결과가 어떠할지
        assertThat(carRepository.findById(car.getId())).isPresent();
        assertThat(carRepository.findById(car.getId()).get().getBrand()).isEqualTo("Ford");
    }

    @Test
    @DisplayName("삭제 테스트 : ")
    void deleteById() {
        Owner owner1 = new Owner("일", "김");
        Car car = new Car("BMW", "BMW2","Black", "324W6510",2020,300000,owner1);
        assertThat(carRepository.findById(car.getId())).isPresent();
    }
}