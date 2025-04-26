package com.example.marriageux.service.ımpl;

import com.example.marriageux.dto.WeddingAttachCreateDto;
import com.example.marriageux.model.Gift;
import com.example.marriageux.model.Wedding;
import com.example.marriageux.repository.GiftRepository;
import com.example.marriageux.repository.WeddingRepository;
import com.example.marriageux.service.WeddingAttachService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class WeddingAttachServiceImpl implements WeddingAttachService {

    private final WeddingRepository weddingRepository;
    private final GiftRepository giftRepository;

    @Transactional  // metot seviyesinde kullandık sadece bu fonksiyon özelinde
    @Override
    public void createWeddingAttach(WeddingAttachCreateDto weddingAttachCreateDto) {

        UUID weddingId = weddingAttachCreateDto.weddingId();
        UUID guestId = weddingAttachCreateDto.guestId();
        UUID giftId = weddingAttachCreateDto.giftId();
        BigDecimal giftAmount = weddingAttachCreateDto.giftAmount();

       Wedding wedding = weddingRepository.getWeddingById(weddingId).orElseThrow(()-> new RuntimeException("Wedding not Found"));

       wedding.getWeddingGuests()
               .stream()
               .filter(weddingGuest -> weddingGuest.getGuest().getId().equals(guestId))
               .findFirst()
               .ifPresent(weddingGuest -> {
                   Gift gift = giftRepository.getGiftById(giftId).orElseThrow(()-> new RuntimeException("Gift not Found"));
                   weddingGuest.setGift(gift);
                   weddingGuest.setAmount(giftAmount);
               });
    }
}
