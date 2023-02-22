package Nivell2EX1;

import java.util.*;

//Crea una classe anomenada Restaurant amb dos atributs: nom(String) i puntuació(int).
//Implementa els mètodes necessaris perquè no es puguin introduir objectes Restaurant
// amb el mateix nom i la mateixa puntuació en un HashSet creat en el main() de l’aplicació.
public class Main {
    public static void main(String[] args) {
        HashSet<Restaurant>llistaRestaurant = new HashSet<Restaurant>();
        llistaRestaurant.add(new Restaurant("Casa Pepe",9));
        llistaRestaurant.add(new Restaurant("Can LLuis",10));
        llistaRestaurant.add(new Restaurant("El tropezón",5));
        llistaRestaurant.add(new Restaurant("Via Galicia",9));
        llistaRestaurant.add(new Restaurant("Via Galicia",9));
        llistaRestaurant.add(new Restaurant("Via Galicia",8));

        System.out.println(llistaRestaurant);

        // Ordenem HashSet utilitzant un ArrayList que creem
        List<Restaurant> llistaRestOrdenada = new ArrayList<Restaurant>(llistaRestaurant);
        //ordenem la llista i creem un nou comparador
        Collections.sort(llistaRestOrdenada, new PuntuacioComparator());

        //Ens sortirá primer els noms i desprès els punts més alts en cas de tindre el mateix nom

        //creem un iterator per recòrrer els nostres resultats
        Iterator it=llistaRestOrdenada.iterator();
        while(it.hasNext()){
            Restaurant restaurant=(Restaurant)it.next();
            System.out.println("Nom: " + restaurant.getNom()+", " + ", puntuació: "+restaurant.getPuntuacio());
        }

    }
}
