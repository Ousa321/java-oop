//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import model.Account;
import model.CreditCardAccount;
import model.SavingAccount;

public class Main {
    public static void main(String[] args) {
        Account savingAccount = new SavingAccount();
        savingAccount.deposit(500.0);
        savingAccount.showBalance();

        Account creditCardAccount = new CreditCardAccount();
        creditCardAccount.deposit(100.0);
        creditCardAccount.showBalance();
    }
}