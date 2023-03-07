package N1EX3;

import java.util.Map;
import java.util.Random;

public class GetCountries {
    public static String getRandomCountry(Map<String, String> countries) {
        Random random = new Random();
        int index = random.nextInt(countries.size());
        return (String) countries.keySet().toArray()[index];
    }
}
