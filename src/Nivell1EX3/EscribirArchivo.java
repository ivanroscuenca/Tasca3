package N1EX3;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo {
    public static void writeScoreToFile(String userName, int score) {
        try {
            FileWriter writer = new FileWriter("/Tasca3/src/N1EX3/classificacio.txt", true);
            writer.write(userName + "," + score + ".\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("No se pudo escribir en el archivo 'classificacio.txt'");
            e.printStackTrace();
        }
    }
}
