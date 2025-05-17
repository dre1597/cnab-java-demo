package org.example.cnabjava.repositories;

import org.example.cnabjava.entities.Cnab750Header;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface Cnab750HeaderRepository extends JpaRepository<Cnab750Header, UUID> {
}
