// package Player;

public class Card implements Dealable {

  private SuiteType suite;
  private ValueType value;

  public Card(SuiteType suite, ValueType value) {
    this.suite = suite;
    this.value = value;
  }

  public SuiteType getSuite() {
    return this.suite;
  }

  public ValueType getValue() {
    return this.value;
  }

}