package com.codecool.dungeoncrawl.logic.utils.items;

import com.codecool.dungeoncrawl.logic.utils.Cell;

public class Sword extends Item{

    public Sword(Cell cell) { super(cell,"sword"); }

    public String getTileName() {
        return "sword";
    }

}
