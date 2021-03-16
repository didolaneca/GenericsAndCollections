public class Card <V,S>{
    private V value;
    private S suit;
/* TODO
Implement the constructor, getters and setters and toString */
    public Card(V value, S suit) {
        this.value = value;
        this.suit = suit;
    }

    public V getValue() {
        return value;
    }

    public S getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(this.value)
                .append(" of ")
                .append(this.suit)
                .toString();
    }
}
