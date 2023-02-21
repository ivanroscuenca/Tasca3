package Nivell1EX3;
//Donat el fitxer countrties.txt (revisa l'apartat recursos) que conté països i capitals.

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//El programa demana el nom de l’usuari/ària, i després ha de mostrar un país de forma
//aleatòria, guardat en el HashMap. Es tracta de què l’usuari/ària ha d’escriure el nom
//de la capital del país en qüestió. Si l’encerta se li suma un punt. Aquesta acció
//es repeteix 10 vegades. Un cop demanades les capitals de 10 països de forma aleatòria,
//llavors s’ha de guardar en un fitxer anomenat classificacio.txt, el nom de l’usuari/ària
//i la seva puntuació.
public class Main {
    public static void main(String[] args) throws IOException {
//creem instancia
        LlegirArxiu acces=new LlegirArxiu();
//Truquem al mètode
        acces.Llegir();
    }
}


