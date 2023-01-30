package exceptions.atm;

public class AtmApp {

    private static final Atm ATM = new Atm(1000d);

    public static void main(String[] args) {
        handleWithdraw(1000d);


    }

    public static void handleWithdraw(Double annount) {
        try {
            ATM.withdraw(annount);
        } catch (OutOfMoneyException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void hanldeGetDeposit(Double annount) {
        try {
            ATM.makeDeposit(annount);
        } catch (OutOfMoneyException e) {
            System.out.println(e.getMessage());
        }
    }

}
