package groceryList;

import java.util.HashMap;
import java.util.Map;

public class catagories {
    private String name;
    public HashMap<String, HashMap> contents;
    public catagories(String n, HashMap items){
        this.name = n;
        this.contents = new HashMap<>();
        this.contents.putAll(items);
    }
    public String getName(){
        return this.name;
    }
    public void showItems(){
        this.contents.get("1").name;
    }
}
