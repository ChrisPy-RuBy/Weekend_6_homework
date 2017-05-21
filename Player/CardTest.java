import static org.junit.Assert.assertEquals;
import org.junit.*;
import static org.junit.Assert.assertNotNull;

public class CardTest {

  Card card;

  @Before
  public void before() {
    card = new Card("Clubs", 10);
  }

@Test
public void getSuite() {
  // methods in Tests always return void!
  assertEquals("Clubs", card.getSuite());
}

@Test
public void getValue() {
  assertEquals(10, card.getValue());
}

}