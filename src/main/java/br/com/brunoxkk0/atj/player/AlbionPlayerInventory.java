package br.com.brunoxkk0.atj.player;

import br.com.brunoxkk0.atj.AlbionItem;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;

public class AlbionPlayerInventory {
    private ArrayList<AlbionItem> items;

    public AlbionPlayerInventory(JSONArray source){
        items = new ArrayList<>();

        if(source != null){

            if(source != null && !source.isEmpty()){
                for(Object itm : source){
                    //TODO: add items on inventory;
                }
            }
        }

    }

    public ArrayList<AlbionItem> getItems() {
        return items;
    }
}
