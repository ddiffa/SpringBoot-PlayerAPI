package com.hellodiffa.player.repository;

import com.hellodiffa.player.entity.PlayerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PlayerRepository extends CrudRepository<PlayerEntity, UUID> {



}
