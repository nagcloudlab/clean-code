package com.example.bill;

//import com.example.pm.PriceMatrix_v1;

// Single Responsibility Principle ( we have )
// Open Closed Principle ( we have)
// Liskov Substitution Principle ( missing )
// Interface Segregation Principle ( we have )
// Dependency Inversion Principle ( we have)

import com.example.pm.PriceMatrix;

public class BillingImpl implements Billing {

    private PriceMatrix priceMatrix;

    public BillingImpl(PriceMatrix priceMatrix) {
        this.priceMatrix = priceMatrix;
    }

    @Override
    public double getTotalPrice(String[] cart) {
        double total = 0.0;
        //PriceMatrix_v1 priceMatrix = new PriceMatrix_v1();
        for (String item : cart) {
            total += priceMatrix.getPrice(item);
        }
        return total;
    }

}
