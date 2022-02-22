package pr4;

public class Polis<Dk> {
    private String type = "medicine";
    private Dk calculated;

    Polis(Dk calculated) {
        this.calculated = calculated;
        if (calculated.getClass().getTypeName().contains("Integer")) type = "pension";
    }

    public String getType() {
        return type;
    }

    public Dk getCalculated() {
        return calculated;
    }
}
