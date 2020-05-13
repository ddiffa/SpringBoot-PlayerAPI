package com.hellodiffa.player.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "Player API v1";
    }
}
