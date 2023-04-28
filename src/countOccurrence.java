// I certify the code of this lab is entirely my own work,

import java.util.HashMap;
import java.util.Map;

public class countOccurrence{
    private static <T> void count(T[] array) {
        Map<Object, Integer> hp = new HashMap<Object, Integer>();
        int n = array.length;
        for(int i = 0; i < n; i++)
        {
            Object key = array[i];
            if(hp.containsKey(key))
            {
                int freq = hp.get(key);
                freq++;
                hp.put(key, freq);
            }
            else
            {
                hp.put(key, 1);
            }
        }
        for(Map.Entry<Object, Integer> val : hp.entrySet())
        {
            System.out.println(val.getKey()+ " : " +val.getValue());
        }
    }
    public static void main(String[] args) {
        String s = "It's okay not to be okay";
        Object [] arr =s.split("\\s");
        count(arr);
    }
}


