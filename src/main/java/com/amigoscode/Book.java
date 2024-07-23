package com.amigoscode;

import java.util.Arrays;
import java.util.List;

public record Book(Integer id, String name, Integer pageCount, Integer authorId) {
  public static List<Book> books =
      Arrays.asList(
          new Book(1, "quran", 604, 1),
          new Book(2, "harry potter", 801, 2),
          new Book(3, "foobar", 101, 1),
          new Book(4, "spring boot", 1102,2));

  public static Book getBookById(Integer id) {
    return books.stream().filter(book -> book.id().equals(id)).findFirst().orElse(null);
  }
}
