package PracticeMPPMidterm.Ecommerce;

public class Payment {

    private String paymentId;

    private Order order;

    public Payment(String paymentId, Order order){
        this.paymentId=paymentId;
        this.order=order;
    }

}
