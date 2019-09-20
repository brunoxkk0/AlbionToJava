package br.com.brunoxkk0.atj;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class AlbionItem {

    @SuppressWarnings("unused")
    enum ItemCategory{
        /*
        Head
         */
        fibergatherer_helmet,
        woodgatherer_helmet,
        leather_helmet,
        plate_helmet,
        hidegatherer_helmet,
        rockgatherer_helmet,
        cloth_helmet,
        oregatherer_helmet,
        fishgatherer_helmet,

        /*
        Main Hand
         */
        firestaff,
        dagger,
        hammer,
        crossbow,
        mace,
        cursestaff,
        bow,
        arcanestaff,
        axe,
        sword,
        spear,
        froststaff,
        naturestaff,
        quarterstaff,
        holystaff,

        /*
        Potion
         */
        potion,
        fishingbait,
        vanity,

        /*
        Armor
         */
        rockgatherer_armor,
        oregatherer_armor,
        leather_armor,
        fibergatherer_armor,
        hidegatherer_armor,
        plate_armor,
        cloth_armor,
        fishgatherer_armor,
        woodgatherer_armor,

        /*
        Bag
         */
        bag,

        /*
        Mount
         */
        rare_mount,
        ridinghorse,
        armoredhorse,
        ox,

        /*
        Shoes
         */
        unique_shoes,
        fibergatherer_shoes,
        rockgatherer_shoes,
        hidegatherer_shoes,
        plate_shoes,
        cloth_shoes,
        fishgatherer_shoes,
        woodgatherer_shoes,
        leather_shoes,
        oregatherer_shoes,

        /*
        Cape
         */
        rockgatherer_backpack,
        oregatherer_backpack,
        fishgatherer_backpack,
        woodgatherer_backpack,
        hidegatherer_backpack,
        cape,
        fibergatherer_backpack,

        /*
        Food
         */
        fish,
        cooked,

        /*
        Off Hand
         */
        shield,
        horn,
        book,
        totem,
        torch,
        orb,

        /*
        Materials
         */
        rock,


        //
        unknown
    }

    private String uniqueName;

    private long tier;
    private long level;

    private ItemCategory itemCategory;

    public AlbionItem(String source){
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = null;

        try{
            jsonObject = (JSONObject) parser.parse(source);
        }catch (Exception ignored){}

        if(jsonObject != null){
            uniqueName = (String) jsonObject.get("uniqueName");
            tier = (long) jsonObject.get("tier");
            level = (long) jsonObject.get("level");

            try{
                itemCategory = ItemCategory.valueOf((String) jsonObject.get("categoryId"));
            }catch (Exception e){
                itemCategory = ItemCategory.unknown;
            }

        }else {
            uniqueName = "T1_ROCK";
            tier = 1;
            itemCategory = ItemCategory.rock;
            level = 0;
        }

    }

    public long getLevel() {
        return level;
    }

    public long getTier() {
        return tier;
    }

    public ItemCategory getItemCategory() {
        return itemCategory;
    }

    public String getUniqueName() {
        return uniqueName;
    }
}
