package first;

import java.util.Map;

public class practice4 {


    public static Map<String,String>map(Map<String,String> stringMap){

        if(stringMap.containsKey("a") && stringMap.containsKey("b")){
            stringMap.put("ab",stringMap.get("a")+stringMap.get("b"));
        }
return stringMap;
    }
}
/*
Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys. If both keys are present, append their 2 string values together and store the result under the key "ab".
 */