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
        if (balance >= money){
            balance -= money;
        } else
            System.out.println("Недостаточно средств");
        System.out.println("Выдача: " + money);
    }

    @Override
    public void depositMoney(double money) {
        balance += money;
        System.out.println("Внесено: " + money);
    }

}
