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
        ParkhausList.add(new Parkhaus("Am Bahnhof", "?", "?"));
        ParkhausList.add(new Parkhaus("Am Rathaus", "?", "?"));
        ParkhausList.add(new Parkhaus("Deutschhaus", "?", "?"));
        ParkhausList.add(new Parkhaus("Fischerviertel", "?", "?"));
        ParkhausList.add(new Parkhaus("Salzstadel", "?", "?"));
        ParkhausList.add(new Parkhaus("Frauenstraße", "?", "?"));
        ParkhausList.add(new Parkhaus("Basteicenter", "?", "?"));
        ParkhausList.add(new Parkhaus("Maritim Hotel", "?", "?"));
        ParkhausList.add(new Parkhaus("Kornhaus", "?", "?"));
        ParkhausList.add(new Parkhaus("Theater", "?", "?"));
        return ParkhausList;
    }

}