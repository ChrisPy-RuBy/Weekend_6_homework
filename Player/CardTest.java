import static org.junit.Assert.assertEquals;
import org.junit.*;
import static org.junit.Assert.assertNotNull;

public class CardTest {

  Card card;

  @Before
  public void before() {
    card = new Card(SuiteType.CLUBS, ValueType.TEN);
  }

@Test
public void getSuite() {
  // methods in Tests always return void!
  assertEquals(SuiteType.CLUBS, card.getSuite());
}

@Test
public void getValue() {
  assertEquals(ValueType.TEN, card.getValue());
}

}