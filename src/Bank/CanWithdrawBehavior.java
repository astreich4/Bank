package bank;

public class CanWithdrawBehavior extends WithdrawBehavior {
    public CanWithdrawBehavior(Account account) {
        super(account);
    }

    @Override
    public void withdraw(double amount) {
        double commission = amount*Constants.getWithdrawalFeeFraction();
        if (amount >= 0 && account.getBalance() >= amount + commission){
            account.setBalance(account.getBalance() - amount - commission);
            account.getTransactions().add(new TransactionWithdrawal(Bank.getCurrentDate()));
            System.out.println(amount+" "+account.getCurrency() + " was withdrawn. Commission: "+
                    commission+" "+account.getCurrency());
            // TODO: give the manager the commission
        } else {
            System.out.println("Cannot withdraw");
        }
    }
}
