package Nivell2EX1;

import java.util.Objects;

public class Restaurant {
// Crea una classe anomenada Restaurant amb dos atributs: nom(String) i puntuació(int).
//Implementa els mètodes necessaris perquè no es puguin introduir objectes Restaurant
    //Atributs

    private String nom;
    private int puntuacio;

    public Restaurant(String nom, int puntuacio) {
        this.nom = nom;
        this.puntuacio = puntuacio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return Objects.equals(nom, that.nom) && puntuacio == that.puntuacio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, puntuacio);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "nom='" + nom + '\'' +
                ", puntuacio=" + puntuacio +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(int puntuacio) {
        this.puntuacio = puntuacio;
    }

}






