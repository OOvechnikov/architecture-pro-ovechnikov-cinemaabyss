package ru.ovechnikov.events.listener;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import ru.ovechnikov.events.model.MovieEvent;
import ru.ovechnikov.events.model.PaymentEvent;
import ru.ovechnikov.events.model.UserEvent;

import static lombok.AccessLevel.PRIVATE;
import static ru.ovechnikov.events.EventsApplication.*;

@FieldDefaults(level = PRIVATE, makeFinal = true)
@RequiredArgsConstructor
@Service
@Slf4j
public class MovieEventListener {

    ObjectMapper objectMapper;

    @KafkaListener(topics = MOVIE_EVENTS)
    @SneakyThrows
    public void listenMovieEvents(@Payload String event) {
        val movieEvent = objectMapper.readValue(event, MovieEvent.class);
        log.info(logMessage(MOVIE_EVENTS, movieEvent.toString()));
    }

    @KafkaListener(topics = PAYMENT_EVENTS)
    @SneakyThrows
    public void listenPaymentEvents(@Payload String event) {
        val paymentEvent = objectMapper.readValue(event, PaymentEvent.class);
        log.info(logMessage(PAYMENT_EVENTS, paymentEvent.toString()));
    }

    @KafkaListener(topics = USER_EVENTS)
    @SneakyThrows
    public void listenUserEvents(@Payload String event) {
        val userEvent = objectMapper.readValue(event, UserEvent.class);
        log.info(logMessage(USER_EVENTS, userEvent.toString()));
    }

    private String logMessage(String topicName, String event) {
        return "Получено сообщение из топика: %s. %s".formatted(topicName, event);
    }


}
