package com.example.marriageux.dto;

import com.example.marriageux.model.Gift;
import com.example.marriageux.model.GiftType;


public record GiftCreateDto(

        String parentName,
        String imageUrl,
        GiftType giftType
) {

    public Gift toGift() {
        return Gift.builder()
                .giftType(giftType)
                .name(parentName)
                .build();
    }
}
