public class Card implements Dealable {

  private String suite;
  private int value;

  public Card(String suite, int value) {
    this.suite = suite;
    this.value = value;
  }

  public String getSuite() {
    return suite;
  }

  public int getValue() {
    return value;
  }

}