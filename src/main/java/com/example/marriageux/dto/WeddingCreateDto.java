package com.example.marriageux.dto;

import java.time.LocalDateTime;
import java.util.List;

public record WeddingCreateDto(

        String name,
        LocalDateTime weddingDate,
        List<GuestAttachDto>  existingGuests  // gelecekler listesi
) {
}
