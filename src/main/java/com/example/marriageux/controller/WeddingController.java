package com.example.marriageux.controller;

import com.example.marriageux.dto.WeddingCreateDto;
import com.example.marriageux.service.WeddingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/wedding")
@RequiredArgsConstructor
public class WeddingController {

    private final WeddingService weddingService;

    @PostMapping(path = "/create")
    public  void createWedding(@RequestBody WeddingCreateDto weddingCreateDto) {
        weddingService.createWedding(weddingCreateDto);
    }

}
