package com.example.marriageux.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private  String name;
    private  String surname;
    private  String email;
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Wedding> weddings;

}
