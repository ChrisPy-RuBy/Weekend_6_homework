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

}