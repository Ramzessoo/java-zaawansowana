package pattern.creational.prototype;

import java.util.List;

public class PrototypeDemoApp {
    public static void main(String[] args) {
        ShoppingList original = new ShoppingList();

        try {
            ShoppingList shoppingListForMonday = (ShoppingList) original.clone();
            List<String> mondayList = shoppingListForMonday.getShoppings();
            mondayList.remove("pomidory");
            mondayList.add("mleko");
            shoppingListForMonday.setShoppings(mondayList);
            System.out.println("Monday shopping");
            shoppingListForMonday.getShoppings().forEach(System.out::println);
            System.out.println("=================");
            ShoppingList shoppingListForFriday = (ShoppingList) original.clone();
            List<String> fridayList = shoppingListForFriday.getShoppings();
            fridayList.remove("chleb");
            fridayList.add("martini");
            fridayList.add("gin");
            fridayList.add("sok pomidorowy");
            shoppingListForFriday.setShoppings(fridayList);
            System.out.println("Friday shopping");
            shoppingListForFriday.getShoppings().forEach(System.out::println);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
