public enum Wood {
    ROSEWOOD, MAPLE, ALDER;

    public String toString() {
        switch (this) {
            case ROSEWOOD:
            return "Rosewood";
            case MAPLE:
            return "Maple";
            case ALDER:
            return "Alder";
            default:
            return "n/a";
        }
    }
}