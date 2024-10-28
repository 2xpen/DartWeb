package data;

public enum Trefferart {
    SINGLE(1),
    DOUBLE(2),
    TRIPPLE(3);
    private final int value;

    Trefferart(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
