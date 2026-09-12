package com.repomind.backend.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.repomind.backend.entity.User;

public interface UserRepository extends JpaRepository<User, UUID>{
	Optional<User> findByGithubId(Long githubId);
}
