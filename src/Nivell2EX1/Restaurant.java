package Nivell2EX1;

import java.util.Comparator;
import java.util.Objects;

public class Restaurant {
// Crea una classe anomenada Restaurant amb dos atributs: nom(String) i puntuació(int).
//Implementa els mètodes necessaris perquè no es puguin introduir objectes Restaurant
    //Atributs

    private String nom;
    private int puntuacio;

    public String getNom() {
        return nom;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(int puntuacio) {
        this.puntuacio = puntuacio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return puntuacio == that.puntuacio && nom.equals(that.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, puntuacio);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "nom='" + nom + '\'' +
                ", puntuacio=" + puntuacio +
                '}';
    }

    public Restaurant(String nom, int puntuacio) {
        this.nom = nom;
        this.puntuacio=puntuacio;
    }
}
//    Utilitzant la classe del programa anterior, crea la implementació necessària perquè els objectes
//    de la classe Restaurant estiguin ordenats per nom i per puntuació en ordre ascendent.

