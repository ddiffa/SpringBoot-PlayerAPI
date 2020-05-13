package com.hellodiffa.player.service;

import com.hellodiffa.player.domain.PlayerService;
import com.hellodiffa.player.entity.PlayerEntity;
import com.hellodiffa.player.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class PlayerServiceImpl implements PlayerService {


    @Autowired
    private PlayerRepository repository;

    @Override
    public Iterable<PlayerEntity> getAllPLayers() {
        return repository.findAll();
    }

    @Override
    public PlayerEntity createPlayer(PlayerEntity player) {
        return repository.save(player);
    }

    @Override
    public Boolean updatePlayer(PlayerEntity player) {
        Optional<PlayerEntity> entity = repository.findById(player.getId());
        if (entity.isPresent()) {
            repository.save(player);
            return true;
        }
        return false;
    }

    @Override
    public Boolean deletePlayer(UUID id) {
        Optional<PlayerEntity> entity = repository.findById(id);
        if (entity.isPresent()) {
            repository.delete(entity.get());
            return true;
        }
        return false;
    }

    @Override
    public Iterable<PlayerEntity> createListPlayer(Iterable<PlayerEntity> playerEntities) {
        return repository.saveAll(playerEntities);
    }
}
