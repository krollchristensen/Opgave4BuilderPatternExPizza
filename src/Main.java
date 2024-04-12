/*
Mål: Design og implementer en PizzaBuilder klasse, der anvender Builder-mønsteret
for at lette oprettelsen af forskellige pizza-objekter.

Builder Pattern er ideelt til situationer, hvor du har et objekt med mange parametre,
 nogle af hvilke kan være valgfrie. Det forenkler konstruktionen af sådanne objekter
 ved at adskille konstruktionen fra repræsentationen.
 */



public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder()
                .size("medium")
                .addTopping("Mushrooms")
                .addTopping("Pepperoni")
                .cheese(true)
                .build();
        System.out.println(pizza);

        Pizza pizza1 = new Pizza.PizzaBuilder()
                .size("Small")
                .addTopping("Bacon")
                .addTopping("Pepperoni")
                .addTopping("Meat")
                .cheese(false)
                .build();
        System.out.println(pizza1);
    }



}
