package io;


import java.util.*;

public class map {
    public static void main(String aa[] )
    {
        Map<String, Integer> tempMap = new HashMap<String, Integer>();
        tempMap.put("a",12);
        tempMap.put("b",34);
        tempMap.put("c",56);
        Iterator it = tempMap.entrySet().iterator();
        System.out.println(tempMap.get("a"));
        while(it.hasNext()) {
          //  System.out.println(it.next());
            Map.Entry entry = (Map.Entry) it.next();
            String key = (String) entry.getKey();
            int value = (int)entry.getValue();
            System.out.println(key+value);
        }


        List list = new ArrayList();
        list.add(123);
        list.add(456);
        Iterator its =list.iterator();
        while (its.hasNext()) {
            System.out.println(its.next());
        }
    }
}
