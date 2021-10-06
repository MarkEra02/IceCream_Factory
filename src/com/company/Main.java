package com.company;

public class Main {

    public static void main(String[] args) {
        IceCreamFactory factory = new IceCreamFactory();

        IceCream chocolate = factory.getIceCream(IceCreamTypes.CHOCOLATE);
        IceCream strawberry = factory.getIceCream(IceCreamTypes.STRAWBERRY);
        IceCream pistachio = factory.getIceCream(IceCreamTypes.PISTACHIO);

        chocolate.made();
        strawberry.made();
        pistachio.made();
    }
}
