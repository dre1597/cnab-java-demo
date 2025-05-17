package org.example.cnabjava.repositories;

import org.example.cnabjava.entities.CnabFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CnabFileRepository extends JpaRepository<CnabFile, UUID> {
}
