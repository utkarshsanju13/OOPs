package Generic.Wildcard.UnboundedWildCard;

public class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
