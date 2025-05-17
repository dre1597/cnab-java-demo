package org.example.cnabjava.repositories;

import org.example.cnabjava.entities.Cnab240Header;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface Cnab240HeaderRepository extends JpaRepository<Cnab240Header, UUID> {
}
