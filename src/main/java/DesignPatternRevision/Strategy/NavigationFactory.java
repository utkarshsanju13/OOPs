package DesignPatternRevision.Strategy;

public class NavigationFactory {

    public static Navigation getNavigationStrategy(NavigationType navigationType){

        switch (navigationType){
            case ROAD :
                return new RoadNavigation();
            case WATER :
                return new WaterNavigation();
             default :
                 return null;
        }
    }
}
