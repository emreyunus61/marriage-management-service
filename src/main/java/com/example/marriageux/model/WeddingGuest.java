package com.example.marriageux.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WeddingGuest {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private  Gift gift; //item gram altın para
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private  Guest guest; //katılımcı

    private BigDecimal amount;

}
