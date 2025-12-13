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
 * UserEvent
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-12-12T17:43:37.868446200+03:00[Europe/Moscow]", comments = "Generator version: 7.17.0")
public class UserEvent {

  private Integer userId;

  private @Nullable String username;

  private @Nullable String email;

  private String action;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timestamp;

  public UserEvent() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserEvent(Integer userId, String action, OffsetDateTime timestamp) {
    this.userId = userId;
    this.action = action;
    this.timestamp = timestamp;
  }

  public UserEvent userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Идентификатор пользователя
   * @return userId
   */
  @NotNull 
  @Schema(name = "user_id", example = "1", description = "Идентификатор пользователя", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("user_id")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public UserEvent username(@Nullable String username) {
    this.username = username;
    return this;
  }

  /**
   * Имя пользователя (опционально)
   * @return username
   */
  
  @Schema(name = "username", example = "john_doe", description = "Имя пользователя (опционально)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
  public @Nullable String getUsername() {
    return username;
  }

  public void setUsername(@Nullable String username) {
    this.username = username;
  }

  public UserEvent email(@Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * Email пользователя (опционально)
   * @return email
   */
  
  @Schema(name = "email", example = "john.doe@example.com", description = "Email пользователя (опционально)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public @Nullable String getEmail() {
    return email;
  }

  public void setEmail(@Nullable String email) {
    this.email = email;
  }

  public UserEvent action(String action) {
    this.action = action;
    return this;
  }

  /**
   * Действие пользователя
   * @return action
   */
  @NotNull 
  @Schema(name = "action", example = "registered", description = "Действие пользователя", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("action")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public UserEvent timestamp(OffsetDateTime timestamp) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserEvent userEvent = (UserEvent) o;
    return Objects.equals(this.userId, userEvent.userId) &&
        Objects.equals(this.username, userEvent.username) &&
        Objects.equals(this.email, userEvent.email) &&
        Objects.equals(this.action, userEvent.action) &&
        Objects.equals(this.timestamp, userEvent.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, username, email, action, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserEvent {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

