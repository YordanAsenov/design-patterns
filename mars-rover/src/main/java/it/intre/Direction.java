package it.intre;

public enum Direction {
    NORTH('N'), EAST('E'), SOUTH('S'), WEST('W');
    public final char key;

    Direction(char key) {
        this.key = key;
    }

    public static Direction valueByKey(char key) {
        for (Direction d: values()) {
            if (d.key == key) {
                return d;
            }
        }
        return null;
    }
}
