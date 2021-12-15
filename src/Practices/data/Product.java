package Practices.data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import static java.math.RoundingMode.HALF_UP;

/**
 * @author Nabil Jarrai
 * @since 12/13/2021
 */
public abstract class Product implements Rateable<Product> {
    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);
    private int id;
    private String name;
    private BigDecimal price;
    private Rating rating;

    Product(int id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

//    Product(int id, String name, BigDecimal price) {
//        this(id, name, price, NOT_RATED);
//    }


    public BigDecimal getDiscount() {
        return price.multiply(DISCOUNT_RATE.setScale(2, HALF_UP));
    }

    //    Product() {
//        this(0, "no name", BigDecimal.ZERO, NOT_RATED);
//    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price= " + price +
                ", rating= " + rating.getStarts();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return id == product.id && name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscountRate() {
        return price.multiply(DISCOUNT_RATE).setScale(2, HALF_UP);
    }

    @Override
    public Rating getRating() {
        return rating;
    }

    public LocalDate getBestBefore() {
        return LocalDate.now();
    }

}
