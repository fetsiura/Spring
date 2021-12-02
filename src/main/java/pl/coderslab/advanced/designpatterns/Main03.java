package pl.coderslab.advanced.designpatterns;

public class Main03 {

    public static void main(String[] args) {
        AtmApi atmApi = new AtmApi();
        atmApi.deposit();
        atmApi.payOut();
        atmApi.transferMoney();
        atmApi.recharge();
        atmApi.getLoan();
    }
}
