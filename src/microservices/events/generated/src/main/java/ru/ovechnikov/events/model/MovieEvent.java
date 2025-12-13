package ru.ovechnikov.events.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MovieEvent
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-12-12T17:43:37.868446200+03:00[Europe/Moscow]", comments = "Generator version: 7.17.0")
public class MovieEvent {

  private Integer movieId;

  private String title;

  private String action;

  private @Nullable Integer userId;

  private @Nullable Float rating;

  @Valid
  private List<String> genres = new ArrayList<>();

  private @Nullable String description;

  public MovieEvent() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MovieEvent(Integer movieId, String title, String action) {
    this.movieId = movieId;
    this.title = title;
    this.action = action;
  }

  public MovieEvent movieId(Integer movieId) {
    this.movieId = movieId;
    return this;
  }

  /**
   * Идентификатор фильма
   * @return movieId
   */
  @NotNull 
  @Schema(name = "movie_id", example = "1", description = "Идентификатор фильма", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("movie_id")
  public Integer getMovieId() {
    return movieId;
  }

  public void setMovieId(Integer movieId) {
    this.movieId = movieId;
  }

  public MovieEvent title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Название фильма
   * @return title
   */
  @NotNull 
  @Schema(name = "title", example = "Inception", description = "Название фильма", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public MovieEvent action(String action) {
    this.action = action;
    return this;
  }

  /**
   * Действие с фильмом
   * @return action
   */
  @NotNull 
  @Schema(name = "action", example = "viewed", description = "Действие с фильмом", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("action")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public MovieEvent userId(@Nullable Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Идентификатор пользователя (опционально)
   * @return userId
   */
  
  @Schema(name = "user_id", example = "1", description = "Идентификатор пользователя (опционально)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_id")
  public @Nullable Integer getUserId() {
    return userId;
  }

  public void setUserId(@Nullable Integer userId) {
    this.userId = userId;
  }

  public MovieEvent rating(@Nullable Float rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Рейтинг (опционально)
   * @return rating
   */
  
  @Schema(name = "rating", example = "8.5", description = "Рейтинг (опционально)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rating")
  public @Nullable Float getRating() {
    return rating;
  }

  public void setRating(@Nullable Float rating) {
    this.rating = rating;
  }

  public MovieEvent genres(List<String> genres) {
    this.genres = genres;
    return this;
  }

  public MovieEvent addGenresItem(String genresItem) {
    if (this.genres == null) {
      this.genres = new ArrayList<>();
    }
    this.genres.add(genresItem);
    return this;
  }

  /**
   * Жанры фильма (опционально)
   * @return genres
   */
  
  @Schema(name = "genres", example = "[\"Sci-Fi\",\"Action\"]", description = "Жанры фильма (опционально)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("genres")
  public List<String> getGenres() {
    return genres;
  }

  public void setGenres(List<String> genres) {
    this.genres = genres;
  }

  public MovieEvent description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание фильма (опционально)
   * @return description
   */
  
  @Schema(name = "description", example = "A mind-bending thriller", description = "Описание фильма (опционально)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MovieEvent movieEvent = (MovieEvent) o;
    return Objects.equals(this.movieId, movieEvent.movieId) &&
        Objects.equals(this.title, movieEvent.title) &&
        Objects.equals(this.action, movieEvent.action) &&
        Objects.equals(this.userId, movieEvent.userId) &&
        Objects.equals(this.rating, movieEvent.rating) &&
        Objects.equals(this.genres, movieEvent.genres) &&
        Objects.equals(this.description, movieEvent.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movieId, title, action, userId, rating, genres, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MovieEvent {\n");
    sb.append("    movieId: ").append(toIndentedString(movieId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    genres: ").append(toIndentedString(genres)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

