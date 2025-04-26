package com.example.marriageux.dto;

import com.example.marriageux.model.Guest;

public record GuesstCreateDto(
        String name,
        String surname
) {
    public Guest toGuest() {
        return Guest.builder()
                .name(name)
                .surname(surname)
                .build();
    }
}
