package PracticeMPPMidterm.Ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Product p1= new Product("Apple");
        Product p2= new Product("Orange");

        Product p3 = new Product("Cat");
        Product p4 = new Product("Dog");

        List<Product> productsFruit = new ArrayList<>();

        productsFruit.add(p1);
        productsFruit.add(p2);


        List<Product> productsAnimal = new ArrayList<>();
        productsAnimal.add(p3);
        productsAnimal.add(p4);

        Order o1= new Order("001",productsFruit);
        Order o2= new Order("002",productsAnimal);

        List<Order> orders= new ArrayList<>();
        orders.add(o1);
        orders.add(o2);

        Customer c = new Customer("john",orders);

//        Payment payment =new Payment("P001",o1);
//        Payment payment2 =new Payment("P002",o2);


        Customer c2 = new Customer("jame");
        Order o3 = new Order("005",null);
//        Order o4 = new Order();



    }

}
