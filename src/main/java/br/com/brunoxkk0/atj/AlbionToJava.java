package br.com.brunoxkk0.atj;

import br.com.brunoxkk0.atj.player.AlbionPlayer;
import br.com.brunoxkk0.atj.player.UtilsPlayer;
import br.com.brunoxkk0.atj.utils.RequestUtils;
import br.com.brunoxkk0.atj.utils.Utils;


public class AlbionToJava {

    public static String getGameStatus(){
        String request = RequestUtils.get("http://live.albiononline.com/status.txt");

        if(request != null){
            return Utils.statusParse(request);
        }

        return "Fail";
    }

    public static void main(String[] args){
        System.out.println(getGameStatus());
        System.out.println(UtilsPlayer.getId("brunoxkk0"));

        String request = RequestUtils.get("https://gameinfo.albiononline.com/api/gameinfo/items/T8_MEAL_STEW/data");

        if(request != null){
            AlbionItem item = new AlbionItem(request);

            System.out.println(item.getItemCategory());
            System.out.println(item.getLevel());
            System.out.println(item.getTier());
            System.out.println(item.getUniqueName());
        }

        AlbionPlayer albionPlayer = new AlbionPlayer(UtilsPlayer.getId("brunoxkk0"));

        if(albionPlayer != null){
            System.out.println(albionPlayer.getAverageItemPower());
            System.out.println(albionPlayer.getEquipments().toString());
            System.out.println(albionPlayer.getGuildId());
            System.out.println(albionPlayer.getGuildName());
            System.out.println(albionPlayer.getName());
            System.out.println(albionPlayer.getInventory().toString());
            System.out.println(albionPlayer.getId());

        }
    }

}
