package pl.coderslab.advanced.designpatterns.zad3;

public class AtmApi implements AtmInterface{
    private BankAccount bankAccount = new BankAccount();
    private Transfer transfer = new Transfer();
    private PhoneCard phoneCard = new PhoneCard();
    private Loan loan = new Loan();

    public void deposit(){this.bankAccount.deposit();}

    public void payout(){this.bankAccount.payout();}

    public void transferMoney(){this.transfer.transferMoney();}

    public void recharge(){this.phoneCard.recharge();}

    public void getLoan() {this.loan.getLoan();}

}
