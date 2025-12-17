package ru.ovechnikov.events.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import ru.ovechnikov.events.model.Event;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * EventResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-12-12T17:43:37.868446200+03:00[Europe/Moscow]", comments = "Generator version: 7.17.0")
public class EventResponse {

  private String status;

  private Integer partition;

  private Integer offset;

  private Event event;

  public EventResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EventResponse(String status, Integer partition, Integer offset, Event event) {
    this.status = status;
    this.partition = partition;
    this.offset = offset;
    this.event = event;
  }

  public EventResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Статус операции
   * @return status
   */
  @NotNull 
  @Schema(name = "status", example = "success", description = "Статус операции", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public EventResponse partition(Integer partition) {
    this.partition = partition;
    return this;
  }

  /**
   * Партиция Kafka
   * @return partition
   */
  @NotNull 
  @Schema(name = "partition", example = "0", description = "Партиция Kafka", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("partition")
  public Integer getPartition() {
    return partition;
  }

  public void setPartition(Integer partition) {
    this.partition = partition;
  }

  public EventResponse offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Смещение в партиции Kafka
   * @return offset
   */
  @NotNull 
  @Schema(name = "offset", example = "42", description = "Смещение в партиции Kafka", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("offset")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public EventResponse event(Event event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
   */
  @NotNull @Valid 
  @Schema(name = "event", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("event")
  public Event getEvent() {
    return event;
  }

  public void setEvent(Event event) {
    this.event = event;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventResponse eventResponse = (EventResponse) o;
    return Objects.equals(this.status, eventResponse.status) &&
        Objects.equals(this.partition, eventResponse.partition) &&
        Objects.equals(this.offset, eventResponse.offset) &&
        Objects.equals(this.event, eventResponse.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, partition, offset, event);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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

