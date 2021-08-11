package com.codecool.dungeoncrawl.logic.actors;

import com.codecool.dungeoncrawl.logic.Cell;

public class Skeleton extends Actor {
    public Skeleton(Cell cell) {
        super(cell);
        setHealth(10);
        setStrength(40);
    }

    @Override
    public String getTileName() {
        return "skeleton";
    }
}
