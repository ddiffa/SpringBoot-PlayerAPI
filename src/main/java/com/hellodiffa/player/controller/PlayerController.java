package com.hellodiffa.player.controller;

import com.hellodiffa.player.entity.PlayerEntity;
import com.hellodiffa.player.service.PlayerServiceImpl;
import org.hibernate.mapping.Any;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/player")
public class PlayerController {

    @Autowired
    private PlayerServiceImpl service;

    @GetMapping("/")
    public Iterable<PlayerEntity> getAllPlayers() {
        return service.getAllPLayers();
    }

    @DeleteMapping
    public ResponseEntity<Map<String, Boolean>> deletePlayer(@RequestParam(required = true) String id) {
        Map<String, Boolean> response = new HashMap<>();
        response.put("success", service.deletePlayer(UUID.fromString(id)));
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Map<String, Any>> createPlayer(@RequestBody PlayerEntity playerEntity) {
        Map<String, PlayerEntity> response = new HashMap<>();
        response.put("player", service.createPlayer(playerEntity));
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @PutMapping("/")
    public ResponseEntity<Map<String, Any>> updatePlayer(@RequestBody PlayerEntity playerEntity) {
        Map<String, Boolean> response = new HashMap<>();
        response.put("success", service.updatePlayer(playerEntity));
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @PostMapping("/createAll")
    public Iterable<PlayerEntity> createListPlayer(@RequestBody Iterable<PlayerEntity> playerEntities) {
        return service.createListPlayer(playerEntities);
    }
}
