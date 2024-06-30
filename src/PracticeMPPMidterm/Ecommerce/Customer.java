package PracticeMPPMidterm.Ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<Order> orders = new ArrayList<>();

    public Customer(String newName, List<Order> newOrder ){
        this.name = newName;
        this.orders = newOrder;
    }

    public Customer(String newName){
        this.name = newName;
    }


}
