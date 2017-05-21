import static org.junit.Assert.assertEquals;
import org.junit.*;
import static org.junit.Assert.assertNotNull;

public class GameTest {
  Game game;
  // Player player1;
  // Player player2;

@Before
public void before() {
  game = new Game("highest card wins");
}

@Test
public void getGameName() {
  assertEquals("highest card wins", game.getGameName());
} 
}