package com.goosemagnet.template.caffeinebeverage;

public class CaffeineBeverageTestDrive {

    public static void main(String[] args) {
        Tea myTea = new Tea();
        myTea.prepareRecipe();

        System.out.println();

        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
