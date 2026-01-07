package org.leop.domain.model.repository;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import org.leop.domain.model.User;

import java.util.List;

@ApplicationScoped
public class UserPanacheRepository
        implements PanacheRepository<User>, UserRepository {

    @Override
    public void save(User user) {
        persist(user);
    }

    @Override
    public List<User> findAllUsers() {
        return listAll(); // 👈 este listAll es de Panache
    }
}