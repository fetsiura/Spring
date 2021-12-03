package pl.coderslab.advanced.designpatterns.zad3;

public class Main {

    public static void main(String[] args) {


        AtmApi atmApi = new AtmApi();

        atmApi.deposit();
        atmApi.payout();
        atmApi.payout();
        atmApi.transferMoney();
        atmApi.recharge();
        atmApi.getLoan();

    }
}
