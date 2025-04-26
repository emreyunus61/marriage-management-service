package com.example.marriageux.service.ımpl;

import com.example.marriageux.dto.GiftCreateDto;
import com.example.marriageux.model.Gift;
import com.example.marriageux.repository.GiftRepository;
import com.example.marriageux.service.GiftService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GiftServiceImpl implements GiftService {

    private final GiftRepository giftRepository;


    @Override
    public void createGift(GiftCreateDto giftCreateDto) {
        giftRepository.save(giftCreateDto.toGift());
    }
}
