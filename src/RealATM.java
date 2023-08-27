public class RealATM implements ATM{
    @Override
    public String withdraw(CreditCard C) {

        return "Please enter the amount you would like to withdraw!";
    }

    @Override
    public String deposit(CreditCard C) {

        return "Please enter the amount you would like to deposit!";
    }

    @Override
    public String checkBalance(CreditCard C) {

        return "Current balance is XXXXXXX";
    }
}
