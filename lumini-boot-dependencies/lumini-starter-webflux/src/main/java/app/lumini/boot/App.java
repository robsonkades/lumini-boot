package app.lumini.boot;

import java.util.stream.Stream;

/** Hello world! */
public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    Stream<String> features = Stream.of("feature 1", "feature 2", "feature 3");

    features
        .map(String::toUpperCase)
        .map(String::toUpperCase)
        .map(String::toUpperCase)
        .map(String::toUpperCase)
        .map(String::toUpperCase)
        .forEach(System.out::println);
  }
}
