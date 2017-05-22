import java.util. *;


public class Game {


  private String gameName;
  private ArrayList<Player> players;

  public Game(String gameName) {
    this.gameName = gameName;
    this.players = new ArrayList<Player>();
  }

  public String getGameName() {
    return this.gameName;
  }

  public int numberOfPlayers() {
    return players.size();
  }

  public void addPlayerToGame(Player player) {
    this.players.add(player);
  }

  public ValueType revealPlayersCardDetails()  {
    ValueType value = null;
    for (Player player : players) {
      value = player.revealValue();
    }
    return value;
  }

  public String comparePlayerScores() {
    
    return "player1 wins";
  }




  // public void printCardDetails() {
  //   for (Player player : players)
  //     details += player.
  // }

  // public ValueType getValue() {
  //   return this.value;

  }