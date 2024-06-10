package com.example;

import com.example.bill.Billing;
import com.example.bill.BillingImpl;
import com.example.pm.PriceMatrix;
import com.example.pm.PriceMatrix_v1;

public class Application {

    public static void main(String[] args) {

        // init
        PriceMatrix priceMatrixV1 = new PriceMatrix_v1();
        Billing billComp = new BillingImpl(priceMatrixV1);

        // use
        String[] cart = {"123", "234", "345"};
        double totalPrice = billComp.getTotalPrice(cart);
        System.out.println("Total: " + totalPrice);

        // destroy
        // ...

    }
}
