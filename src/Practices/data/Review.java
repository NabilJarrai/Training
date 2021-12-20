package Practices.data;

/**
 * @author Nabil Jarrai
 * @since 12/14/2021
 */
public class Review implements Comparable<Review> {

    private Rating rating;
    private String comments;

    public Review(Rating rating, String comments) {
        this.rating = rating;
        this.comments = comments;
    }

    public Rating getRating() {
        return rating;
    }

    public String getComments() {
        return comments;
    }

    @Override
    public String toString() {
        return "Review{" +
                "rating=" + rating +
                ", comments='" + comments + '\'' +
                '}';
    }

    @Override
    public int compareTo(Review review) {
        return review.rating.ordinal() - this.rating.ordinal();
    }
}
