package class8_2511_ENUM;

public enum Blub {
    blub_5w(5),
    blub_8w(8),
    blub_10w(10),
    blub_12w(12),
    blub_15w(15),
    blub_18w(18),
    blub_24w(24),
    blub_30w(30),
    blub_50w(50),
    blub_100w(100),
    blub_150w(150),
    blub_200w(200);

    private final int watt;

    Blub(int watt) {
        this.watt = watt;
    }

    public double getNormalWatt() {
        return this.watt * 7.5;
    }
}
