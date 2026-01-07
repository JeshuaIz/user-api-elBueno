package org.leop.domain.infrastructure;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import org.leop.domain.model.User;
import org.leop.domain.model.repository.UserPanacheRepository;
import org.leop.domain.model.repository.UserRepository;

import java.util.List;

import static io.quarkus.hibernate.orm.panache.PanacheEntityBase.listAll;
import static io.quarkus.hibernate.orm.panache.PanacheEntityBase.persist;

@ApplicationScoped
public abstract class UserPanacheUserRepositoryImpl implements UserRepository {

    private UserPanacheRepository panache;

    public void UserRepositoryImpl(UserPanacheRepository panache) {
        this.panache = panache;
    }

    public UserPanacheUserRepositoryImpl(UserPanacheRepository panache) {
        this.panache = panache;
    }

    @Override
    @Transactional
    public void save(User user) {
        panache.persist(user);
    }

    public List<User> findAll() {
        return panache.listAll();
    }
}
