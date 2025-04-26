package com.example.marriageux.controller;

import com.example.marriageux.dto.GiftCreateDto;
import com.example.marriageux.service.GiftService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/gift")
public class GiftController {

    private final GiftService giftService;

    public GiftController(GiftService giftService) {
        this.giftService = giftService;
    }

    @PostMapping(path = "/create")
    public  void createGuest(@RequestBody GiftCreateDto giftCreateDto) {
        giftService.createGift(giftCreateDto);
    }


}
