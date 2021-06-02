package example.micronaut.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

@Controller("/micronaut-filter-test")
public class DummyController {
    @Post(consumes = MediaType.APPLICATION_JSON)
    public HttpResponse<String> post(Object dto) {
        return HttpResponse.noContent();
    }
}
