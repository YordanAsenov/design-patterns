package it.intre;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rover {
    private final Coordinates initialPosition;
    private final Direction direction;
}
