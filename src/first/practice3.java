package first;

import java.util.Map;

public class practice3 {
    public static void main(String[] args) {




    }

    public static  Map<String, String> bully(Map<String,String> map){

        if(map.containsKey("a")){
            map.put("b",map.get("a"));

        }
        if(map.containsKey("c")){
            map.remove("c");
        }

        return map;
    }
}
/**
 * Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.
 */
