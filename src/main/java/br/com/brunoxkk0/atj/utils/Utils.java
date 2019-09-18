package br.com.brunoxkk0.atj.utils;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.util.Arrays;

public class Utils {

    public static String statusParse(String string){
        String aux = string;
        String[] values;

        aux = aux.replace("{ ","").replace(" }","");
        values = aux.split(", ");

        for(int i = 0; i < values.length; i++){
            //This is necessary, because have 3 unsupported characters on string start
            if(values[i].split(": ")[0].replace("\"","").substring(3).equals("status")){
                return values[i].split(": ")[1].replace("\"","");
            }
        }

        return "fail";
    }

    public static String playerSearch(String source, String player){

        JSONParser parser = new JSONParser();
        JSONObject jsonObject = null;

        try{
            jsonObject = (JSONObject) parser.parse(source);;
        }catch (Exception ignored){}
        
        if(jsonObject != null){
            JSONArray players = (JSONArray) jsonObject.get("players");

            for(int i = 0; i < players.size(); i++){
                JSONObject jsonObject1 = (JSONObject) players.get(i);

                if(jsonObject1 != null){
                    if(((String)jsonObject1.get("Name")).equalsIgnoreCase(player)){
                        return (String) jsonObject1.get("Id");
                    }
                }

            }
        }

        return null;
    }
}
