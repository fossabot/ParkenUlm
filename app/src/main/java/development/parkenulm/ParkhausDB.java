package development.parkenulm;

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


    public static void initTableDB() {
        if (!Paper.book().contains("TableDB")) {
            Paper.book().write("TableDB", ParkhausTB);
        }
    }

    /**
     * @return the ParkhausDB
     */
    public static String[] getParkhausTB() {
        return ParkhausTB;
    }

}