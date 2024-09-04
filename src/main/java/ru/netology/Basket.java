package ru.netology;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    private Map<String,Integer> basket=new HashMap<>();

    public void putItem(Map.Entry<String,Integer>entry){
        basket.put(entry.getKey(), entry.getValue());
    }
    public void deleteItemByIndex(int index){
        if (index<0 ||index+1 >basket.size())throw new IllegalArgumentException("Index cant be more then bnhaskets size or less then zero!");
        int iterator=0;
        for (Map.Entry<String,Integer>entry:basket.entrySet()){
            if (iterator==index){
                basket.remove(entry.getKey(),entry.getValue());
            }
            iterator++;
        }
    }


    @Override
    public String toString() {
        if (basket.size()==0)return "Empty";
        StringBuilder outputBuilder=new StringBuilder();
        //magic number
        int counter=0;
        for (Map.Entry<String, Integer> entry : basket.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            outputBuilder.append((counter+1)+". Name: "+key+" Price: "+value+"\n");
            counter++;
        }
        return outputBuilder.toString() ;

    }
}
