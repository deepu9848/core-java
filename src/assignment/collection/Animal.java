package assignment.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Animal {
    public static void main(String[] args) {

        String[] Animals = {"Cow", "Goat", "Rabbit"};
        List<String> animalsList = Arrays.asList(Animals);
        System.out.println(animalsList);
       // from Two ArrayList to Single ArrayList
        ArrayList<String> animalsDomestics = new ArrayList<>();
        animalsDomestics.add("Cow");
        animalsDomestics.add("Goat");
        animalsDomestics.add("Rabbit");

        ArrayList<String> animalsWild = new ArrayList<>();
        animalsWild.add("Tiger");
        animalsWild.add("Fox");
        animalsWild.add("Elephant");
        List<String> animalDomestics = null;
        animalDomestics.addAll(animalsWild);
        System.out.println("animalsDomestics and animalsWild: "+ animalDomestics);

    }
}
