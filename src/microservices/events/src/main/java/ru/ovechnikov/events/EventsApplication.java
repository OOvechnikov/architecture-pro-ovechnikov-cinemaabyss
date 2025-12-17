package ru.ovechnikov.events;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class EventsApplication {

    public static final String MOVIE_EVENTS = "movie-events";
    public static final String PAYMENT_EVENTS = "payment-events";
    public static final String USER_EVENTS = "user-events";

    public static void main(String[] args) {
        SpringApplication.run(EventsApplication.class, args);
    }

}
