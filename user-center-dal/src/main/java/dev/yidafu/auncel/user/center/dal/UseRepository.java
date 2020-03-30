package dev.yidafu.auncel.user.center.dal;

import dev.yidafu.auncel.user.center.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UseRepository extends JpaRepository<User, Long> {
    public Optional<User> findById(Long id);
}