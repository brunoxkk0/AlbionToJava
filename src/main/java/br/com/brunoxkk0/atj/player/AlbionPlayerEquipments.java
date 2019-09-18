package br.com.brunoxkk0.atj.player;

import java.util.HashMap;

public class AlbionPlayerEquipments {

    enum Equipment{
        MAIN_HAND, OFF_HAND, HEAD, ARMOR, SHOES, BAG, CAPE, MOUNT, POTION, FOOD
    }

    public HashMap<Equipment, String> equipment;
}
