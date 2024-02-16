package com.example.tasksapi.service;

import com.example.tasksapi.model.User;
import com.example.tasksapi.repository.SessionRepository;
import com.example.tasksapi.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class AuthServiceTest {

    @InjectMocks
    private AuthService authService;

    @Mock
    private SessionRepository sessionRepository;

    @Mock
    private UserRepository userRepository;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testRegistrationUser() {
        User user = new User();
        authService.register(user);
        Mockito.verify(userRepository,
                Mockito.times(1)).save(user);
    }

    @Test
    public void testCreateNewSession() {
        User user = new User();
        authService.register(user);
        authService.login(user.getName(), user.getPassword());
        Mockito.verify(sessionRepository,
                Mockito.atMostOnce()).save(user);
    }

    @Test
    public void testLogout() {
        User user = new User();
        authService.register(user);
        authService.login(user.getName(), user.getPassword());
        authService.logout(user.getId());
        Mockito.verify(sessionRepository,
                Mockito.atMostOnce()).deleteById(user.getId());
    }

}
