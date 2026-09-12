package com.repomind.backend.service;

import java.util.UUID;

import org.springframework.security.crypto.encrypt.TextEncryptor;
import org.springframework.stereotype.Service;

import com.repomind.backend.entity.User;
import com.repomind.backend.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	private final UserRepository userRepository;
	private final TextEncryptor tokenEncryptor;
	
	public User requiredById(UUID id) {
		return userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("User not found"));
	}
	
	public String decryptAccessToken(User user) {
        return tokenEncryptor.decrypt(user.getAccessToken());
    }

    private static Long toLong(Object value) {
        if (value instanceof Number number) {
            return number.longValue();
        }
        return Long.parseLong(String.valueOf(value));
    }
}
