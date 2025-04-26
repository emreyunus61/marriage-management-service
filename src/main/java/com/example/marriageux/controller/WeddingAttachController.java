package com.example.marriageux.controller;

import com.example.marriageux.dto.WeddingAttachCreateDto;
import com.example.marriageux.dto.WeddingCreateDto;
import com.example.marriageux.service.WeddingAttachService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/weddingAttach")
@RequiredArgsConstructor
public class WeddingAttachController {

    private final WeddingAttachService weddingAttachService;

    @PostMapping(path = "/create")
    public  void createWedding(@RequestBody WeddingAttachCreateDto weddingAttachCreateDto) {
        weddingAttachService.createWeddingAttach(weddingAttachCreateDto);
    }


}
