package com.koltsov.cms.service.people;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @InjectMocks
    private UserService userService;

    @Test
    void updateFields() {
        String expectedLogin = "ii_ivanov";
        String expectedFirstName = "Ivan";
        String expectedLastName = "Ivanov";
        LocalDate expectedBirthDate = LocalDate.of(2020, Month.JANUARY, 1);
        String expectedEmail = "ii_ivanov@gmail.com";
        User to = createUser("dummy", "dummy", "dummy", LocalDate.now(), "dummy");
        User from = createUser(expectedLogin, expectedFirstName, expectedLastName, expectedBirthDate, expectedEmail);
        userService.updateFields(to, from);

        assertAll(
                () -> assertEquals(expectedLogin, to.getLogin()),
                () -> assertEquals(expectedFirstName, to.getFirstName()),
                () -> assertEquals(expectedLastName, to.getLastName()),
                () -> assertEquals(expectedBirthDate, to.getBirthDate()),
                () -> assertEquals(expectedEmail, to.getEmail())
        );
    }

    private User createUser(String login, String firstName, String lastName,
                            LocalDate birthDate, String email) {
        User user = new User();
        user.setId(1L);
        user.setLogin(login);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setBirthDate(birthDate);
        user.setEmail(email);
        return user;
    }
}