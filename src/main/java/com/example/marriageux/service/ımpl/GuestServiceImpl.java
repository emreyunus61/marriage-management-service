package com.example.marriageux.service.ımpl;

import com.example.marriageux.dto.GuesstCreateDto;
import com.example.marriageux.repository.GuestRepository;
import com.example.marriageux.service.GuestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional //clas seviyesinde kullandık geçerli ilgili sınıftaaki  tüm fonksiyonlarda
public class GuestServiceImpl implements GuestService {

    private  final GuestRepository guestRepository;

    @Override
    public void createGuest(GuesstCreateDto guesstCreateDto) {
       guestRepository.save(guesstCreateDto.toGuest());
    }
}
