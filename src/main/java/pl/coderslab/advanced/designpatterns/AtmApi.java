package pl.coderslab.advanced.designpatterns;

public class AtmApi {

    private BankAccount bankAccount = new BankAccount();
    private Transfer transfer = new Transfer();
    private PhoneCard phoneCard = new PhoneCard();
    private Loan loan = new Loan();

    public void deposit() {
        bankAccount.deposit();
    }

    public void payOut() {
        bankAccount.payOut();
    }

    public void transferMoney() {
        transfer.transferMoney();
    }

    public void recharge() {
        phoneCard.recharge();
    }

    public void getLoan() {
        loan.getLoan();
    }
}
