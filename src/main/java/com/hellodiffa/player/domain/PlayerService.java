package com.hellodiffa.player.domain;

import com.hellodiffa.player.entity.PlayerEntity;

import java.util.UUID;

public interface PlayerService {

    Iterable<PlayerEntity> getAllPLayers();

    PlayerEntity createPlayer(PlayerEntity player);

    Boolean updatePlayer(PlayerEntity player);

    Boolean deletePlayer(UUID id);

    Iterable<PlayerEntity> createListPlayer(Iterable<PlayerEntity> playerEntities);
}
