package Practices.app;

import Practices.data.ProductManager;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Locale;

import static Practices.data.Rating.*;

/**
 * @author Nabil Jarrai
 * @since 12/9/2021
 */
public class Shop {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager(Locale.ITALY);

        productManager.createProduct(101, "Tea", BigDecimal.valueOf(1.99), NOT_RATED);
        productManager.printProductReport(101);
        productManager.reviewProduct(101, FOUR_STAR, "Nice hot cup of tea");
        productManager.reviewProduct(101, TWO_STAR, "Rather weak tea");
        productManager.reviewProduct(101, FOUR_STAR, "Fine tea");
        productManager.reviewProduct(101, FOUR_STAR, "Good tea");
        productManager.reviewProduct(101, FIVE_STAR, "Perfect tea");
        productManager.reviewProduct(101, THREE_STAR, "Just add some lemon");
        productManager.printProductReport(101);

        productManager.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), NOT_RATED);
        productManager.reviewProduct(102, THREE_STAR, "Coffee was ok");
        productManager.reviewProduct(102, ONE_STAR, "where is the milk ?!");
        productManager.reviewProduct(102, FIVE_STAR, "it's perfect with ten spoons of sugar!");
        productManager.printProductReport(102);

        productManager.createProduct(103, "Cake", BigDecimal.valueOf(3.99), NOT_RATED, LocalDate.now().plusDays(2));
        productManager.reviewProduct(103, FIVE_STAR, "very nice Cake");
        productManager.reviewProduct(103, FOUR_STAR, "it's good, but i've expected more chocolate");
        productManager.reviewProduct(103, FIVE_STAR, "this cake is perfect");
        productManager.printProductReport(103);

        productManager.createProduct(104, "Cookie", BigDecimal.valueOf(2.99), NOT_RATED, LocalDate.now());
        productManager.reviewProduct(104, THREE_STAR, "Just another cookie");
        productManager.reviewProduct(104, THREE_STAR, "Ok");
        productManager.printProductReport(104);

        productManager.createProduct(105, "Hot Chocolate", BigDecimal.valueOf(2.99), NOT_RATED);
        productManager.reviewProduct(105, FOUR_STAR, "Tasty !");
        productManager.reviewProduct(105, THREE_STAR, "Not bad at all");
        productManager.printProductReport(105);

        productManager.createProduct(106, "Chocolate", BigDecimal.valueOf(2.50), NOT_RATED, LocalDate.now().plusDays(3));
        productManager.reviewProduct(106, TWO_STAR, "Too sweet");
        productManager.reviewProduct(106, THREE_STAR, "Better than cookie");
        productManager.reviewProduct(106, TWO_STAR, "Too bitter");
        productManager.reviewProduct(106, ONE_STAR, "I don't get it");
        productManager.printProductReport(106);

        //        Product p2 = productManager.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
//        Product p3 = productManager.createProduct(103, "Cake", BigDecimal.valueOf(1.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
//        Product p4 = productManager.createProduct(105, "Cookie", BigDecimal.valueOf(3.99), Rating.TWO_STAR, LocalDate.now());
//        Product p5 = p3.applyRating(THREE_STAR);
//        Product p6 = productManager.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR);
//        Product p7 = productManager.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
//        Product p8 = p4.applyRating(FIVE_STAR);
//        Product p9 = p1.applyRating(TWO_STAR);
//        System.out.println(p7.equals(p6));
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//        System.out.println(p4);
//        System.out.println(p5);
//        System.out.println(p6);
//        System.out.println(p7);
//        System.out.println(p8);
//        System.out.println(p9);
    }

}
