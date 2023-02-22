package Nivell2EX1;

import java.util.Collections;
import java.util.Comparator;

public class PuntuacioComparator implements Comparator {

    public int compare(Object obj1, Object obj2) {
        Restaurant rest1 = (Restaurant) obj1;
        Restaurant rest2 = (Restaurant) obj2;

        if(rest1.getNom().equals(rest2)){

        if (rest1.getPuntuacio() == rest2.getPuntuacio())
            return 0;
        else if (rest1.getPuntuacio() >= rest2.getPuntuacio())
            return -1;
        else
            return 1;
    } else {
            return (rest1.getNom()).
                    compareTo(rest2.getNom());
            }
        }

}

