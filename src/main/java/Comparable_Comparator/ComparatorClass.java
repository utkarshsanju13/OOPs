package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie{
    int id;
    String name;
    int rating;

    public Movie(int id, String name, int rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    public String toString() {
        return this.id + " " + this.name + " " + this.rating;
    }
}

class RatingComparator implements Comparator<Movie>{


    @Override
    public int compare(Movie m1, Movie m2) {
        if(m1.rating == m2.rating){
            return 0;
        }else if(m1.rating > m2.rating){
            return 1;
        }

        return -1;
    }
}

class MovieNameComparator implements Comparator<Movie>{

    @Override
    public int compare(Movie m1, Movie m2) {
        return m1.name.compareTo(m2.name);
    }
}

    public class ComparatorClass {

        public static void main(String[] args) {
            Movie m1 = new Movie(1,"bhoot",2);
            Movie m2 = new Movie(2,"ddlj",3);
            Movie m3 = new Movie(3,"mlk",1);

            ArrayList<Movie> arr = new ArrayList<>();
            arr.add(m1);
            arr.add(m2);
            arr.add(m3);
            System.out.println("----------------------------- Sorting on the basis of Rating-------------------------");
            System.out.println("Before Sorting-------------------------");
            for(Movie m: arr){
                System.out.println(m.toString());
            }

            System.out.println("After Sorting-------------------------");

            Collections.sort(arr, new RatingComparator());

            for(Movie m: arr){
                System.out.println(m.toString());
            }

            System.out.println("----------------------------- Sorting on the basis of MovieName-------------------------");

            System.out.println("Before Sorting-------------------------");
            for(Movie m: arr){
                System.out.println(m.toString());
            }

            System.out.println("After Sorting-------------------------");

            Collections.sort(arr, new MovieNameComparator());

            for(Movie m: arr){
                System.out.println(m.toString());
            }

        }

    }
