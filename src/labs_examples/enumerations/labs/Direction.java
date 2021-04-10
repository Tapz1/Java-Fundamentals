package labs_examples.enumerations.labs;

public enum Direction {
    NORTH("right way"), EAST("close to right way"), SOUTH("wrong way"), WEST("close to right way");

    private final String description;

    Direction(String s) {
        this.description = s;
    }

    public String getDescription() {
        return description;
    }
}


