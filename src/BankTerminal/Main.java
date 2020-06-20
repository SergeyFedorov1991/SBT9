package BankTerminal;

public class Main {
    public static void main(String[] args) {
        TerminalImpl terminal = new TerminalImpl();

        terminal.showBalance();
        terminal.takeMoney(30);
        terminal.depositMoney(60);
        terminal.showBalance();

    }
}
