package io.github.lukaszwent.portfolio;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

/**
 * Prosty test integracyjny uruchamiający cały kontekst aplikacji monolitu
 * i sprawdzający działanie adaptera HTTP z modułu infrastructure.
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MonolithHelloEndpointIT {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void shouldReturnHelloFromHelloEndpoint() {
        String body = restTemplate.getForObject("/api/hello", String.class);
        assertThat(body).isEqualTo("Hello");
    }
}
