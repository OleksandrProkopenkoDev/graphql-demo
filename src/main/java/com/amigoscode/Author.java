package com.amigoscode;

import java.util.List;
import java.util.Optional;

public record Author(Integer id, String name) {
  public static List<Author> authors() {
    return List.of(new Author(1, "Mama Samba"), new Author(2, "John Doe"));
  }

  public static Optional<Author> getAuthorById(Integer id) {
    return authors().stream().filter(author -> author.id().equals(id)).findFirst();
  }
}
