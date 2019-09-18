package br.com.brunoxkk0.atj.utils;

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
}
