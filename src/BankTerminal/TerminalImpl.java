package BankTerminal;

public class TerminalImpl implements Terminal {
    private double balance = 100.0;

    @Override
    public double showBalance() {
        return balance;
    }

    @Override
    public void takeMoney(double money) {


    }

    @Override
    public void depositMoney(double money) {

    }

}
