
public enum ValueType {
  ACE(14),
  KING(13),
  QUEEN(12),
  JACK(11),
  TEN(10),
  NINE(9),
  EIGHT(8),
  SEVEN(7),
  SIX(6),
  FIVE(5),
  FOUR(4),
  THREE(3),
  TWO(2);

  public final int score;
  ValueType(int score) {
    this.score = score;  
  }
  public int score() {return score;}
  } 


// ACE,
// KING,
// QUEEN,
// JACK,
// TEN,
// NINE,
// EIGHT,
// SEVEN,
// SIX,
// FIVE,
// FOUR,
// THREE,
// TWO

