package com.nt.service;

import com.nt.entity.Actor;
import com.nt.repository.ActorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ActorServiceImpl implements ActorService {
    private final ActorRepository actorRepository;

    @Override
    public Integer saveActor(Actor actor) {
        return actorRepository.save(actor).getId();
    }

    @Override
    public Iterable findActorByCategory(String category) {
        return actorRepository.searchByCategory(category);
    }
}
