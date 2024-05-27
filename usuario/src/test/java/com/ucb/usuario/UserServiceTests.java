package com.ucb.usuario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UserServiceTests {
    @Mock
    private IUserRepository iUserRepository;

    @InjectMocks
    private UserService userService;

    @Test
    void testGetUser() {
        User user = new User();
        user.setName("Boris");
        when(iUserRepository.getUser("1")).thenReturn(user);
        User userResult = userService.getUser("1");
        assertEquals(user.getName(), userResult.getName());
    }
}
