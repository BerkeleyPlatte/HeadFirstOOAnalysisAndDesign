public enum Builder {

    FENDER, MARTIN, GIBSON, EPIPHONE, TAYLOR;

    public String toString() {
        switch (this) {
            case FENDER:
            return "Fender";
            case MARTIN:
            return "Martin";
            case GIBSON:
            return "Gibson";
            case EPIPHONE:
            return "Epiphone";
            case TAYLOR:
            return "Taylor";
            default:
            return "n/a";
        }
    }
}