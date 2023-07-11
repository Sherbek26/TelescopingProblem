// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Pizza order1 = new Pizza.Builder("Thin",18)
                .addMushroom(true)
                .addChili(true)
                .addKetchup(true)
                .makeOrder();
        System.out.println(order1.toString());
    }
}