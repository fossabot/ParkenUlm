package development.parkenulm;

import java.util.ArrayList;

import io.paperdb.Paper;


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


    public static void initTableDB() {
        if (!Paper.book().contains("TableDB")) {
            Paper.book().write("TableDB", ParkhausTB);
        }
    }

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
        ParkhausList.add(new Parkhaus("Congress Centrum Nord / Basteicenter", "?", "?"));
        ParkhausList.add(new Parkhaus("Congress Centrum Süd / Maritim Hotel", "?", "?"));
        ParkhausList.add(new Parkhaus("Kornhaus", "?", "?"));
        ParkhausList.add(new Parkhaus("Theater", "?", "?"));
        return ParkhausList;
    }

    public static ArrayList<Parkhaus> resetDB() {
        Paper.book().write("TableDB", getParkhausDB());
        return getParkhausDB();
    }
}