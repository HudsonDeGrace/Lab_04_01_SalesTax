//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double price = 249.99;
        double salesTax = price * 0.05;
        double total = price + salesTax;
        System.out.println("Your total price is $" + total + ". Your sales tax was $" + salesTax + ".");
    }
}