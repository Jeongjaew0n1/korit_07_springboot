package com.example.cardatabase.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import java.util.List;

@NoArgsConstructor(force = true)
@RequiredArgsConstructor
@Data
@Entity
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ownerId;

    @NonNull
    private  String firstName;

    @NonNull
    private String lastName;

    // 소유자는 다수의 차들을 가질 수 있기 때문에 Collections를 사용
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private List<Car> cars;
}