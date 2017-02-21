package etl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Etl {

    public Map<String, Integer> transform(Map<Integer, List<String>> old) {

        Map<String, Integer> newMap = new HashMap<>();

        for (Map.Entry<Integer, List<String>> entry : old.entrySet()) {
            int points = entry.getKey();
            for (String letter : entry.getValue()) {
                String toLower = letter.toLowerCase();
                newMap.put(toLower, points);
            }
        }
        return newMap;
    }
}
