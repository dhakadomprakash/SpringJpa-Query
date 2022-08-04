package com.nt.repository;

import com.nt.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ActorRepository extends JpaRepository<Actor, Integer> {
    @Query("from Actor where category=:category")
    Iterable<Actor> searchByCategory(@Param("category") String category);
}
