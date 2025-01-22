package ChangeMaker;

import java.util.HashMap;
import java.util.Map;

public class Purse {
    private final Map<Denomination, Integer> cash = new HashMap<>();
    double amount = 0.0;


    public void add(Denomination type, int num) {
        cash.put(type, cash.getOrDefault(type, 0) + num);
    }

    public double remove(Denomination type, int num) {
        if (cash.containsKey(type) && cash.get(type) >= num) {
            cash.put(type, cash.get(type) - num);
            return type.amt() * num;
        }
        return 0.0;
    }

    public double getValue() {
        double amt = 0.0;
        for(Map.Entry<Denomination, Integer> entry : cash.entrySet()) {
         amt += entry.getKey().amt() * entry.getValue();
        }
        return amt;
    }

    public String toString() {
        StringBuilder string = new StringBuilder();
        for(Map.Entry<Denomination, Integer> entry : cash.entrySet()) {
            string.append(entry.getKey().name()).append(": ").append(entry.getValue()).append("\n");
        }
        return string.toString();
    }



}


