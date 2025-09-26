package com.example.cardatabase;

import com.example.cardatabase.domain.AppUser;
import com.example.cardatabase.domain.AppUserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.Optional;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class AppRepositoryTest {
    @Autowired
    private AppUserRepository appUserRepository;

    @Test
    @DisplayName("findByUsername 메서드 검증")
    void findByUsernameShouldReturnAppUser() {
        // given
        appUserRepository.save(new AppUser("user1", "user1","USER"));
        // when
        Optional<AppUser> foundUser = appUserRepository.findByUsername("user1");
        // then
        assertThat(foundUser).isPresent();
    }


}
/*
    3. 사용자 이름으로 사용자 조회
    - 문제 : AppUserRepository 의 findByUsername 메서드가 정상적으로 사용자를 찾아내는지 테스트하는 케이스를 작성.
    - 지시사항
    2. AppUserRepository를 주입받아서 AppUser 데이터를 저장
    3. findByUsername("user1")을 호출하고, 결과가 Optional 타입이기 때문에 isPresent()가 true 인지 확인
    4. 또한 조회된 사용자의 role이 USER 인지도 검증
*/