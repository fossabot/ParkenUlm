package development.parkenulm;

import java.util.ArrayList;

public class ParkhausDB {
    private static final String[] ParkhausTB = {
            "ze11",
            "ze6",
            "ze2",
            "ze3",
            "ze7",
            "ze4",
            "ze1",
            "ze5",
            "ze9",
            "ze10"
    };

    private static final ArrayList<Parkhaus> ParkhausList = new ArrayList<>();

    /**
     * @return the ParkhausTB
     */
    public static String[] getParkhausTB() {
        return ParkhausTB;
    }

    /**
     * @return the ParkhausDB
     */
    public static ArrayList<Parkhaus> getParkhausDB() {
        ParkhausList.add(new Parkhaus("Am Bahnhof", "540", "540"));
        ParkhausList.add(new Parkhaus("Am Rathaus", "558", "558"));
        ParkhausList.add(new Parkhaus("Deutschhaus", "594", "594"));
        ParkhausList.add(new Parkhaus("Fischerviertel", "395", "395"));
        ParkhausList.add(new Parkhaus("Salzstadel", "530", "530"));
        ParkhausList.add(new Parkhaus("Frauenstraße", "720", "720"));
        ParkhausList.add(new Parkhaus("Basteicenter", "400", "400"));
        ParkhausList.add(new Parkhaus("Maritim Hotel", "235", "235"));
        ParkhausList.add(new Parkhaus("Kornhaus", "135", "135"));
        ParkhausList.add(new Parkhaus("Theater", "80", "80"));
        return ParkhausList;
    }

}