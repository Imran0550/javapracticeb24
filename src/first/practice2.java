package first;

import java.util.Map;

public class practice2 {

    public static Map<String,String> list(Map<String,String>map){

        if(map.containsKey("ice cream")){
            map.put("ice cream","cherry");
        }

        if(map.containsKey("bread") || !map.containsKey("bread")){
            map.put("bread","butter");
        }
return map;
    }
}
/*
Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is present, set its value to "cherry". In all cases, set the key "bread" to have the value "butter".
 */