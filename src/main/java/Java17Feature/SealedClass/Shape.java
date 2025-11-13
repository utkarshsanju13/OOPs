package Java17Feature.SealedClass;

public abstract sealed class Shape permits Circle, Square {

    public abstract int area();
}
