package com.springmicroservices.bootapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.springmicroservices.bootapp.model.Player;

@RestResource(path="players", rel="player")
public interface PlayerRepository extends CrudRepository<Player, Long>{

}
