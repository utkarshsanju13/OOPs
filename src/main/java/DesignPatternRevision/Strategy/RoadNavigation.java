package DesignPatternRevision.Strategy;

public class RoadNavigation implements Navigation {

    @Override
    public void navigate(String from, String to) {
        System.out.println("Road Navigation...");
    }
}
