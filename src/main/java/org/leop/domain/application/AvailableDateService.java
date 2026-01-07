package org.leop.domain.application;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.leop.domain.model.AvailableDate;
import org.leop.domain.model.repository.AvailableDateRepository;

import java.util.List;

@ApplicationScoped
public class AvailableDateService {

    @Inject
    AvailableDateRepository repository;

    public List<AvailableDate> findAll() {
        return repository.listAll();
    }
}
