package com.EnergyAdvice.WebPagesList.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.EnergyAdvice.WebPagesList.models.entities.WebPageEntity;

@Repository
public interface WebPageRepository extends CrudRepository<WebPageEntity, Integer> {

    List<WebPageEntity> findAll();

    WebPageEntity findWebPageById(Integer id);

    WebPageEntity save(WebPageEntity webPageEntity);

    void deleteById(Integer id);
}
