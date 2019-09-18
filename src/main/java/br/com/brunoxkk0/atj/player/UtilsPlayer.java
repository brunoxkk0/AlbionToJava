package br.com.brunoxkk0.atj.player;

import br.com.brunoxkk0.atj.utils.RequestUtils;
import br.com.brunoxkk0.atj.utils.Utils;

public class UtilsPlayer {

    public static String getId(String nick){

        String request = RequestUtils.get("https://gameinfo.albiononline.com/api/gameinfo/search?q=" + nick);

        if(request != null){
            return Utils.playerSearch(request, nick);
        }

        return null;
    }

}
