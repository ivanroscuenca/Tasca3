package N1EX3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

public class Leer {
    public static void readCountriesFromFile(Map<String, String> countries) {
        try {
            File file = new File("/Tasca3/src/N1EX3/countries.txt");
            Scanner entrada = new Scanner(file);

            while (entrada.hasNextLine()) {
                String[] line = entrada.nextLine().split(" ");
                countries.put(line[0].trim(), line[1].trim());
            }

            entrada.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo encontrar el archivo 'countries.txt'");
        }
    }
}
