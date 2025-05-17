package org.example.cnabjava.repositories;

import org.example.cnabjava.entities.Cnab750Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface Cnab750RegisterRepository extends JpaRepository<Cnab750Register, UUID> {
}
