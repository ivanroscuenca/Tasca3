package N1EX3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public abstract class Main extends N1EX3.Leer {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<String, String>();
        readCountriesFromFile(countries);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduiu el nom d'usuari: ");
        String usuario = "";
        usuario = entrada.nextLine();
        int score = 0;

        for (int i = 0; i < 10; i++) {
            String randomCountry = N1EX3.GetCountries.getRandomCountry(countries);
            String capital = countries.get(randomCountry);
            System.out.println("¿Cual es la capital de : "+randomCountry+"?");
            String userAnswer = entrada.nextLine().trim();

            if (userAnswer.equalsIgnoreCase(capital)) {
                score++;
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Incorrecto. La capital de "+ randomCountry+ " es "+ capital);
            }
            System.out.println("La puntuación total es " + score);
        }

        N1EX3.EscribirArchivo.writeScoreToFile(usuario, score);
    }

}

