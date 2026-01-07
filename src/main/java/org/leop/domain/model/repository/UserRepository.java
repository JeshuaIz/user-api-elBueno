package org.leop.domain.model.repository;

import jakarta.enterprise.context.ApplicationScoped;
import org.leop.domain.model.User;

import java.util.List;

public interface UserRepository{

    void save(User user);

    List<User> findAllUsers();
}
