package com.example.userapi.config;

import com.example.userapi.model.Role;
import com.example.userapi.model.User;
import com.example.userapi.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final UserRepository repository;

    public DataInitializer(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {
        if (repository.count() == 0) {
            repository.save(new User(null, "Alice", "Smith", Role.ADMIN));
            repository.save(new User(null, "Bob", "Johnson", Role.DEVELOPER));
            repository.save(new User(null, "Charlie", "Brown", Role.TESTER));
            repository.save(new User(null, "Diana", "Taylor", Role.SYSTEM_ANALYST));
            repository.save(new User(null, "Ethan", "Walker", Role.TEAM_LEAD));
        }
    }
}
