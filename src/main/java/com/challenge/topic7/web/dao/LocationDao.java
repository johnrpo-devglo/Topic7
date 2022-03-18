package com.challenge.topic7.web.dao;

import com.challenge.topic7.web.entities.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationDao extends CrudRepository<Location, Long> {
}
