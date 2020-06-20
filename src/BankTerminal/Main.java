package BankTerminal;

public class Main {
    public static void main(String[] args) {
        TerminalImpl terminal = new TerminalImpl();

        terminal.showBalance();

        terminal.toDeposit(100);
        terminal.showBalance();

        terminal.takeMoney(30);
        terminal.showBalance();

        terminal.toDeposit(60);
        terminal.showBalance();


    }
}
