package com.example.marriageux.repository;

import com.example.marriageux.model.Gift;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
@Repository
public interface GiftRepository extends JpaRepository<Gift, UUID> {

    Optional<Gift> getGiftById(UUID giftId);

}
