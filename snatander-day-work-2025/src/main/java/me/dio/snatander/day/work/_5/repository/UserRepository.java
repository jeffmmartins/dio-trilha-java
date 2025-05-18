package me.dio.snatander.day.work._5.repository;

import me.dio.snatander.day.work._5.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    boolean existsByAccountNumber(String accountNumber);
}
