package org.acme.getting.started;

import io.quarkus.test.Mock;
import org.acme.getting.started.service.GreetingService;

import javax.enterprise.context.ApplicationScoped;
import java.util.UUID;

@Mock
@ApplicationScoped
public class MockGreetingService extends GreetingService {

    @Override
    public String sayHello(String name) {
        return String.format("Hello %s, your id is %s",
                name,
                "12345");
    }
}
