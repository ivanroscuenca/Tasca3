package Nivell2EX1;

import java.util.*;

//Crea una classe anomenada Restaurant amb dos atributs: nom(String) i puntuació(int).
//Implementa els mètodes necessaris perquè no es puguin introduir objectes Restaurant
// amb el mateix nom i la mateixa puntuació en un HashSet creat en el main() de l’aplicació.
public class Main {
    public static void main(String[] args) {
        Set<Restaurant> llistaRestaurant = new HashSet<Restaurant>();
        llistaRestaurant.add(new Restaurant("Casa Pepe", 9));
        llistaRestaurant.add(new Restaurant("Can LLuis", 10));
        llistaRestaurant.add(new Restaurant("El tropezón", 5));
        llistaRestaurant.add(new Restaurant("Via Galicia", 9));
        llistaRestaurant.add(new Restaurant("Via Galicia", 9));
        llistaRestaurant.add(new Restaurant("Via Galicia", 8));

        System.out.println(llistaRestaurant);

    }

}
