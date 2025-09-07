package practicequestions;

import java.util.ArrayList;

//Sorting with Comparator
//Create a class Product with fields name and price.
//Store multiple products in a List and sort them by price using a custom Comparator.
class Product implements Comparable<ProductA> {
    private String name;
    private int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(ProductA product2) {
        if (price == product2.getPrice()) {
            return 0;
        } else if (price < product2.getPrice()) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return name + " : " + price;
    }
}

public class Question20 {
    public static void main(String[] args) {
        ProductA shampoo = new ProductA("Shampoo", 12);
        ProductA conditioner = new ProductA("Conditioner", 10);
        ProductA serum = new ProductA("Serum", 20);
        ProductA baseColour = new ProductA("Base Colour", 35);
        ProductA towel = new ProductA("Towel", 6);

        ArrayList<ProductA> products = new ArrayList<>();
        products.add(shampoo);
        products.add(conditioner);
        products.add(serum);
        products.add(baseColour);
        products.add(towel);

        products.sort((product, product2) -> {
            if (product.getPrice() == product2.getPrice()) {
                return 0;
            } else if (product.getPrice() < product2.getPrice()) {
                return -1;
            } else {
                return 1;
            }
        });
        System.out.println(products);
    }
}
