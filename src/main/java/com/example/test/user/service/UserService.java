package com.example.test.user.service;

import com.example.test.user.entity.User;
import com.example.test.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User readUser(Long id){
        return userRepository.findById(id).orElseThrow();
    }
}
