package ChangeMaker;

import java.util.List;

public class Register {
    private static final List<Denomination> denom = List.of(
            new Denomination("Hundred Note", 100.0, "Bill", "Hundred.jpg"),
            new Denomination("Fifty Note", 50.0, "Bill", "Fifty.jpg"),
            new Denomination("Twenty Note", 20.0, "Bill", "Twenty.jpg"),
            new Denomination("Ten Note", 10.0, "Bill", "Ten.jpg"),
            new Denomination("Five Note", 5.0, "Bill", "Five.jpg"),
            new Denomination("One Note", 1.0, "Bill", "One.jpg"),
            new Denomination("Quarter", 0.25, "Coin", "Quarter.jpg"),
            new Denomination("Dime", 0.10,"Coin", "Dime.jpg"),
            new Denomination("Nickel", 0.05, "Coin", "Nickel.jpg"),
            new Denomination("Penny", 0.01, "Coin", "Penny.jpg"));


            public Purse makeChange(double amount) {
                Purse purse = new Purse();
                if (amount == 0.0) {
                    System.out.println("Empty Purse");
                }
                for (Denomination d : denom) {
                    while (amount >= d.amt()) {

                        if (amount >= d.amt()) {
                            purse.add(d, 1);
                            amount -= d.amt();
                        }
                        if (amount == 0.0) {
                            break;
                        }

                    }
                }
                return purse;
            }

    public static void main(String[] args) {
        Register register = new Register();
        Purse purse = register.makeChange(150.76);
        System.out.println(purse);
    }
}
