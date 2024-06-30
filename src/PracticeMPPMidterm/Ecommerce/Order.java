package PracticeMPPMidterm.Ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String id;

    private List<Product> product = new ArrayList<>();

    public Order(String newId, List<Product> newProduct){
        this.id=newId;
        this.product=newProduct;
    }

    public Order(String newId){
        this.id=newId;
    }

    public Order(){
    }

}
