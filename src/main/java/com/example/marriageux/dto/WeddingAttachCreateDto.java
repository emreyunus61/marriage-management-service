package com.example.marriageux.dto;

import java.math.BigDecimal;
import java.util.UUID;

public record WeddingAttachCreateDto(
        UUID weddingId,
        UUID guestId,
        UUID giftId,
        BigDecimal giftAmount
) {
}
