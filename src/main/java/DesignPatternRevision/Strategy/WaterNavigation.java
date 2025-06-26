package DesignPatternRevision.Strategy;

public class WaterNavigation implements Navigation {

    @Override
    public void navigate(String from, String to) {
        System.out.println("Water navigate");
    }
}
