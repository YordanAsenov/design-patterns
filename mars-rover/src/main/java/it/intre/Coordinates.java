package it.intre;

import lombok.AllArgsConstructor;
import lombok.Getter;

public record Coordinates(int x, int y) {
    public Coordinates incrementX() {
        return new Coordinates(x + 1, y);
    }

    public Coordinates decrementX() {
        return new Coordinates(x - 1, y);
    }

    public Coordinates incrementY() {
        return new Coordinates(x, y + 1);
    }

    public Coordinates decrementY() {
        return new Coordinates(x, y - 1);
    }
}
