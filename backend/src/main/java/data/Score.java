package data;

public enum Score {
    NULL(0),
    EINS(1),
    ZWEI(2),
    DREI(3),
    VIER(4),
    FUENF(5),
    SECHS(6),
    SIEBEN(7),
    ACHT(8),
    NEUN(9),
    ZEHN(10),
    ELF(11),
    ZWOELF(12),
    DREIZEHN(13),
    VIERZEHN(14),
    FUENFZEHN(15),
    SECHSZEHN(16),
    SIEBZEHN(17),
    ACHTZEHN(18),
    NEUNZEHN(19),
    ZWANZIG(20),
    BULL(25);
    private final int value;

    Score(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
