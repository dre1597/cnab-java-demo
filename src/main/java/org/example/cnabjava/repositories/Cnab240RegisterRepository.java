package org.example.cnabjava.repositories;

import org.example.cnabjava.entities.Cnab240Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface Cnab240RegisterRepository extends JpaRepository<Cnab240Register, UUID> {
}
