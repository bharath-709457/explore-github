package com.codingshuttle.bharath.week1intro.IntrotoSpringBoot;

public class CakeBaker {
    private Frosting frost;
    private Syrup syrup;

    public CakeBaker(Frosting frost, Syrup syrup){
        this.frost = frost;
        this.syrup = syrup;
    }




    public void bakeCake() {
        System.out.println("Baking cake with " + frost.getFrostingType() + " and " + syrup.getSyrupType());
    }
}
