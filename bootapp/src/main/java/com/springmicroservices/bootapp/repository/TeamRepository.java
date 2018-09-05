package com.springmicroservices.bootapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.springmicroservices.bootapp.model.Team;

@RestResource(path="teams", rel="team")
public interface TeamRepository extends CrudRepository<Team, Long>
{

}
