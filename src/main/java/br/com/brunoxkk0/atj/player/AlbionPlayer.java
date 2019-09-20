package br.com.brunoxkk0.atj.player;

import br.com.brunoxkk0.atj.utils.RequestUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class AlbionPlayer {

    private double averageItemPower = 0.0F;

    private String name = "";
    private String id = "";

    private String guildName = "";
    private String guildId = "";

    private AlbionPlayerInventory inventory = null;
    private AlbionPlayerEquipments equipments = null;

    public AlbionPlayer(String id){
        String request = RequestUtils.get("https://gameinfo.albiononline.com/api/gameinfo/players/" + id);

        JSONParser parser = new JSONParser();
        JSONObject jsonObject = null;

        try{
            jsonObject = (JSONObject) parser.parse(request);
        }catch (Exception ignored){}

        if(jsonObject != null){

            averageItemPower = (double) jsonObject.get("AverageItemPower");

            name = (String) jsonObject.get("Name");
            this.id = id;

            guildName = (String) jsonObject.get("GuildName");
            guildId = (String) jsonObject.get("GuildId");

            equipments = new AlbionPlayerEquipments((JSONObject) jsonObject.get("Equipment"));
            inventory = new AlbionPlayerInventory((JSONArray) jsonObject.get("Inventory"));

        }

    }

    public String getName() {
        return name;
    }

    public AlbionPlayerEquipments getEquipments() {
        return equipments;
    }

    public AlbionPlayerInventory getInventory() {
        return inventory;
    }

    public double getAverageItemPower() {
        return averageItemPower;
    }

    public String getGuildId() {
        return guildId;
    }

    public String getGuildName() {
        return guildName;
    }

    public String getId() {
        return id;
    }

}
