package BankTerminal;


public class TerminalImpl implements Terminal {
    private final TerminalServer server;
    private final PinValidator pinValidator;

    public TerminalImpl() {
        this.server = new TerminalServer();
        this.pinValidator = new PinValidator();
    }


    @Override
    public double showBalance() {
        return server.showBalance();
    }

    @Override
    public void takeMoney(double money) {
        server.takeMoney(money);
    }

    @Override
    public void toDeposit(double money) {
        server.toDeposit(money);
    }

}
