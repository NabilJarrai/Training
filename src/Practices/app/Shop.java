package Practices.app;

import Practices.data.Product;
import Practices.data.ProductManager;

import java.math.BigDecimal;
import java.util.Locale;

import static Practices.data.Rating.*;

/**
 * @author Nabil Jarrai
 * @since 12/9/2021
 */
public class Shop {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager(Locale.ITALY);

        Product p1 = productManager.createProduct(101, "Tea", BigDecimal.valueOf(1.99), NOT_RATED);
        productManager.printProductReport();
        p1 = productManager.reviewProduct(p1, FOUR_STAR, "Nice hot cup of tea");
        p1 = productManager.reviewProduct(p1, TWO_STAR, "Rather weak tea");
        p1 = productManager.reviewProduct(p1, FOUR_STAR, "Fine tea");
        p1 = productManager.reviewProduct(p1, FOUR_STAR, "Good tea");
        p1 = productManager.reviewProduct(p1, FIVE_STAR, "Perfect tea");
        p1 = productManager.reviewProduct(p1, THREE_STAR, "Just add some lemon");
        productManager.printProductReport();

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
