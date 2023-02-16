package Nivell1EX2;

import java.util.ArrayList;

import Nivell1EX1.Month;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//Empra els objectes ListIterator per a llegir els elements de la primera llista
//i inserir-los en la segona.
public class Main {
    public static void main(String[] args) {
        //Crea i emplena un List<Integer>.
        ArrayList<Integer>llistaInt = new ArrayList<Integer>();
        llistaInt.add(34);
        llistaInt.add(84);
        llistaInt.add(72);
        llistaInt.add(8);
        llistaInt.add(88);
        llistaInt.add(99);
        System.out.println(llistaInt);
//Crea un segon List<Integer> i insereix a la segona llista els elements de la
//primera en ordre invers.
        ArrayList <Integer> llistaInt2 = new ArrayList<Integer>();
        //recorrem un for al reves
        for (int i = llistaInt.size() - 1; i >= 0; i--) {
            // Afegim a la nova llista
            llistaInt2.add(llistaInt.get(i));
        }
        //imprimim nova llista
        System.out.println(llistaInt2);
    }

}









