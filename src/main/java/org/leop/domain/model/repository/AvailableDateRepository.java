package org.leop.domain.model.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.leop.domain.model.AvailableDate;

@ApplicationScoped
public class AvailableDateRepository implements PanacheRepository<AvailableDate> {
}
