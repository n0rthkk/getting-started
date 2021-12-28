package org.acme.getting.started.service;

import javax.enterprise.context.ApplicationScoped;
import java.util.UUID;

@ApplicationScoped
public class GreetingService {

    public String sayHello() {
        return "hello";
    }

    public String sayHello(String name) {
        return String.format("Hello %s, your id is %s",
                name,
                UUID.randomUUID().toString());
    }
}
