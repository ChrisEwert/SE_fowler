package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import classes.Rental;
import classes.Movie;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RentalTest {

  private Rental rental;
  private Movie movie;

  @BeforeEach
  public void setUp() {
    movie = new Movie("Movie Title", 0);
    rental = new Rental(movie, 10);
  }

  @Test
  @DisplayName("Get Movies")
  public void getMovie() {
    assertEquals(movie, rental.getMovie());
  }

  @Test
  @DisplayName("Get DaysRented")
  public void getDaysRented() {
    assertEquals(10, rental.getDaysRented());
  }

  @Test
  @DisplayName("Get Charge")
  public void getCharge() {
    assertEquals(14.0, rental.getCharge(), 0);
  }

  // @Test
  // @DisplayName("Get FrequentRenterPoints")
  // public void getFrequentRenterPoints() {
  //   assertEquals(1, rental.getFrequentRenterPoints());
  // }
}