package BankTerminal;


public class TerminalImpl implements Terminal {
    private double balance = 100.0;

    @Override
    public double showBalance() {
        System.out.println("Баланс: " + balance);
        return balance;
    }

    @Override
    public void takeMoney(double money) {

        if (balance >= money && money >= 0){
            balance -= money;
            System.out.println("Выдача: " + money);
        } else
            throw new IllegalArgumentException("Недостаточно средств");


    }

    @Override
    public void depositMoney(double money) {
        balance += money;
        System.out.println("Внесено: " + money);
    }

}
