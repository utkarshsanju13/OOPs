package DesignPatternRevision.Strategy;

public class Main {

    public static void main(String[] args) {
        Navigation navigation = NavigationFactory.getNavigationStrategy(NavigationType.WATER);
        navigation.navigate("Delhi", "Bombay");
    }
}
