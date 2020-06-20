package BankTerminal;

public class TerminalServer {
    private double balance;

    public double showBalance() {
        System.out.println("Баланс: " + balance + "\n");
        return balance;
    }

    public void toDeposit(double money) {

        if(money % 100 == 0){
            balance += money;
            System.out.println("Внесено: " + money);
        } else
            System.out.println("Принимаются купюры номиналом не менее 100 рублей");

    }

    public void takeMoney(double money) {

        if (balance <= money){
            throw new IllegalArgumentException("Недостаточно средств");
        } else if (money < 0){
            throw new IllegalArgumentException("Сумма внесения должна быть положительной");
        } else if (money % 100 == 0){
            balance -= money;
            System.out.println("Выдача: " + money);
        } else {
            System.out.println("Принимаются купюры номиналом не менее 100 рублей");
        }

    }


}
