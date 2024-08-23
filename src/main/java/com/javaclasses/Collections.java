package com.javaclasses;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Collections {

    public void mapConcept(){
        Map<String,String> map=new LinkedHashMap<>();
        map.put("Name","Sai");
        map.put("Address",null);
        map.put("Emp No","5214582");
        map.put("Name1",null);
        map.put(null,null);
        map.put(null,"null122");
        System.out.println(map);
    }
}
