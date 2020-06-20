package BankTerminal;

public interface Terminal {

    //Проверить состояние счета
    double showBalance();

    //Снять деньги
    void takeMoney(double money);

    //Положить деньги
    void depositMoney(double money);

}
