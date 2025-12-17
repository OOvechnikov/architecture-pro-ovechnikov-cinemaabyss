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
 * Subscription
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-12-12T17:43:37.868446200+03:00[Europe/Moscow]", comments = "Generator version: 7.17.0")
public class Subscription {

  private Integer id;

  private Integer userId;

  private String planType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endDate;

  public Subscription() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Subscription(Integer id, Integer userId, String planType, OffsetDateTime startDate, OffsetDateTime endDate) {
    this.id = id;
    this.userId = userId;
    this.planType = planType;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public Subscription id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Уникальный идентификатор подписки
   * @return id
   */
  @NotNull 
  @Schema(name = "id", example = "1", description = "Уникальный идентификатор подписки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Subscription userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Идентификатор пользователя, оформившего подписку
   * @return userId
   */
  @NotNull 
  @Schema(name = "user_id", example = "1", description = "Идентификатор пользователя, оформившего подписку", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("user_id")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Subscription planType(String planType) {
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

  public Subscription startDate(OffsetDateTime startDate) {
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

  public Subscription endDate(OffsetDateTime endDate) {
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
    Subscription subscription = (Subscription) o;
    return Objects.equals(this.id, subscription.id) &&
        Objects.equals(this.userId, subscription.userId) &&
        Objects.equals(this.planType, subscription.planType) &&
        Objects.equals(this.startDate, subscription.startDate) &&
        Objects.equals(this.endDate, subscription.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, planType, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

