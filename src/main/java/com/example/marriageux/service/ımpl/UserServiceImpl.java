package com.example.marriageux.service.ımpl;

import com.example.marriageux.dto.UserDto;
import com.example.marriageux.repository.UserRepository;
import com.example.marriageux.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {


    private  final UserRepository userRepository;

    @Override
    public void createUser(UserDto user) {
        userRepository.save(user.toUser());

    }
}
