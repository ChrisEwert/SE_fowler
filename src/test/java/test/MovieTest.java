package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import classes.Movie;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieTest {

  private Movie movie;

  @BeforeEach
  public void setUp() {
    movie = new Movie("Movie Title", 0);
  }

  @Test
  @DisplayName("Get Title")
  public void getTitle() {
    assertEquals("Movie Title", movie.getTitle());
  }

  @Test
  @DisplayName("Get PriceCode")
  public void getPriceCode() {
    assertEquals(0, movie.getPriceCode());
  }

  @Test
  @DisplayName("Get FrequentRenterPoints")
  public void getFrequentRenterPoints() {
    assertEquals(1, movie.getFrequentRenterPoints(0));
  }

  @Test
  @DisplayName("Get Charge")
  public void getCharge() {
    assertEquals(14.0, movie.getCharge(10), 0);
  }
}