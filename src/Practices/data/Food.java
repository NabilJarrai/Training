package Practices.data;


import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author Nabil Jarrai
 * @since 12/13/2021
 */
public class Food extends Product {

    private LocalDate bestBefore;

    Food(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore) {
        super(id, name, price, rating);
        this.bestBefore = bestBefore;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
                "bestBefore= " + bestBefore +
                '}';
    }

    @Override
    public Product applyRating(Rating rating) {
        return new Drink(getId(), getName(), getPrice(), rating);
    }


}
