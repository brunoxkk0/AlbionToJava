package br.com.brunoxkk0.atj;

import br.com.brunoxkk0.atj.utils.RequestUtils;
import br.com.brunoxkk0.atj.utils.Utils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class AlbionToJava {

    public static String getGameStatus(){
        String request = RequestUtils.get("http://live.albiononline.com/status.txt");
        return Utils.statusParse(request);
    }

    public static void main(String[] args){
        System.out.println(getGameStatus());
    }

}
