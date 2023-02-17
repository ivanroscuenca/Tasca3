package Nivell1EX2;

import java.util.*;

import Nivell1EX1.Month;

import java.util.ArrayList;

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
        llistaInt.add(66);
        System.out.println(llistaInt);
//Crea un segon List<Integer> i insereix a la segona llista els elements de la
//primera en ordre invers.
//        ArrayList <Integer> llistaInt2 = new ArrayList<Integer>();
//        //recorrem un for al reves
//        for (int i = llistaInt.size() - 1; i >= 0; i--) {
//            // Afegim a la nova llista
//            llistaInt2.add(llistaInt.get(i));
//        }
//        //imprimim nova llista
//        System.out.println(llistaInt2);

//Empra els objectes ListIterator per a llegir els elements de la primera llista
//i inserir-los en la segona.
        ArrayList<Integer>llistaInt2 = new ArrayList<Integer>();
        //Creem listIterator de la mida de la llista1
        int mida = llistaInt.size();
        ListIterator<Integer> listiterator =llistaInt.listIterator(mida);
        //recorrem llista primera de darrera a endavant i afegim a llista2
        while(listiterator.hasPrevious()){
            llistaInt2.add(listiterator.previous());  ;
        }
        //imprimim llistaint2
            System.out.println(llistaInt2);
        }
    }










