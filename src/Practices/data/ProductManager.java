package Practices.data;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

/**
 * @author Nabil Jarrai
 * @since 12/13/2021
 */
public class ProductManager {
    private Locale locale;
    private ResourceBundle resources;
    private DateTimeFormatter dateFormat;
    private NumberFormat moneyFormat;
    private Map<Product, List<Review>> products = new HashMap<>();
//    private Product product;
//    private Review[] reviews = new Review[5];

    public ProductManager(Locale locale) {
        this.locale = locale;
        resources = ResourceBundle.getBundle("practices.data.resources", locale);
        dateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).localizedBy(locale);
        moneyFormat = NumberFormat.getCurrencyInstance(locale);
    }

    public Product createProduct(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore) {
        Product product = new Food(id, name, price, rating, bestBefore);
        products.putIfAbsent(product, new ArrayList<>());
        return product;
    }

    public Product createProduct(int id, String name, BigDecimal price, Rating rating) {
        Product product = new Drink(id, name, price, rating);
        products.putIfAbsent(product, new ArrayList<>());
        return product;
    }

    public Product reviewProduct(int id, Rating rating, String comment) {
        return reviewProduct(findProduct(id), rating, comment);
    }

    public Product reviewProduct(Product product, Rating rating, String comment) {
        List<Review> reviews = products.get(product);
        products.remove(product);
        reviews.add(new Review(rating, comment));
        int sum = 0;
        for (Review review : reviews) {
            sum += review.getRating().ordinal();
        }
        product = product.applyRating(Rateable.convert(Math.round((float) sum / reviews.size())));
        products.putIfAbsent(product, reviews);
        return product;
    }

    public void printProductReport(int id) {
        printProductReport(findProduct(id));
    }

    public void printProductReport(Product product) {
        List<Review> reviews = products.get(product);
        StringBuilder txt = new StringBuilder();
        txt.append(MessageFormat.format(resources.getString("product"), product.getName(), moneyFormat.format(product.getPrice()), product.getRating().getStarts(), dateFormat.format(product.getBestBefore())));
        txt.append('\n');
        Collections.sort(reviews);
        for (Review review : reviews) {
            txt.append(MessageFormat.format(resources.getString("review"), review.getRating().getStarts(), review.getComments()));
            txt.append('\n');
        }
        if (reviews.isEmpty()) {
            txt.append(resources.getString("no.reviews"));
            txt.append('\n');
        }
        System.out.println(txt);
    }

    public Product findProduct(int id) {
        Product result = null;
        for (Product product : products.keySet()) {
            if (product.getId() == id) {
                result = product;
                break;
            }
        }
        return result;
    }
}
