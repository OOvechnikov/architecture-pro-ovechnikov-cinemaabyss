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
 * Movie
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-12-12T17:43:37.868446200+03:00[Europe/Moscow]", comments = "Generator version: 7.17.0")
public class Movie {

  private Integer id;

  private String title;

  private String description;

  @Valid
  private List<String> genres = new ArrayList<>();

  private Float rating;

  public Movie() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Movie(Integer id, String title, String description, Float rating) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.rating = rating;
  }

  public Movie id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Уникальный идентификатор фильма
   * @return id
   */
  @NotNull 
  @Schema(name = "id", example = "1", description = "Уникальный идентификатор фильма", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Movie title(String title) {
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

  public Movie description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание фильма
   * @return description
   */
  @NotNull 
  @Schema(name = "description", example = "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O.", description = "Описание фильма", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Movie genres(List<String> genres) {
    this.genres = genres;
    return this;
  }

  public Movie addGenresItem(String genresItem) {
    if (this.genres == null) {
      this.genres = new ArrayList<>();
    }
    this.genres.add(genresItem);
    return this;
  }

  /**
   * Жанры фильма
   * @return genres
   */
  
  @Schema(name = "genres", example = "[\"Sci-Fi\",\"Action\",\"Thriller\"]", description = "Жанры фильма", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("genres")
  public List<String> getGenres() {
    return genres;
  }

  public void setGenres(List<String> genres) {
    this.genres = genres;
  }

  public Movie rating(Float rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Рейтинг фильма
   * @return rating
   */
  @NotNull 
  @Schema(name = "rating", example = "8.8", description = "Рейтинг фильма", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rating")
  public Float getRating() {
    return rating;
  }

  public void setRating(Float rating) {
    this.rating = rating;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Movie movie = (Movie) o;
    return Objects.equals(this.id, movie.id) &&
        Objects.equals(this.title, movie.title) &&
        Objects.equals(this.description, movie.description) &&
        Objects.equals(this.genres, movie.genres) &&
        Objects.equals(this.rating, movie.rating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, genres, rating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Movie {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    genres: ").append(toIndentedString(genres)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
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

