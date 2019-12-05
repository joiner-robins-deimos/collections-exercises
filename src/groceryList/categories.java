package groceryList;

import java.util.HashMap;
import java.util.Map;

public class categories {
    private String name;
    public HashMap<String, HashMap> contents;
    public categories(String n, HashMap items){
        this.name = n;
        this.contents = new HashMap<>();
        this.contents.putAll(items);
    }
    public String getName(){
        return this.name;
    }
    public void showItems(){
//        this.contents.get("1").name;
    }
}
