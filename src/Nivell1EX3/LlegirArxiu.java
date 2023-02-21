package Nivell1EX3;

import java.io.*;
import java.util.*;

//clase LlegirArxiu
class LlegirArxiu {
    //metode per llegir arxiu
    public void Llegir() throws IOException {
        //Atributs
        String[] paraules = new String[2];
        String linea = "";
        //creem el hashmap
        HashMap<String, String> llista = new HashMap<>();
        try {
            //Creem objecte filereader i bufferedReader
            FileReader lectura = new FileReader("/home/ivan/Escritorio/Tasca3/src/Nivell1EX3/countries.txt");
            BufferedReader buffer_lectura = new BufferedReader(lectura);
            //LLegim
            do {
                linea = buffer_lectura.readLine();
                if (linea != null) {
                    //dividim paraules en 2 paraules diferents quan estan separats per " "
                    paraules = linea.split(" ");
                }
                //recorrem un for i posem les paraules en la llista hashmap
                for (int i = 0; i < paraules.length; i++) {
                    llista.put(paraules[0], paraules[1]);
                    //convertim els objectes de l'array en String
                    Arrays.toString(paraules);
                }
            } while (linea != null);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //Creem variables puntuacio i repeticions
        int puntuacio = 0;
        int repeticions = 0;


//  El programa demana el nom de l’usuari/ària i el gravem
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduiu el nom d'usuari: ");
        String nomUsuari = "";
        nomUsuari = entrada.nextLine();
        do {
            //després ha de mostrar un país de forma aleatòria, guardat en el HashMap.
            //Numero aleatori maxim mida del hashmap llista
            int size = llista.size();
            int numAleatori = new Random().nextInt(size);
            //Creem objecte obtenim de la llista keyset() els paisos llegim amb toArray()[numAleatori]
            Object numberKey = llista.keySet().toArray()[numAleatori];
            //Obtenim el value i el passem a String
            String numberValue = (String) llista.values().toArray()[numAleatori];
            //Imprimim el pais escollit a l'atzar
            System.out.println(numberKey);

//  Es tracta de què l’usuari/ària ha d’escriure el nom de la capital del país en qüestió.
//  Si l’encerta se li suma un punt. Aquesta acció es repeteix 10 vegades.
//  Un cop demanades les capitals de 10 països de forma aleatòria, llavors s’ha de guardar
//  en un fitxer anomenat classificacio.txt, el nom de l’usuari/ària i la seva puntuació.
            System.out.println("Introduiu el nom de la capital:");
            String nomCapital = entrada.nextLine();
            if (!Objects.equals(numberValue, nomCapital)) {
                repeticions++;
                System.out.println("Incorrecte");
                System.out.println("Numero de intents : " + repeticions);
                System.out.println("El nom de la capital: " + numberValue);
                System.out.println("Has dit: " + nomCapital);

            } else {
                puntuacio++;
                repeticions++;
                System.out.println("Correcte");
                System.out.println("Numero de intents : " + repeticions);
                System.out.println("El nom de la capital : " + numberValue);
                System.out.println("Has dit :" + nomCapital);

            }

        } while (repeticions < 10);
        System.out.println("Marcador total : " + puntuacio);
        System.out.println("Numero de intents totals : " + repeticions);

//llavors s’ha de guardar en un fitxer anomenat classificacio.txt, el nom de l’usuari/ària i la seva puntuació.


        try {
            //Creem objecte fileWriter i bufferedWriter
            FileWriter escritura = new FileWriter("/home/ivan/Escritorio/Tasca3/src/Nivell1EX3/classificacio.txt", true);
            BufferedWriter bufferescritura = new BufferedWriter(escritura);
            escritura.write(nomUsuari + ".Puntuació total: " + puntuacio);
            escritura.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}

