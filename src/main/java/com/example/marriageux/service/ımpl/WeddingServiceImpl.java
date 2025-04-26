package com.example.marriageux.service.ımpl;

import com.example.marriageux.dto.GuestAttachDto;
import com.example.marriageux.dto.WeddingCreateDto;
import com.example.marriageux.model.Wedding;
import com.example.marriageux.model.WeddingGuest;
import com.example.marriageux.repository.GuestRepository;
import com.example.marriageux.repository.WeddingRepository;
import com.example.marriageux.service.WeddingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class WeddingServiceImpl implements WeddingService {

    private final WeddingRepository weddingRepository;
    private  final GuestRepository guestRepository;

    @Override
    public void createWedding(WeddingCreateDto weddingCreateDto) {

        LocalDateTime weddingDate = weddingCreateDto.weddingDate();
        String name = weddingCreateDto.name();
        List<WeddingGuest>  weddingGuests = new ArrayList<>();
        List<GuestAttachDto> guestAttachDtos = weddingCreateDto.existingGuests();

        guestAttachDtos.
                forEach(guestAttachDto -> {
                    UUID guestId = guestAttachDto.guestId();
                    guestRepository.findById(guestId).ifPresent(guest -> weddingGuests.add(WeddingGuest.builder().build()));
                });

        weddingRepository.save(Wedding.builder()
                .name(name)
                .weddingDate(weddingDate)
                .weddingGuests(weddingGuests)
                .build());


    }

}

/*
        Wedding wedding = new Wedding();
        wedding.setName(name);
        wedding.setWeddingDate(weddingDate);
        wedding.setWeddingGuests(weddingGuests);
        weddingRepository.save(wedding);
 */

