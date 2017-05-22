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
    player1 = new Player("Danny", 9);
    player2 = new Player("Edward", 10);
    card1 = new Card(SuiteType.CLUBS, ValueType.TEN);
    card2 = new Card(SuiteType.SPADES, ValueType.TWO);
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
public void getPlayerCardValue() {
  player1.dealCard(card1);
  game.addPlayerToGame(player1);
  ValueType details = game.revealPlayersCardDetails();
  assertEquals(details, ValueType.TEN);
}

@Test 
public void comparePlayerScores() {
  player1.dealCard(card1);
  player2.dealCard(card2);
  assertEquals("player1 wins", game.comparePlayerScores());
}


// @Test
// public void canPrintAllCameraDetails() {
//   photographer.addCamera(analogueCamera);
//   photographer.addCamera(digitalCamera);
//   String details = photographer.printAllCameraDetails();
//   assertEquals(details, "Pentax K-01, 35mm, Canon E0S, 30.4 pixels, ");
// }



// public String printAllCameraDetails() {
//   String details = "";
//   for (Printable camera : cameras) {
//     details += camera.printDetails() + ", ";
//   }
//   return details;
// }

}