package creational.design.pattern.factory.simple.factory;

import creational.design.pattern.factory.simple.factory.concreteproduct.ChickenBurger;
import creational.design.pattern.factory.simple.factory.concreteproduct.FishBurger;
import creational.design.pattern.factory.simple.factory.concreteproduct.VegBurger;
import creational.design.pattern.factory.simple.factory.product.Burger;

public class BurgerFactory {

    public static Burger createBurger(String type){

        if(type == null){
            throw new IllegalArgumentException("Burger type can't be null");
        }

        return switch (type.toLowerCase()){
            case "veggie" -> new VegBurger();
            case "chicken" -> new ChickenBurger();
            case  "fish" -> new FishBurger();
            default -> throw new IllegalArgumentException("Unknown burger type: " + type);
        };
    }
}
