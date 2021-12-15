package Practices.data;

/**
 * @author Nabil Jarrai
 * @since 12/9/2021
 */
public enum Rating {
    NOT_RATED("\u2606\u2606\u2606\u2606\u2606"),
    ONE_STAR("\u2605\u2606\u2606\u2606\u2606"),
    TWO_STAR("\u2605\u2605\u2606\u2606\u2606"),
    THREE_STAR("\u2605\u2605\u2605\u2606\u2606"),
    FOUR_STAR("\u2605\u2605\u2605\u2605\u2606"),
    FIVE_STAR("\u2605\u2605\u2605\u2605\u2605");
    private String starts;

    Rating(String starts) {
        this.starts = starts;
    }

    public String getStarts() {
        return starts;
    }
}
