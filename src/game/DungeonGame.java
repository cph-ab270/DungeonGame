package game;

import libs.form.Form;

/**
 * Created by Ejdems on 10/10/2016.
 */
public class DungeonGame {
    private static Form form = new Form();
    static {
        form.addContinue("test","Test");
        form.addNumber("tesst","Test").setRange(10,20).setRequired(true);
    }

    public static void main(String[] args) throws Exception {
        DungeonMap map = new DungeonMap();
        map.createDungeonMap();
    }
}
