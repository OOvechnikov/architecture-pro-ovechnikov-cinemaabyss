package ru.ovechnikov.events.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PaymentInput
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-12-12T17:43:37.868446200+03:00[Europe/Moscow]", comments = "Generator version: 7.17.0")
public class PaymentInput {

  private Integer userId;

  private Float amount;

  public PaymentInput() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PaymentInput(Integer userId, Float amount) {
    this.userId = userId;
    this.amount = amount;
  }

  public PaymentInput userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Идентификатор пользователя, совершающего платеж
   * @return userId
   */
  @NotNull 
  @Schema(name = "user_id", example = "1", description = "Идентификатор пользователя, совершающего платеж", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("user_id")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public PaymentInput amount(Float amount) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInput paymentInput = (PaymentInput) o;
    return Objects.equals(this.userId, paymentInput.userId) &&
        Objects.equals(this.amount, paymentInput.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInput {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

