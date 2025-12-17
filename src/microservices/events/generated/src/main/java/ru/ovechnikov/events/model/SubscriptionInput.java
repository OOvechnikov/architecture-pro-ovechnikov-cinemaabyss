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
 * SubscriptionInput
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-12-12T17:43:37.868446200+03:00[Europe/Moscow]", comments = "Generator version: 7.17.0")
public class SubscriptionInput {

  private Integer userId;

  private String planType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endDate;

  public SubscriptionInput() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SubscriptionInput(Integer userId, String planType, OffsetDateTime startDate, OffsetDateTime endDate) {
    this.userId = userId;
    this.planType = planType;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public SubscriptionInput userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Идентификатор пользователя, оформляющего подписку
   * @return userId
   */
  @NotNull 
  @Schema(name = "user_id", example = "1", description = "Идентификатор пользователя, оформляющего подписку", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("user_id")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public SubscriptionInput planType(String planType) {
    this.planType = planType;
    return this;
  }

  /**
   * Тип плана подписки
   * @return planType
   */
  @NotNull 
  @Schema(name = "plan_type", example = "premium", description = "Тип плана подписки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("plan_type")
  public String getPlanType() {
    return planType;
  }

  public void setPlanType(String planType) {
    this.planType = planType;
  }

  public SubscriptionInput startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Дата начала подписки
   * @return startDate
   */
  @NotNull @Valid 
  @Schema(name = "start_date", example = "2023-01-01T00:00Z", description = "Дата начала подписки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("start_date")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public SubscriptionInput endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Дата окончания подписки
   * @return endDate
   */
  @NotNull @Valid 
  @Schema(name = "end_date", example = "2023-12-31T23:59:59Z", description = "Дата окончания подписки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("end_date")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionInput subscriptionInput = (SubscriptionInput) o;
    return Objects.equals(this.userId, subscriptionInput.userId) &&
        Objects.equals(this.planType, subscriptionInput.planType) &&
        Objects.equals(this.startDate, subscriptionInput.startDate) &&
        Objects.equals(this.endDate, subscriptionInput.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, planType, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionInput {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    planType: ").append(toIndentedString(planType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

