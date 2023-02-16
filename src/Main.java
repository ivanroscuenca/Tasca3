import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Afegeix 11 objectes Month (cadascun amb el seu atribut diferent) en un ArrayList,
        // a excepció de l'objecte amb atribut "Agost".
        ArrayList<Month> llista = new ArrayList<Month>();
        llista.add(new Month("Gener"));
        llista.add(new Month("Febrer"));
        llista.add(new Month("Març"));
        llista.add(new Month("Abril"));
        llista.add(new Month("Maig"));
        llista.add(new Month("Juny"));
        llista.add(new Month("Juliol"));
        llista.add(new Month("Setembre"));
        llista.add(new Month("Octubre"));
        llista.add(new Month("Novembre"));
        llista.add(new Month("Desembre"));

// Després, efectua la inserció en el lloc que correspon a aquest mes
        Month agost = new Month("Agost");
        llista.add(7, agost);

// demostra que l’ArrayList manté l'ordre correcte
        System.out.println("Mesos: " + llista.toString());

//        Converteix l’ArrayList de l’exercici anterior en un HashSet
        HashSet<Month> llistahashSet = new HashSet<Month>(llista);
        //assegura’t que no permet duplicats. Afegeixo 2 mesos repetits
        llistahashSet.add(agost);
        llistahashSet.add(new Month("Juny"));
        //imprimeixo el nombre de mesos i la llista hashSet
        System.out.println("Nombre mesos : " + llistahashSet.size() + ".llistaHashSet " + llistahashSet);

        System.out.println("********************************************************");
        //Recorre la llista amb un for.
        for (Month i : llistahashSet) {
            System.out.println(i);
        }
        System.out.println("********************************************************");
        // Creem iterator
        Iterator<Month> it = llistahashSet.iterator();

        // Imprimim iterator fins que hi hagi per imprimir
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}


