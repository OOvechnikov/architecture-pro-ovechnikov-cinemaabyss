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
 * PaymentEvent
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-12-12T17:43:37.868446200+03:00[Europe/Moscow]", comments = "Generator version: 7.17.0")
public class PaymentEvent {

  private Integer paymentId;

  private Integer userId;

  private Float amount;

  private String status;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timestamp;

  private @Nullable String methodType;

  public PaymentEvent() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PaymentEvent(Integer paymentId, Integer userId, Float amount, String status, OffsetDateTime timestamp) {
    this.paymentId = paymentId;
    this.userId = userId;
    this.amount = amount;
    this.status = status;
    this.timestamp = timestamp;
  }

  public PaymentEvent paymentId(Integer paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  /**
   * Идентификатор платежа
   * @return paymentId
   */
  @NotNull 
  @Schema(name = "payment_id", example = "1", description = "Идентификатор платежа", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("payment_id")
  public Integer getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(Integer paymentId) {
    this.paymentId = paymentId;
  }

  public PaymentEvent userId(Integer userId) {
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

  public PaymentEvent amount(Float amount) {
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

  public PaymentEvent status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Статус платежа
   * @return status
   */
  @NotNull 
  @Schema(name = "status", example = "completed", description = "Статус платежа", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PaymentEvent timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Время платежа
   * @return timestamp
   */
  @NotNull @Valid 
  @Schema(name = "timestamp", example = "2023-01-15T14:30Z", description = "Время платежа", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("timestamp")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public PaymentEvent methodType(@Nullable String methodType) {
    this.methodType = methodType;
    return this;
  }

  /**
   * Тип метода оплаты (опционально)
   * @return methodType
   */
  
  @Schema(name = "method_type", example = "credit_card", description = "Тип метода оплаты (опционально)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("method_type")
  public @Nullable String getMethodType() {
    return methodType;
  }

  public void setMethodType(@Nullable String methodType) {
    this.methodType = methodType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentEvent paymentEvent = (PaymentEvent) o;
    return Objects.equals(this.paymentId, paymentEvent.paymentId) &&
        Objects.equals(this.userId, paymentEvent.userId) &&
        Objects.equals(this.amount, paymentEvent.amount) &&
        Objects.equals(this.status, paymentEvent.status) &&
        Objects.equals(this.timestamp, paymentEvent.timestamp) &&
        Objects.equals(this.methodType, paymentEvent.methodType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId, userId, amount, status, timestamp, methodType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentEvent {\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    methodType: ").append(toIndentedString(methodType)).append("\n");
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

