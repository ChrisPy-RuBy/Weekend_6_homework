import static org.junit.Assert.assertEquals;
import org.junit.*;
import static org.junit.Assert.assertNotNull;

public class GameTest {
  Game game;
  Player player1;
  Player player2;
  Card card1;
  Card card2;

  // Card card1;

@Before
public void before() {
  game = new Game("highest card wins");

}

@Test
public void getGameName() {
  assertEquals("highest card wins", game.getGameName());
} 

@Test
public void noPlayersInGame() {
  assertEquals(0, game.numberOfPlayers());
}

@Test
public void addPlayerToGame() {
  game.addPlayerToGame(player1);
  assertEquals(1, game.numberOfPlayers());
}

@Test
public void addPlayersToGame() {
  game.addPlayerToGame(player1);
  game.addPlayerToGame(player2);
  assertEquals(2, game.numberOfPlayers());
}

@Test
public getPlayerCardValue() {
  String values = "";
  a
}



public String printAllCameraDetails() {
  String details = "";
  for (Printable camera : cameras) {
    details += camera.printDetails() + ", ";
  }
  return details;
}

}