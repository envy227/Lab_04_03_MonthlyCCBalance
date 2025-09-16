//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double balance = 5000.0;
        double rate = 0.17;

        double month1 = balance + (balance * rate);
        double month2 = month1 + (month1 * rate);

        System.out.println("Your starting balance is $" + balance);
        System.out.println("Your first month balance with 17% interest is $" + month1);
        System.out.println("Your second month balance with 17% interest is $" + month2);
        }
    }
