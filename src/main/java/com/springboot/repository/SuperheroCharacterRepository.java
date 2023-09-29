package com.springboot.repository;

import com.springboot.model.Characters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperheroCharacterRepository extends JpaRepository<Characters,Integer> {
}
