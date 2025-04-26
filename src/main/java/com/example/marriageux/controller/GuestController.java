package com.example.marriageux.controller;

import com.example.marriageux.dto.GuesstCreateDto;
import com.example.marriageux.service.GuestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/guest")
@RequiredArgsConstructor
public class GuestController {

    private final GuestService guestService;


    @PostMapping(path = "/create")
    public  void createGuest(@RequestBody GuesstCreateDto guesstCreateDto) {
        guestService.createGuest(guesstCreateDto);
    }

}
