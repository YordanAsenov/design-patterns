package it.intre.rover;

import it.intre.Coordinates;
import it.intre.Direction;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rover {
    private final Coordinates position;
    private final Direction direction;

    public void moveForward() {
        direction.status.moveForward(this);
    }
}
