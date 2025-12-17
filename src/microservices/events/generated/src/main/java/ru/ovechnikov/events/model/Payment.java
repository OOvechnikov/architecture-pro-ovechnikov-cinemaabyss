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
 * Payment
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-12-12T17:43:37.868446200+03:00[Europe/Moscow]", comments = "Generator version: 7.17.0")
public class Payment {

  private Integer id;

  private Integer userId;

  private Float amount;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timestamp;

  public Payment() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Payment(Integer id, Integer userId, Float amount, OffsetDateTime timestamp) {
    this.id = id;
    this.userId = userId;
    this.amount = amount;
    this.timestamp = timestamp;
  }

  public Payment id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Уникальный идентификатор платежа
   * @return id
   */
  @NotNull 
  @Schema(name = "id", example = "1", description = "Уникальный идентификатор платежа", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Payment userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Идентификатор пользователя, совершившего платеж
   * @return userId
   */
  @NotNull 
  @Schema(name = "user_id", example = "1", description = "Идентификатор пользователя, совершившего платеж", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("user_id")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Payment amount(Float amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Сумма платежа
   * @return amount
   */
  @NotNull 
  @Schema(name = "amount", example = "9.99", description = "Сумма платежа", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("amount")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public Payment timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Время совершения платежа
   * @return timestamp
   */
  @NotNull @Valid 
  @Schema(name = "timestamp", example = "2023-01-15T14:30Z", description = "Время совершения платежа", requiredMode = Schema.RequiredMode.REQUIRED)
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
    Payment payment = (Payment) o;
    return Objects.equals(this.id, payment.id) &&
        Objects.equals(this.userId, payment.userId) &&
        Objects.equals(this.amount, payment.amount) &&
        Objects.equals(this.timestamp, payment.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, amount, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

