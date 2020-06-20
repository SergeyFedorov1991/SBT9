package BankTerminal;

public interface Terminal {

    //Проверить состояние счета
    double showBalance() throws TerminalException;

    //Снять деньги
    void takeMoney(double money) throws TerminalException;

    //Положить деньги
    void toDeposit(double money) throws TerminalException;

}
