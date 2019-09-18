package br.com.brunoxkk0.atj;

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
    }

}
