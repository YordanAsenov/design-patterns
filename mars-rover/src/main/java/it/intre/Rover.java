package it.intre;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rover {
    private final Coordinates position;
    private final Direction direction;

    public void moveForward() {
        switch (direction) {
            case NORTH -> position.setY(position.getY() + 1);
            case EAST -> position.setX(position.getX() + 1);
            case SOUTH -> position.setY(position.getY() - 1);
            case WEST -> position.setX(position.getX() - 1);
        }
    }
}
