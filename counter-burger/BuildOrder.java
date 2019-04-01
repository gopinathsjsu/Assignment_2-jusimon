public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
        order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        order.addChild(new Leaf("The Purist", 8.00 ));
        Composite customBurger = new Composite( "Build Your Own Burger" ) ;

        Burger burger = new Burger();
        Cheese cheese = new Cheese(burger);
        Toppings toppings = new Toppings(cheese);
        Premium premium = new Premium(toppings);
        Sauce sauce = new Sauce(premium);

        burger.setOptions("Beef, 1/3 lb on a Bun", 9.50 );
        cheese.setOptions("Danish Blue Cheese", 0.00 );
        cheese.setOptions("Horseradish Cheddar", 1.00 );
        toppings.setOptions("Bermuda Red Onion", 0.00 );
        toppings.setOptions("Black Olives", 0.00 );
        toppings.setOptions("Carrot Strings", 0.00 );
        toppings.setOptions("Coleslaw", 0.00 );
        premium.setOptions("Applewood Smoked Bacon", 1.50 );
        sauce.setOptions("Appricot Sauce", 0.00 );

        customBurger.addChild( sauce );

        order.addChild( customBurger );

        return order ;
    }

}


/*
Counter Burger Menu:
https://www.thecounter.com/menu/index.php
*/
