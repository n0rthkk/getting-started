package org.acme.getting.started;

import org.acme.getting.started.service.GreetingService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.UUID;

@Path("/hello")
public class GreetingResource {

    // это должно быть в параметрах
//    public static final String TOKEN = "dev";

    @Inject
    private GreetingService greetingService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return greetingService.sayHello();
    }

    @GET
    @Path("/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@PathParam("name") String name) {
        return greetingService.sayHello(name);
    }

//    @GET
//    @Path("/html")
//    @Produces(MediaType.TEXT_PLAIN)
//    public String hello() {
//        return "Hello RESTEasy";
//    }

//    @GET
//    @Path("/html/{id}")
//    @Produces(MediaType.TEXT_PLAIN)
//    public String hello(@PathParam("id") String id) {
//        return "Hello " + id;
//    }
//
//    @POST
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
//    // параметр может быть одинаковый, но название переменной - нет
//    public String addHello(@HeaderParam("token") String hName, @QueryParam("token") String aName) {
//        String token = hName != null ? hName :aName;
//        if (!TOKEN.equals(token)) {
//            throw new RuntimeException("Unauthorized");
//        }
//        return "{\"key\": \"" + token + "\"}";
//    }


}