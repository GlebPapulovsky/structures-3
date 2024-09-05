package ru.netology;

import java.util.HashMap;
import java.util.Map;

public class Offers {
    private Map<String, Integer> nameAndPriceMap = new HashMap();

    public Offers() {
        this.nameAndPriceMap.put("Milk", 66);
        this.nameAndPriceMap.put("Bread", 40);
        this.nameAndPriceMap.put("Eggs", 120);
        this.nameAndPriceMap.put("Wings", 999);
        this.nameAndPriceMap.put("PotionOfSuperPower", 10000);
    }

    public Map.Entry<String, Integer> getOfferByuIndex(int index) {
        if (index < 0 || index + 1 > nameAndPriceMap.size())
            throw new IllegalArgumentException("Wrong index.It's cant be less then zero!");
        int iter = 0;
        for (Map.Entry<String, Integer> entry : nameAndPriceMap.entrySet()) {
            if (index == iter) return entry;
            iter++;
        }

        return null;

    }


    @Override
    public String toString() {
        StringBuilder outputBuilder = new StringBuilder();
        //magic number
        int counter = 0;
        for (Map.Entry<String, Integer> entry : nameAndPriceMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            outputBuilder.append((counter + 1) + ". Name: " + key + " Price: " + value + "\n");
            counter++;
        }
        return outputBuilder.toString();
    }
}
