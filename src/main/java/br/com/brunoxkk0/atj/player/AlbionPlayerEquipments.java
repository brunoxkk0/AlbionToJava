package br.com.brunoxkk0.atj.player;

import br.com.brunoxkk0.atj.AlbionItem;
import org.json.simple.JSONObject;

import java.util.HashMap;

public class AlbionPlayerEquipments {

    enum Equipment{
        MainHand, OffHand, Head, Armor, Shoes, Bag, Cape, Mount, Potion, Food
    }

    private HashMap<Equipment, AlbionItem> equipment;

    public AlbionPlayerEquipments(JSONObject source){
        equipment = new HashMap<>();

        if(source != null && source.get("Equipment") != null){
            for (Equipment s : Equipment.values()){
                if(source.get(s) != null){
                    //TODO: Add items on map
                }else {
                    equipment.put(s, null);
                }
            }
        }else {
            for (Equipment s : Equipment.values()){
                equipment.put(s, null);
            }
        }

    }

    public HashMap<Equipment, AlbionItem> getEquipment() {
        return equipment;
    }
}
