package it.intre;

public record Planet(int maxLatitude, int maxLongitude) {

    public Coordinates getNextCoordinates(Coordinates currentPosition, Direction directionMoving) {
        Coordinates nextCoordinates = directionMoving.nextCoordinates(currentPosition);
        return wrapToPlanet(nextCoordinates);
    }

    private Coordinates wrapToPlanet(Coordinates nextCoordinates) {
        int y = (nextCoordinates.y() + maxLatitude) % maxLatitude;
        int x = (nextCoordinates.x() + maxLongitude) % maxLongitude;
        return new Coordinates(x, y);
    }
}
