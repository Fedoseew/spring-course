package com.fedoseev.lab1;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class PersonRegistrationListener {
	
	@EventListener
    public void blogModified(PersonRegistrationEvent personRegistrationEvent) {
        System.out.println("PersonRegistrationEvent received through @EventListener");
        personRegistrationEvent.getPerson().setRegistered(true);
    }


}
