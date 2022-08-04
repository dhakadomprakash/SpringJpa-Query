package com.nt.service;

import com.nt.entity.Actor;

public interface ActorService {
    Integer saveActor(Actor actor);

    Iterable findActorByCategory(String category);
}
