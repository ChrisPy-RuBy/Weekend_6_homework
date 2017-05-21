import static org.junit.Assert.assertEquals;
import org.junit.*;
import static org.junit.Assert.assertNotNull;

public class PlayerTest {
  Player player;
  Card card;

@Before
public void before() {
  player1 = new Player("Danny", 9);
  card1 = new Card("CLUBS", 10);
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
  player1.dealCard(card);
  assertEquals(1, player.handCount());
}


}


