package ru.ovechnikov.events.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Event
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-12-12T17:43:37.868446200+03:00[Europe/Moscow]", comments = "Generator version: 7.17.0")
public class Event {

  private String id;

  private String type;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timestamp;

  private Object payload;

  public Event() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Event(String id, String type, OffsetDateTime timestamp, Object payload) {
    this.id = id;
    this.type = type;
    this.timestamp = timestamp;
    this.payload = payload;
  }

  public Event id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Уникальный идентификатор события
   * @return id
   */
  @NotNull 
  @Schema(name = "id", example = "movie-1-viewed", description = "Уникальный идентификатор события", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Event type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Тип события
   * @return type
   */
  @NotNull 
  @Schema(name = "type", example = "movie", description = "Тип события", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Event timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Время события
   * @return timestamp
   */
  @NotNull @Valid 
  @Schema(name = "timestamp", example = "2023-01-15T14:30Z", description = "Время события", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("timestamp")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public Event payload(Object payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Полезная нагрузка события (зависит от типа события)
   * @return payload
   */
  @NotNull 
  @Schema(name = "payload", description = "Полезная нагрузка события (зависит от типа события)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("payload")
  public Object getPayload() {
    return payload;
  }

  public void setPayload(Object payload) {
    this.payload = payload;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.id, event.id) &&
        Objects.equals(this.type, event.type) &&
        Objects.equals(this.timestamp, event.timestamp) &&
        Objects.equals(this.payload, event.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, timestamp, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

