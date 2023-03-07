package Nivell2EX2;

import Nivell2EX2.Restaurant;

import java.util.Collections;
import java.util.Comparator;

public class PuntuacioComparator implements Comparator {
    //Implementem un comparator creem els objectes
    public int compare(Object obj1, Object obj2) {
        Restaurant rest1 = (Restaurant) obj1;
        Restaurant rest2 = (Restaurant) obj2;
        //Si tenen mateix nom es compara per puntuació
        if(rest1.getNom().equals(rest2)){
            //Comparem puntuacions ,return 1 es la més gran
            if (rest1.getPuntuacio() == rest2.getPuntuacio())
                return 0;
            else if (rest1.getPuntuacio() >= rest2.getPuntuacio())
                return -1;
            else
                return 1;
        } else {
            //Si restaurant 1 és mès gran retornem rest1
            return (rest1.getNom()).
                    compareTo(rest2.getNom());
        }
    }

}
