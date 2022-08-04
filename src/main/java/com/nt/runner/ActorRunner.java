package com.nt.runner;

import com.nt.service.ActorService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ActorRunner implements CommandLineRunner {
    private final ActorService actorService;

    @Override
    public void run(String... args) throws Exception {
//        Actor actor = Actor.builder().aName("Vinod").category("teacher").mobileNumber(8888888L).build();
//        System.out.println("Actor with id: " + actorService.saveActor(actor) + " saved.");

        actorService.findActorByCategory("developer").forEach(System.out::println);
    }
}
