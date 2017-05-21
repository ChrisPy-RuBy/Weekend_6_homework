import static org.junit.Assert.assertEquals;
import org.junit.*;
import static org.junit.Assert.assertNotNull;

public class PlayerTest {
  Player player1;
  Player player2;
  Card card1;
  Card card2;

@Before
public void before() {
  player1 = new Player("Danny", 9);
  player2 = new Player("Edward", 10);
  card1 = new Card(SuiteType.CLUBS, ValueType.TEN);
  card2 = new Card(SuiteType.SPADES, ValueType.TWO);
}

@Test
public void hasName() {
  assertEquals("Danny", player1.getName());
}

@Test
public void hasAge() {
  assertEquals(9, player1.getAge());
}

@Test
public void handStartsEmpty() {
  // capital V in void means that a return is expected of course 
  assertEquals(0, player1.handCount());
}

@Test 
public void addCardToHand() {
  player1.dealCard(card1);
  assertEquals(1, player1.handCount());
}

@Test 
public void bothPlayersGetCard() {
  player1.dealCard(card1);
  player2.dealCard(card2);
  assertEquals(1, player1.handCount());
  assertEquals(1, player2.handCount());
}


}


