import java.util. *;

public class Player {

  private String name;
  private int age;
  private ArrayList<Dealable> hand;

public Player(String name, int age) {
  this.name = name;
  this.age = age;
  this.hand = new ArrayList<Dealable>();
}

public String getName() {
  return this.name;
}

public int getAge() {
  return this.age;
}

public int handCount() {
  return hand.size();
}

public void dealCard(Dealable card) {
  this.hand.add(card);
}
}