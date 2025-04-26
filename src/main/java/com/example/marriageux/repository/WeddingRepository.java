package com.example.marriageux.repository;

import com.example.marriageux.model.Wedding;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
@Repository
public interface WeddingRepository extends JpaRepository<Wedding, UUID> {
    Optional<Wedding> getWeddingById(UUID weddingId);
}
