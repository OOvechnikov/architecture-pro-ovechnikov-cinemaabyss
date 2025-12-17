package ru.ovechnikov.events.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.experimental.FieldDefaults;
import lombok.experimental.NonFinal;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RestController;
import ru.ovechnikov.events.api.ApiApi;
import ru.ovechnikov.events.api.HealthApi;
import ru.ovechnikov.events.model.*;

import java.util.List;

import static lombok.AccessLevel.PRIVATE;
import static ru.ovechnikov.events.EventsApplication.*;

@FieldDefaults(level = PRIVATE, makeFinal = true)
@RequiredArgsConstructor
@RestController
@Slf4j
public class ApiController implements ApiApi, HealthApi {

    KafkaTemplate<String, String> kafkaTemplate;
    ObjectMapper objectMapper;

    @NonFinal
    @Value("${spring.application.name}")
    String appName;

    private String logMessage(String topicName, String event) {
        return "Сообщение отправлено в топик: %s. %s".formatted(topicName, event);
    }

    @Override
    public ResponseEntity<Movie> createMovie(MovieInput movieInput) {
        return null;
    }

    @Override
    @SneakyThrows
    public ResponseEntity<EventResponse> createMovieEvent(MovieEvent movieEvent) {
        val eventAsString = objectMapper.writeValueAsString(movieEvent);
        kafkaTemplate.send(MOVIE_EVENTS, eventAsString);
        log.info(logMessage(MOVIE_EVENTS, movieEvent.toString()));
        return ResponseEntity.status(HttpStatus.CREATED).body(new EventResponse("success", null, null, null));
    }

    @Override
    public ResponseEntity<Payment> createPayment(PaymentInput paymentInput) {
        return null;
    }

    @Override
    @SneakyThrows
    public ResponseEntity<EventResponse> createPaymentEvent(PaymentEvent paymentEvent) {
        val eventAsString = objectMapper.writeValueAsString(paymentEvent);
        kafkaTemplate.send(PAYMENT_EVENTS, eventAsString);
        log.info(logMessage(PAYMENT_EVENTS, paymentEvent.toString()));
        return ResponseEntity.status(HttpStatus.CREATED).body(new EventResponse("success", null, null, null));
    }

    @Override
    public ResponseEntity<Subscription> createSubscription(SubscriptionInput subscriptionInput) {
        return null;
    }

    @Override
    public ResponseEntity<User> createUser(UserInput userInput) {
        return null;
    }

    @Override
    @SneakyThrows
    public ResponseEntity<EventResponse> createUserEvent(UserEvent userEvent) {
        val eventAsString = objectMapper.writeValueAsString(userEvent);
        kafkaTemplate.send(USER_EVENTS, eventAsString).get();
        log.info(logMessage(USER_EVENTS, userEvent.toString()));
        return ResponseEntity.status(HttpStatus.CREATED).body(new EventResponse("success", null, null, null));
    }

    @Override
    public ResponseEntity<List<Movie>> getAllMovies() {
        return null;
    }

    @Override
    public ResponseEntity<List<Payment>> getAllPayments(Integer userId) {
        return null;
    }

    @Override
    public ResponseEntity<List<Subscription>> getAllSubscriptions(Integer userId) {
        return null;
    }

    @Override
    public ResponseEntity<List<User>> getAllUsers() {
        return null;
    }

    @Override
    public ResponseEntity<GetMoviesServiceHealth200Response> getEventsServiceHealth() {
        val body = new GetMoviesServiceHealth200Response();
        body.setStatus(true);
        return ResponseEntity.ok(body);
    }

    @Override
    public ResponseEntity<GetMoviesServiceHealth200Response> getMoviesServiceHealth() {
        return null;
    }

    @Override
    public ResponseEntity<String> getProxyHealth() {
        return ResponseEntity.ok("{\"status\":true}");
    }
}
