package BankTerminal;

public class AccountIsLockedException extends Exception {

    public AccountIsLockedException(){ }

    public AccountIsLockedException(String message){
        super(message);
    }

}
