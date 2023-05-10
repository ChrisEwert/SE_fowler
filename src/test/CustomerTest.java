import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CustomerTest {

  private Customer customer;

  @BeforeEach
  public void setUp() {
    customer = new Customer("Chris");
  }

  @Test
  @DisplayName("Get Name")
  public void getName() {
    assertEquals("Chris", customer.getName());
  }

  @Test
  @DisplayName("Get Statement")
  public void getStatement() {
    String statement = "Rental Record for Chris" + "\n";
    statement += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";
    statement += "Amount owed is " + "0.0" + "\n";
    statement += "You earned " + "0" + " frequent renter points";

    assertEquals(statement, customer.getStatement());
  }
}