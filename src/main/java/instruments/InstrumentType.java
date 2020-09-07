package instruments;

public enum InstrumentType {

    STRING(1),
    KEYBOARD(2),
    WOODWIND(3),
    DRUM(4),
    BRASS(5),
    LAMELLOPHONE(6);

    private final int value;


    InstrumentType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
