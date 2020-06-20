package BankTerminal;

public class TerminalServer {
    private double balance;

    public TerminalServer() {

    }

    public double showBalance() {
        System.out.println("Баланс: " + balance);
        return balance;
    }

    public void toDeposit(double money) {
        balance += money;
        System.out.println("Внесено: " + money);
    }

    public void takeMoney(double money) {

        if (balance >= money && money >= 0){
            balance -= money;
            System.out.println("Выдача: " + money);
        } else
            throw new IllegalArgumentException("Недостаточно средств");


    }


}
